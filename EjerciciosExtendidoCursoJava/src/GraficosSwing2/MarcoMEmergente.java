package GraficosSwing;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
public class MarcoMEmergente {

	public static void main(String[] args) {
		marcoEmergente mimarco=new marcoEmergente();
		
	}

}
class marcoEmergente extends JFrame{
	public marcoEmergente() {
		setBounds(100,100,400,400);
		setTitle("MenuEmergente");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		laminaEmergente milamina=new laminaEmergente();
		add(milamina);
	}
}
class laminaEmergente extends JPanel{
	public laminaEmergente(){
		JPopupMenu emergente=new JPopupMenu();
		JMenuItem opcion1=new JMenuItem("Opcion1");
		emergente.add(opcion1);
		setComponentPopupMenu(emergente);
	}
}