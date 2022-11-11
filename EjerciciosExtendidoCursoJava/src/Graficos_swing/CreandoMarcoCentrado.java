package graficos_swing;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.*;
public class CreandoMarcoCentrado {

	public static void main(String[] args) {
		marcoCentrado Marco1 = new marcoCentrado();

	}

}
class marcoCentrado extends JFrame{ 
	public marcoCentrado() {
		Toolkit CajaDeHerramientasPantalla=Toolkit.getDefaultToolkit();
		Dimension miPantalla = CajaDeHerramientasPantalla.getScreenSize();
		int alturaPantalla=miPantalla.height;
		int anchoPantalla=miPantalla.width;
		setVisible(true);
		setBounds(anchoPantalla/4,alturaPantalla/4, anchoPantalla/2, alturaPantalla/2 );
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("La ventana de lucas");
		setResizable(false);
		Image miIcono=CajaDeHerramientasPantalla.getImage("src/graficos_swing/download.gif");
		setIconImage(miIcono);
	}
	
}
