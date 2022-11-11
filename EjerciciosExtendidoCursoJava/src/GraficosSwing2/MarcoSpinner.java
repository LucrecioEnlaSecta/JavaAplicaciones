package GraficosSwing;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class MarcoSpinner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FrameSpinner mimarco=new FrameSpinner();
	}

}
class FrameSpinner extends JFrame{
	public FrameSpinner(){
		setBounds(550,350,550,350);
		setVisible(true);
		setTitle("Spinner");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		laminaSpinner milamina=new laminaSpinner();
		add(milamina);
	}
}
class laminaSpinner extends JPanel{
	laminaSpinner(){
		setLayout(new GridLayout(3,3));
		//how to get all Font of user
		//String listaFuentes[]=GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();
		String list[]= {"enero   ","febrero","marzo","abril","junio","julio","agosto","septiembre","octubre","noviembre","diciembre"};
		//JSpinner control=new JSpinner(new SpinnerListModel(list));
		Dimension d=new Dimension(200,20);
		JSpinner control2=new JSpinner(new SpinnerNumberModel(5,0,15,1.5) {
			//clase interna anonima, nos ahorra codigo, podemos escribir el codigo directamente y no crear otra clase 
			public Object getNextValue() {
				//invertimos los botones del spinner sobreescribiendo los metodos de la clase padre
				return super.getPreviousValue();
			}
			public Object getPreviousValue() {
				return super.getNextValue();
			}
		});
		control2.setPreferredSize(d);
		add(control2);
		JSpinner otroSpinner=new JSpinner();
		add(otroSpinner);
		
	}
/*private class miModeloSpinner extends SpinnerNumberModel{
	miModeloSpinner(){
		super(5,0,15,1);
	}
	public Object getNextValue(){
		return getPreviousValue();
	}
	public Object getPreviousValue() {
		return getNextValue();
	}
	
	
	
	
	
}*/
}