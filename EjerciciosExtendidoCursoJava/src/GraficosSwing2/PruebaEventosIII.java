package GraficosSwing;
import java.awt.event.*;
import javax.swing.*;
import java.awt.*;

public class PruebaEventosIII {

	public static void main(String[] args) {
		MarcoBotones miMarco=new MarcoBotones();
		

	}

}
class MarcoBotones extends JFrame {
	MarcoBotones (){
		setBounds(0,0,1000,700);
		setVisible(true);
		setTitle("MarcoConBotones");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Toolkit objIcon= Toolkit.getDefaultToolkit();
		LaminaBotones miLamina= new LaminaBotones();
		add(miLamina);
		Image miIcono = objIcon.getImage("C:\\\\Users\\\\lucas\\\\eclipse-workspace\\\\CursoPildoras/src/graficos_swing/download.gif");
		setIconImage(miIcono);
	}
}
class LaminaBotones extends JPanel{
	JButton botonAzul=new JButton("Background blue BReo");
	JButton botonVerde = new JButton("Background green BReo");
	JButton botonRojo = new JButton("Background red BReo");
	
		public void LaminaBotones(){
			add(botonAzul);
			add(botonRojo);
			add(botonVerde);
			colorFondo Azul = new colorFondo(Color.blue);
			colorFondo Rojo = new colorFondo(Color.red);
			colorFondo Verde= new colorFondo(Color.green);
			botonRojo.addActionListener(Rojo);
			botonVerde.addActionListener(Verde);
			botonAzul.addActionListener(Azul);
		}
		private class colorFondo implements ActionListener{
			public colorFondo(Color c) {
				colorDeFondo=c;
			}
			private Color colorDeFondo;
			public void actionPerformed(ActionEvent e) {
				setBackground(colorDeFondo);
			}
		}
}


