package sockets;

import javax.swing.*;
import java.awt.event.*;
import java.io.*;
import java.io.IOException;
import java.awt.*;
import java.net.*;

public class Cliente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		MarcoCliente mimarco=new MarcoCliente();
		
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}
	
}


class MarcoCliente extends JFrame{
	
	public MarcoCliente(){
		
		setBounds(600,300,280,350);
				
		LaminaMarcoCliente milamina=new LaminaMarcoCliente();
		
		add(milamina);
		
		setVisible(true);
		}	
	
}
//Envio de señal "Online" para servidor
class enviaOnline extends WindowAdapter{
	public void windowOpened(WindowEvent e) {
		try{
				Socket misocket=new Socket("192.168.0.9",999);
				
				paqueteEnvio datos=new paqueteEnvio();
				
				datos.setMensaje("Online");
				
				ObjectOutputStream paqueteDatos=new ObjectOutputStream(misocket.getOutputStream());
			
				paqueteDatos.writeObject(datos);
				
				paqueteDatos.close();
				
				misocket.close();
		}catch(IOException i){
			i.printStackTrace();
		}
	}
}



class LaminaMarcoCliente extends JPanel{
	
	public LaminaMarcoCliente(){
		
		String nombre=JOptionPane.showInputDialog("Introduce tu nombre");
		
		JLabel n_nick=new JLabel("Nick: ");
		
		add(n_nick);
		
		nick=new JLabel(nombre);
		
		add(nick);
		
		JLabel texto=new JLabel("Online:");
		
		add(texto);
		
		ip=new JComboBox();
		
		ip.addItem("Usuario 1");
		
		ip.addItem("Usuario 2");
		
		ip.addItem("Usuario 3");
		
		//ip=new JTextField(8);
		
		add(ip);
		
		campochat=new JTextArea(12,20);
		
		add(campochat);
	
		campo1=new JTextField(20);
	
		add(campo1);		
	
		miboton=new JButton("Enviar");
		
		add(miboton);	
		
		enviaTexto enviarA=new enviaTexto();
		
		miboton.addActionListener(enviarA);
		
		Thread hiloVuelta=new Thread(enviarA);
		
		hiloVuelta.start();
		
	}
	private class enviaTexto implements ActionListener, Runnable{
		
		
		public void actionPerformed(ActionEvent arg0) {
			System.out.println(campo1.getText());
			
			try {
			
			Socket misocket=new Socket("192.168.0.9",9090);
			
			paqueteEnvio datos=new paqueteEnvio();
			
			datos.setNick(nick.getText());
			
			datos.setIp((String)ip.getSelectedItem());
			
			datos.setMensaje(campo1.getText());
			
			ObjectOutputStream datosUsuario=new ObjectOutputStream(misocket.getOutputStream());
			
			datosUsuario.writeObject(datos);
			
			campochat.append("\n"+"Yo: "+datos.getMensaje());
			
			campo1.setText(null);
			
			misocket.close();
			
			
			/*DataOutputStream flujoDeSalida=new DataOutputStream(misocket.getOutputStream());
			
			flujoDeSalida.writeUTF(campo1.getText());
			
			flujoDeSalida.close();*/
			
			
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		}
		@Override
		public void run() {
			
				try {
					ServerSocket servidorCliente=new ServerSocket(999);
					
					Socket cliente;
					
					paqueteEnvio paqueteRecibido;
					while(true) {
						
					cliente=servidorCliente.accept();
					
					ObjectInputStream mensajesEntrada=new ObjectInputStream(cliente.getInputStream());
					
					paqueteRecibido=(paqueteEnvio) mensajesEntrada.readObject();
					
					campochat.append("\n"+paqueteRecibido.getNick()+": "+paqueteRecibido.getMensaje());
					
					servidorCliente.close();
					}
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (ClassNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				
				
			
			
		}

		
		
	}
	
	private JTextArea campochat;
	
	private JTextField campo1;
	private JComboBox ip;
	private JLabel nick;
	
	private JButton miboton;
	
}
class paqueteEnvio implements Serializable{
	private String nick,ip,mensaje;

	public String getNick() {
		return nick;
	}

	public void setNick(String nick) {
		this.nick = nick;
	}

	public String getIp() {
		return ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

	public String getMensaje() {
		return mensaje;
	}

	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}
}