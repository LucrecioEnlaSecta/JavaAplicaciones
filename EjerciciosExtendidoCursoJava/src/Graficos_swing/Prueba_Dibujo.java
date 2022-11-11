package graficos_swing;
import java.awt.*;
import java.awt.geom.*;
import javax.swing.*;
public class Prueba_Dibujo {

	public static void main(String[] args) {
		MarcoConDibujos miMarco = new MarcoConDibujos();
		

	}

}
class MarcoConDibujos extends JFrame{
	 public MarcoConDibujos(){
		 setBounds(200,200,400,400);
		 setTitle("El marco con dibujo de Lucas");
		 setVisible(true);
		 setDefaultCloseOperation(EXIT_ON_CLOSE);
		 LaminaConFiguras miLamina = new LaminaConFiguras();
		 add(miLamina);
		 miLamina.setBackground(Color.black);
	 }
 } 
class LaminaConFiguras extends JPanel{
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		/*g.drawRect(50, 50, 200, 200);
		g.drawLine(20, 20, 200, 20);
		g.drawArc(200, 10, 30, 100, 30, 100);*/
		Graphics2D g2 = (Graphics2D) g;
		Rectangle2D miRect = new Rectangle2D.Double(100,100,200,150);
		g2.draw(miRect);
		Ellipse2D miEli=new Ellipse2D.Double();
		miEli.setFrame(miRect);
		g2.draw(miEli);
		g2.draw(new Line2D.Double(100, 100, 300, 250));
		double centerX = miRect.getCenterX();
		double centerY = miRect.getCenterY();
		double radio=150;
		Ellipse2D circulo = new Ellipse2D.Double();
		circulo.setFrameFromCenter(centerX, centerY, centerX+radio,centerY+radio );
		g2.draw(circulo);
				}
}