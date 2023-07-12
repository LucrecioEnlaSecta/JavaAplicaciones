package GraficosSwing;
import java.awt.event.*;
import javax.swing.*;
import java.awt.*;

public class PruebaEventos {

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
class LaminaBotones extends JPanel implements ActionListener {
	JButton botonAzul=new JButton("Background blue BReo");
	JButton botonVerde = new JButton("Background green BReo");
	JButton botonRojo = new JButton("Background red BReo");
	
	public void actionPerformed(ActionEvent e){
		Object botonPulsado=e.getSource();
		
		if(botonPulsado==botonAzul) {
			setBackground(Color.blue);
		}
		else if(botonPulsado==botonRojo) {
			setBackground(Color.red);
		}else {
			setBackground(Color.green);
		}
	}
		public LaminaBotones(){
			add(botonAzul);
			add(botonRojo);
			add(botonVerde);
			botonRojo.addActionListener(this);
			botonVerde.addActionListener(this);
			botonAzul.addActionListener(this);
		}
	
}
