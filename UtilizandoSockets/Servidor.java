package sockets;

import javax.swing.*;

import java.awt.*;
import java.io.*;
import java.net.*;
public class Servidor  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MarcoServidor mimarco=new MarcoServidor();
		
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
	}	
}

class MarcoServidor extends JFrame implements Runnable {
	
	public MarcoServidor(){
		
		setBounds(1200,300,280,350);				
			
		JPanel milamina= new JPanel();
		
		milamina.setLayout(new BorderLayout());
		
		areatexto=new JTextArea();
		
		milamina.add(areatexto,BorderLayout.CENTER);
		
		add(milamina);
		
		setVisible(true);
		
		Thread hiloTexto=new Thread(this);
		
		hiloTexto.start();
		
		setVisible(true);
		
		}
	
	private	JTextArea areatexto;

	@Override
	public void run() {
		try {
		ServerSocket servidor=new ServerSocket(9090);
		
		paqueteEnvio paquete_recibido;
		
		String nick,ip,mensaje;
		
		while(true) {
			
		Socket misocket=servidor.accept();
		
		
		
		ObjectInputStream flujoEntrada=new ObjectInputStream(misocket.getInputStream());
		
		paquete_recibido=(paqueteEnvio)flujoEntrada.readObject();
		
	/*	DataInputStream flujoDeEntrada=new DataInputStream(misocket.getInputStream());
		
		String mensajeTexto=flujoDeEntrada.readUTF();
		
		areatexto.append("\n"+ mensajeTexto);*/
		
		
		nick=paquete_recibido.getNick();
		
		mensaje=paquete_recibido.getMensaje();
		
		ip=paquete_recibido.getIp();
		
		areatexto.append("\n"+nick+": "+mensaje+" para"+ip);
		
		Socket enviaDestinatario=new Socket(ip,999);
		
		ObjectOutputStream paqueteReenvio=new ObjectOutputStream(enviaDestinatario.getOutputStream());
		
		paqueteReenvio.writeObject(paquete_recibido);
		
		paqueteReenvio.close();
		
		enviaDestinatario.close();
		
		misocket.close();
		
		}
		}catch(IOException e) {
		
			System.out.println("No se ha podido establecer la conexion entre sockets");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
			System.out.println("se ha establecido la conexion");
	}}
	