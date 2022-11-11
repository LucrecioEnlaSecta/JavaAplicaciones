package GraficosSwing;
import java.awt.event.*;
import javax.swing.JFrame;
public class FocoEventoVentana extends JFrame implements WindowFocusListener{

	public static void main(String[] args) {
		FocoEventoVentana miMarco=new FocoEventoVentana();
		miMarco.iniciar();
		

	}
	public void iniciar() {
		marco1 = new FocoEventoVentana();
		marco2 = new FocoEventoVentana();
		marco1.setVisible(true);
		marco2.setVisible(true);
		marco1.setBounds(10, 100, 300, 250);
		marco2.setBounds(400,100,300,250);
		marco1.setDefaultCloseOperation(EXIT_ON_CLOSE);
		marco2.setDefaultCloseOperation(EXIT_ON_CLOSE);
		marco1.addWindowFocusListener(this);
		marco2.addWindowFocusListener(this);
		
	}
	@Override
	public void windowGainedFocus(WindowEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==marco1) {
			marco1.setTitle("Tengo el Foco!");
		}else {
			marco2.setTitle("Tengo el Foco");
		}
	}

	@Override
	public void windowLostFocus(WindowEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==marco1) {
			marco1.setTitle("");
		}else {
			marco2.setTitle("");
		}
	}
	FocoEventoVentana marco1;
	FocoEventoVentana marco2;
}
