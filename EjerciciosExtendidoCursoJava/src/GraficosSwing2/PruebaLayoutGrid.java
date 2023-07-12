package GraficosSwing;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class PruebaLayoutGrid {

	public static void main(String[] args) {
		marcoCalculadora miCalculadora = new marcoCalculadora();

	}

}
class marcoCalculadora extends JFrame {
	public marcoCalculadora(){
		setVisible(true);
		setBounds(500,300,450,300);
		setTitle("Calculadora");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		panelCalculadora miLayout = new panelCalculadora();
		add(miLayout);
		pack();
		
	}
}
class panelCalculadora extends JPanel{
	public panelCalculadora(){
		setLayout(new BorderLayout());
		pantalla = new JButton("0");
		pantalla.setEnabled(false);
		add(pantalla, BorderLayout.NORTH);
		milamina2 = new JPanel();
		milamina2.setLayout(new GridLayout(4,4));
		add(milamina2);
		ActionListener insertar= new inserteNumero();
		ponerBoton("7",insertar);
		ponerBoton("8",insertar);
		ponerBoton("9",insertar);
		ponerBoton("4",insertar);
		ponerBoton("5",insertar);
		ponerBoton("6",insertar);
		ponerBoton("1",insertar);
		ponerBoton("2",insertar);
		ponerBoton("3",insertar);
		ponerBoton("0",insertar);
		/*ponerBoton("+");
		ponerBoton("-");
		ponerBoton("=");
		ponerBoton("*");
		ponerBoton("/");
		ponerBoton(",",insertar);*/

	}
	private void ponerBoton(String nombreBoton, ActionListener oyente) {
		JButton boton = new JButton(nombreBoton);
		boton.addActionListener(oyente);
		milamina2.add(boton);
	}
	JPanel milamina2 = new JPanel();
	private JButton pantalla;
	private boolean principio=true;
	private class inserteNumero implements ActionListener{
		public void actionPerformed(ActionEvent e){
			String entrada=e.getActionCommand();
			if(principio) {
				pantalla.setText("");
				principio=false;
			}
			pantalla.setText(pantalla.getText() + entrada);
		}
	}
}