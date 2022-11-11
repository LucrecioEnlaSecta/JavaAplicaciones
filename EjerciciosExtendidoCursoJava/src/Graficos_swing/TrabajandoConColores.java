package graficos_swing;
import java.awt.*;
import java.awt.geom.*;
import javax.swing.*;
public class TrabajandoConColores {
			public static void main(String[] args) {
				MarcoConDibujoss miMarco = new MarcoConDibujoss();
				

			}
		}
class MarcoConDibujoss extends JFrame{
	public MarcoConDibujoss(){
		setBounds(100,100,400,400);
		setVisible(true);
		setTitle("Marco de Lucas");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		LaminaDelMarco miLaminna=new LaminaDelMarco();
		add(miLaminna);
		

	}
}
class LaminaDelMarco extends JPanel{
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		Graphics2D g2d=(Graphics2D)g;
		Rectangle2D miRec=new Rectangle2D.Double(50,50,200,150);
		g2d.draw(miRec);
		g2d.setColor(Color.black);
		g2d.fill(miRec);
		Ellipse2D miEli=new Ellipse2D.Double();
		miEli.setFrame(miRec);
		g2d.setColor(Color.BLUE);
		g2d.fill(miEli);
		
		
	}
	
	
}