package GraficosSwing;

import javax.swing.JFrame;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;

public class menuEmergente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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