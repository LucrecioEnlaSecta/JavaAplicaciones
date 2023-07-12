package GraficosSwing;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;

public class EventosMouse {

	public static void main(String[] args) {
		MarcoMouse miMarco=new MarcoMouse();
		
	}

}
class MarcoMouse extends JFrame {
	public MarcoMouse() {
		setVisible(true);
		setBounds(0,100,400,400);
		setTitle("Eventos con el mouse");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Eventomouse click=new Eventomouse();
		addMouseListener(click);
	} 
}
class Eventomouse extends MouseAdapter{
	public void mouseClicked(MouseEvent e) {
		//System.out.println("hiciste un click BRo");
		System.out.println(e.getClickCount());
	}
	public void mousePressed(MouseEvent e) {
		System.out.println(e.getModifiersEx());
	}
}
/*class EventoMouse implements MouseListener { De esta manera tenemos que implementar todos los metodos de la interfaz
	public void mouseClicked(MouseEvent e) {
		System.out.println("has terminado de hacer el click Bro");
	}


	public void mouseEntered(MouseEvent arg0) {
	
		System.out.println("acabas de entrar con el puntero al programa");
	}

	
	public void mouseExited(MouseEvent arg0) {
		System.out.println("Acabas de salir con el puntero del programa");
		
	}

	
	public void mousePressed(MouseEvent arg0) {
	System.out.println("Acabas de presionar un boton del mouse");
		
	}

	
	public void mouseReleased(MouseEvent arg0) {
		System.out.println("Acabasde levantar el dedo del mouse");
		
	}
}*/