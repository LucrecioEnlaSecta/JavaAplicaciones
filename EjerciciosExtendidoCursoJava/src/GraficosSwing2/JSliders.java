package GraficosSwing;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class JSliders {

	public static void main(String[] args) {
		marco_Jsliders mimarco=new marco_Jsliders();
		

	}

}
class marco_Jsliders extends JFrame{
	public marco_Jsliders(){
		setBounds(200,300,400,400);
		setVisible(true);
		setTitle("JSliders ejemplo");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		lamina_Jsliders milamina=new lamina_Jsliders();
		add(milamina);
		
	}
}
class lamina_Jsliders extends JPanel{
	lamina_Jsliders(){
		JSlider misli=new JSlider(0,100,50);
		misli.setMajorTickSpacing(25);
		misli.setMinorTickSpacing(5);
		misli.setPaintTicks(true);
		misli.setFont(new Font("Serif",Font.ITALIC,12));
		misli.setPaintLabels(true);
		misli.setSnapToTicks(true);
		add(misli);
		
	}
	JSlider misli;
}