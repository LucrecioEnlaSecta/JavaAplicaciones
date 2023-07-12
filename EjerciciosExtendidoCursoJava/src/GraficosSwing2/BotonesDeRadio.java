package GraficosSwing;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class BotonesDeRadio {

	public static void main(String[] args) {
		MarcoRadio mimarco = new MarcoRadio();

	}

}
class MarcoRadio extends JFrame{
	MarcoRadio(){
		setTitle("Marco para probar botones de radio");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		setBounds(500,300,500,350);
		LaminaRadio milamina= new LaminaRadio();
		add(milamina);
		
	}
}
class LaminaRadio extends JPanel{
	public LaminaRadio(){
	ButtonGroup migrupodeBotones = new ButtonGroup();
	ButtonGroup Genero = new ButtonGroup();
	
	JRadioButton boton1 = new JRadioButton("azul", false);
	JRadioButton boton2 = new JRadioButton("rojo",true);
	JRadioButton boton3 = new JRadioButton("verde",false);
	JRadioButton boton4 = new JRadioButton("masculino",false);
	JRadioButton boton5 = new JRadioButton("femenino",false);
	migrupodeBotones.add(boton1);
	migrupodeBotones.add(boton2);
	migrupodeBotones.add(boton3);
	Genero.add(boton4);
	Genero.add(boton5);
	add(boton1);
	add(boton2);
	add(boton3);
	add(boton4);
	add(boton5);
	
	
	
	}
}