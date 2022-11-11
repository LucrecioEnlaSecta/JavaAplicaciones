package GraficosSwing;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.event.*;
public class EventosTeclado {

	public static void main(String[] args) {
	MarcoConTeclas miMarco= new MarcoConTeclas();
	

	}

}
class MarcoConTeclas extends JFrame{
	MarcoConTeclas(){
		setVisible(true);
		setBounds(0,100,500,500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("MarcoConEventosDeTeclado");
		EventoDeTeclado tecla=new EventoDeTeclado();
		addKeyListener(tecla);
	}
}
class EventoDeTeclado implements KeyListener{

	
	public void keyPressed(KeyEvent e) {
		int codigo = e.getKeyCode();
		System.out.println(codigo);
	}
	public void keyReleased(KeyEvent e) {
	
	}
	public void keyTyped(KeyEvent e) {
			System.out.println(e.getKeyChar());
	}
	
}