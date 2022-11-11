package GraficosSwing;
import javax.swing.*;
import javax.swing.event.*;
import javax.swing.text.Document;

import java.awt.*;
public class PruebaJTextField {

	public static void main(String[] args) {
		
		Marco elmarco = new Marco();
	}
	
	public static class Marco extends JFrame{
		public Marco(){
			setBounds(0,50,400,400);
			setTitle("Prueba JTextField");
			setVisible(true);
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			lamina milamina= new lamina();
			add(milamina);
		}
	}
	public static class lamina extends JPanel{
		JTextField usuario= new JTextField(20);
		public lamina () {
			
			escuchatexto elevento = new escuchatexto();
			Document midoc= usuario.getDocument();
			midoc.addDocumentListener(elevento);
			add(usuario);
		}
	private class escuchatexto implements DocumentListener{

		@Override
		public void changedUpdate(DocumentEvent arg0) {
			// TODO Auto-generated method stub
			System.out.println("has cambiado el texto xD");
		}

		@Override
		public void insertUpdate(DocumentEvent arg0) {
			// TODO Auto-generated method stub
			System.out.println("has insertado texto");
		}

		@Override
		public void removeUpdate(DocumentEvent arg0) {
			// TODO Auto-generated method stub
			System.out.println("has borrado texto");
		}
		
	}
	}
}
