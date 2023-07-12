package GraficosSwing;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class ejemplo_radio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		marco_radio mimarco=new marco_radio();
		
	}

}
class marco_radio extends JFrame{
	public marco_radio(){
		setTitle("Marco boton de radio");
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(550,300,500,350);
		Lamina_radio milamina=new Lamina_radio();
		add(milamina);
	}
}
class Lamina_radio extends JPanel{
	public Lamina_radio(){
		setLayout(new BorderLayout());
		texto=new JLabel("El objeto JLabel es un texto dentro de la app");
		add(texto, BorderLayout.CENTER);
		ButtonGroup migrupodeBotones= new ButtonGroup();
		boton1=new JRadioButton("Pequeño",false);
		boton2=new JRadioButton("Mediano",true);
		boton3=new JRadioButton("Grande",false);
		boton4=new JRadioButton("Muy grande",false);
		JPanel laminaradio= new JPanel();
		migrupodeBotones.add(boton1);
		migrupodeBotones.add(boton2);
		migrupodeBotones.add(boton3);
		migrupodeBotones.add(boton4);
		laminaradio.add(boton1);
		laminaradio.add(boton2);
		laminaradio.add(boton3);
		laminaradio.add(boton4);
		add(laminaradio,BorderLayout.SOUTH);
		evento_radio evento=new evento_radio();
		
		boton1.addActionListener(evento);
		boton2.addActionListener(evento);
		boton3.addActionListener(evento);
		boton4.addActionListener(evento);
		
		
	}
	JRadioButton boton1, boton2, boton3, boton4;
	JLabel texto;
	class evento_radio implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			if(e.getSource()==boton1) {
				//System.out.println("has presionado el boton1");
				texto.setFont(new Font("Serif",Font.PLAIN,10));
			}else if(e.getSource()==boton2) {
				texto.setFont(new Font("Serif",Font.PLAIN,12));
			}else if(e.getSource()==boton3) {
				texto.setFont(new Font("Serif",Font.PLAIN,14));
				
			}else if(e.getSource()==boton4) {
				texto.setFont(new Font("Serif",Font.PLAIN,16));
			};
		}
	}
}