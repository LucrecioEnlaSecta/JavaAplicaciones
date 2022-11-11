package GraficosSwing;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;
import javax.swing.JFrame;
import javax.swing.JPanel;
public class ProbandoFuentes {
		public static void main(String[] args) {
			MarcoConDibujos marco1=new MarcoConDibujos();
		}
	}
	class MarcoConDibujos extends JFrame{
		 public MarcoConDibujos(){
			 setBounds(200,200,800,400);
			 setTitle("El marco para probar Fuentes de Lucas");
			 setVisible(true);
			 LaminaConFiguras miLamina = new LaminaConFiguras();
			 add(miLamina);
			 miLamina.setForeground(Color.GREEN);
		 }
	}
	class LaminaConFiguras extends JPanel{
		public void paintComponent(Graphics g){
			super.paintComponent(g);
			Graphics2D g2 = (Graphics2D) g;
			Font miFuente = new Font("Courier", Font.BOLD,26);
			g2.setFont(miFuente);
			g2.drawString("Que el ruido mental no te domine y saque la vida", 0, 200);
			g2.drawString("Concentrate en el Ahora", 0, 100);
			
		}
	}
