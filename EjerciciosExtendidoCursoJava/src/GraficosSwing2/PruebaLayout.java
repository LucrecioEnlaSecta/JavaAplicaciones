package GraficosSwing;

import javax.swing.JFrame;
import java.awt.*;
import javax.swing.*;
public class PruebaLayout {

	public static void main(String[] args) {
		marco_Layout markitos=new marco_Layout();

	}

}
class marco_Layout extends JFrame{
	marco_Layout(){
		setBounds(200,100,1000,300);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Layout");
		
		/*panel_Layout milayout=new panel_Layout();
		milayout.setLayout(new FlowLayout(FlowLayout.RIGHT));
		add(milayout);*/
		Layout_left otrolayout=new Layout_left();
		//otrolayout.setLayout(new FlowLayout(FlowLayout.LEFT));
		add(otrolayout);
	}
}
class panel_Layout extends JPanel{
	panel_Layout(){
		//setLayout(new FlowLayout(FlowLayout.RIGHT));
		add(new JButton("amalliro"));
		add(new JButton("Verde"));
		add(new JButton("Marcos rojo"));
		
	}
}
class Layout_left extends JPanel{
	Layout_left(){
		//setLayout(new FlowLayout(FlowLayout.LEFT));
		setLayout(new BorderLayout());
		add(new JButton("amalliro"),BorderLayout.NORTH);
		add(new JButton("Verde"), BorderLayout.SOUTH);
		add(new JButton("Marcos rojo"),BorderLayout.EAST);
		
	}
}