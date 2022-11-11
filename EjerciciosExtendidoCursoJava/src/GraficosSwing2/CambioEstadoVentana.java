package GraficosSwing;
import javax.swing.*;
import javax.swing.event.*;
import java.awt.event.*;
import java.awt.Frame;
public class CambioEstadoVentana {

	public static void main(String[] args) {
		MarcoEstado miMarco=new MarcoEstado();
		

	}

}
class MarcoEstado extends JFrame {
	public MarcoEstado(){
		setVisible(true);
		setBounds(0,50,400,400);
		CambioEstado nuevoEstado=new CambioEstado();
		addWindowStateListener(nuevoEstado);
	}
}
class CambioEstado implements WindowStateListener {
	public void windowStateChanged(WindowEvent e) {
		//System.out.println("La ventana ha cambiado de estado");
		//System.out.println(e.getNewState());
		if(e.getNewState()==6) {
			System.out.println("La ventana se ha maximizado");
		}
	}
}