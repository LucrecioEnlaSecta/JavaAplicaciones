package GraficosSwing;
import javax.swing.*;
import javax.swing.border.EmptyBorder;

import java.awt.*;
import java.awt.event.*;
public class HilosThreads extends JFrame{

	public static void main(String[] args) {
		
		HilosThreads mimarco=new HilosThreads();
		//mimarco.paint(new());
		mimarco.setVisible(true);
		
	}
	public HilosThreads() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 450, 300);
        JPanel milamina = new lamina();
        milamina.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(milamina);
        milamina.setLayout(null);
        setBounds(0,0,800,600);
    }
	public void paint (Graphics g)
	{
	    super.paint(g);

	    g.setColor (Color.blue);
	    g.drawLine (0, 70, 100, 70);
	    g.drawRect (150, 70, 50, 70);
	    g.drawRoundRect (250, 70, 50, 70, 6, 6);
	    g.drawOval (350, 70, 50, 70);
	    int [] vx1 = {500, 550, 450};
	    int [] vy1 = {70, 120, 120};
	    g.drawPolygon (vx1, vy1, 3);

	    g.setColor (Color.red);
	    g.fillRect (150, 270, 50, 70);
	    g.fillRoundRect (250, 270, 50, 70, 6, 6);
	    g.fillOval (350, 270, 50, 70);
	    int [] vx2 = {500, 550, 450};
	    int [] vy2 = {270, 320, 320};
	    g.fillPolygon (vx2, vy2, 3);
	}
}
class lamina extends JPanel{
	 lamina() {
		
	};
}/*
class marco extends JFrame{
	 marco() {
		setBounds(100,100,300,300);
		
		setTitle("Prueba de metodos del JPanel");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel milamina=new lamina();
		add(milamina);
		JLabel etiqueta=new JLabel("Ellos Pincharon");
		milamina.add(etiqueta);
		setLayout(new BorderLayout());
		add(milamina, BorderLayout.SOUTH);
		
		
	}
}*/
