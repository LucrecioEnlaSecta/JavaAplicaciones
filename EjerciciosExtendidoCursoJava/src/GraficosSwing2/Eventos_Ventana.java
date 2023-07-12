package GraficosSwing;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Eventos_Ventana {

	public static void main(String[] args) {
		MarcoVentana miMarco=new MarcoVentana();
		MarcoVentana miMarco2=new MarcoVentana();
		miMarco.setTitle("Marco1");
		miMarco2.setTitle("Marco2");
		miMarco.setBounds(5, 100, 500, 300);
		miMarco2.setBounds(600, 100, 500, 300);
		miMarco.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		miMarco2.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	}

}
class MarcoVentana extends JFrame {
	MarcoVentana(){
		//setBounds(10,10,1000,700);
		setVisible(true);
		//setTitle("MarcoVentana");
		//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		M_Ventana oyenteVentana=new M_Ventana();
		addWindowListener(oyenteVentana);
		
	}
}// Si no queremos implementar estos 7 metodos, podemos heredar de la clase "WindowAdapter" en vez de implementar "WindowListener"
// De esta manera podemos implementar solo los metodos que queramos 
class M_Ventana implements WindowListener{
		public void windowActivated(WindowEvent e) {System.out.println("La ventana esta activada");}
		public void windowClosed(WindowEvent e) {}
		public void windowClosing(WindowEvent e) {JOptionPane.showMessageDialog(null, "Seguro que quiere cerrar la ventana?");}
		public void windowDeactivated(WindowEvent e) {System.out.println("la ventana se desactivo");}
		public void windowDeiconified(WindowEvent e) {System.out.println("Se volvio a abrir la ventana");}
		public void windowIconified(WindowEvent e) {System.out.println("Ventana Minimizada");}
		public void windowOpened(WindowEvent e) {System.out.println("Abriste la ventana");}
}