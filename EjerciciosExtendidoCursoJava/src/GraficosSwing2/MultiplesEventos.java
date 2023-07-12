package GraficosSwing;

import javax.swing.*;

import java.awt.*;
import java.awt.event.*;

public class MultiplesEventos {

	public static void main(String[] args) {
		MarcoAccion miMarco=new MarcoAccion();
	}

}
class MarcoAccion extends JFrame{
	public MarcoAccion(){
		setVisible(true);
		setBounds(5,0,1200,900);
		setTitle("MarcoAccion");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		PanelAccion miLamina=new PanelAccion();
		add(miLamina);
	}
}
class PanelAccion extends JPanel{
	public PanelAccion() {
		Action rojo=new Action("rojo", new ImageIcon("race-car.gif"),Color.red);
		Action amarillo=new Action("amarillo", new ImageIcon("tenor.gif"), Color.yellow);
		Action Verde=new Action("Verde", new ImageIcon("C://Users//lucas//eclipse-workspace//CursoPildoras/src/graficos_swing/download.gif"),Color.green);
		add(new JButton(rojo));
		add(new JButton(amarillo));
		add(new JButton(Verde));
		/*JButton Rojo=new JButton("Rojo");
		JButton amarillo=new JButton("amarillo");
		JButton verde=new JButton("Verde");
		add(Rojo);
		add(amarillo);
		add(verde);*/
		InputMap mapaentrada=getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		mapaentrada.put(KeyStroke.getKeyStroke("ctrl A"), "Fondo_Amarillo");
		mapaentrada.put(KeyStroke.getKeyStroke("ctrl B"), "Fondo_Verde");
		mapaentrada.put(KeyStroke.getKeyStroke("ctrl R"), "Fondo_Rojo");
		ActionMap mapaAccion=getActionMap();
		mapaAccion.put("Fondo_Amarillo", amarillo);
		mapaAccion.put("Fondo_Verde",Verde );
		mapaAccion.put("Fondo_Rojo", rojo);
		
	}
	class Action extends AbstractAction{
		public Action(String nombre, Icon icono, Color color_boton){
			putValue(Action.NAME, nombre);
			putValue(Action.SMALL_ICON, icono);
			putValue(Action.SHORT_DESCRIPTION, "Poner la lamina de color "+nombre);
			putValue("color_de_fondo", color_boton);
		}
		public void actionPerformed(ActionEvent e) {
			Color color=(Color) getValue("color_de_fondo");
			setBackground(color);
		}
	}
}
