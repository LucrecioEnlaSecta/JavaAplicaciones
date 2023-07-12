package GraficosSwing;
import javax.swing.JFrame;
import java.awt.*;
import javax.swing.*;
import java.awt.Event;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
public class FocoEvento {

	public static void main(String[] args) {
		MarcoEnfocado miMarco=new MarcoEnfocado();

	}

}
class MarcoEnfocado extends JFrame{
	MarcoEnfocado(){
		setVisible(true);
		setBounds(50,100,400,400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("MarcoEnfocado");
		LaminaFoco miLamina=new LaminaFoco();
		add(miLamina);
	}
}
class LaminaFoco extends JPanel{
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		setLayout(null);
		cuadro1=new JTextField();
		cuadro2=new JTextField();
		cuadro1.setBounds(5, 10, 120, 30);
		cuadro2.setBounds(5, 60, 120, 30);
		add(cuadro1);
		add(cuadro2);
		lanzaFoco elFoco=new lanzaFoco();
		cuadro1.addFocusListener(elFoco);
	}
	JTextField cuadro1;
	JTextField cuadro2;
	class lanzaFoco implements FocusListener{

		@Override
		public void focusGained(FocusEvent arg0) {
			// TODO Auto-generated method stub
			System.out.println("el cuadro1 esta enfocado");
		}

		@Override
		public void focusLost(FocusEvent arg0) {
			// TODO Auto-generated method stub
			//System.out.println("has perdido el foco");
			String email=cuadro1.getText();
			boolean VerificacionEmail=false;
			for(int i=0;i<email.length();i++) {
				if(email.charAt(i)=='@'){
					VerificacionEmail=true;
				}
			}if(VerificacionEmail) {
				System.out.println("inserto un email");
			}else {
				System.out.println("No introdujo un email. Por favor...inserte un email");
			}
		}
		
	}
}