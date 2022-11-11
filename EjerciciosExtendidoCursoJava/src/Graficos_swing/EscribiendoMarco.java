package graficos_swing;
import java.awt.*;
import javax.swing.*;
public class EscribiendoMarco {

	public static void main(String[] args) {
		marcoConTexto marco1 = new marcoConTexto();
		marco1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		

	}

}
class marcoConTexto extends JFrame {
	public marcoConTexto() {
		setVisible(true);
		setBounds(400,200,600,450);
		setTitle("Marco Con Lamina");
		Lamina miLamina = new Lamina();
		add(miLamina);
	}
}
class Lamina extends JPanel {
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawString("El poder del ahora es todo lo que tenemos", 100, 100);
		
	}
}