package GraficosSwing;
import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

import java.awt.*;
import javax.swing.text.Document;
public class campoPassword {

	public static void main(String[] args) {
		MarcoPassword mimarco = new MarcoPassword();

	}

}
class MarcoPassword extends JFrame{
	public MarcoPassword() {
		setBounds(400,300,550,400);
		setVisible(true);
		setTitle("Proyectoide");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		LaminaPassword milamina = new LaminaPassword();
		add(milamina);
	}
}
class LaminaPassword extends JPanel{
	
	JPasswordField contrase�a = new JPasswordField(15);
	LaminaPassword(){
		setLayout(new BorderLayout());
		JPanel lamina_superior = new JPanel();
		lamina_superior.setLayout(new GridLayout(2,2));
		add(lamina_superior,BorderLayout.NORTH);
		JLabel etiqueta1 = new JLabel("Usuario: ");
		JLabel etiqueta2 = new JLabel("Contrase�a: ");
		JTextField usuario = new JTextField(15);
		
		doc doci = new doc();
		//Document midoc = contrase�a.getDocument();
		contrase�a.getDocument().addDocumentListener(doci);
		//midoc.addDocumentListener(doci);
		lamina_superior.add(etiqueta1);
		lamina_superior.add(usuario);
		lamina_superior.add(etiqueta2);
		lamina_superior.add(contrase�a);
		JButton botonenviar = new JButton("enviar");
		add(botonenviar, BorderLayout.SOUTH);
		
		
		
		
		
	}
	private class doc implements DocumentListener{
		
		
		public void changedUpdate(DocumentEvent arg0) {
			
			
		}

		@Override
		public void insertUpdate(DocumentEvent arg0) {
			
			char[] contrasena;
			contrasena = contrase�a.getPassword();
			if(contrasena.length<8 || contrasena.length>12) {
				contrase�a.setBackground(Color.red);
			}else {
				contrase�a.setBackground(Color.WHITE);
			}
			
		}

		@Override
		public void removeUpdate(DocumentEvent arg0) {
			// TODO Auto-generated method stub
			
		}
		
	}
}