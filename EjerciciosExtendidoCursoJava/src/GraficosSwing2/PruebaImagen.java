package GraficosSwing;

import java.awt.*;
import java.io.File;
import java.io.IOException;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.imageio.*;
public class PruebaImagen {

	public static void main(String[] args) {
		MarcoImagen miMarco = new MarcoImagen();
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}
class MarcoImagen extends JFrame {
	MarcoImagen(){
		setTitle("AmalliroMarks");
		setBounds(50,50,1000,500);
		setVisible(true);
		LaminaConImagen milamina=new LaminaConImagen();
		add(milamina);
		Toolkit CajaDeHerramientasPantalla=Toolkit.getDefaultToolkit();
		Image miIcono= CajaDeHerramientasPantalla.getImage("C:\\Users\\lucas\\eclipse-workspace\\CursoPildoras/src/graficos_swing/download.gif");
		setIconImage(miIcono);
		
	}
}
class LaminaConImagen extends JPanel {
	private Image imagen;
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		File miimagen=new File("imagg.png");
		try{
			imagen= ImageIO.read(miimagen);
		}catch(IOException e) {
			System.out.println("La imagen no se encuentra");
		}
		int anchoImagen=imagen.getWidth(this);
		int altoImagen=imagen.getHeight(this);
		g.drawImage(imagen, 0, 0, null);
		for(int i=0;i<100;i++) {
		for(int j=0;j<100;j++) {
			g.copyArea(0, 0, anchoImagen, altoImagen, anchoImagen*i, altoImagen*j);
		}
		}
	}

}


