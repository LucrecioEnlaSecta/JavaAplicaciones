package graficos_swing;
import javax.swing.*;
public class CreandoMarcos {

	public static void main(String[] args) {
		miMarco marco1 = new miMarco();
		
	}
}
class miMarco extends JFrame{
	public miMarco() {
		//setSize(500,300);
		setVisible(true);
		setBounds(500,300,400,400);
		setResizable(false);
		setTitle("LucasMarkeano");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}

