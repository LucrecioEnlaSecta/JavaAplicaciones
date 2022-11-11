package GraficosSwing;

import java.awt.event.*;

import javax.swing.*;


public class MultiplesOyentes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		marco_Principal miMarco=new marco_Principal();
	}

}
class marco_Principal extends JFrame{
	marco_Principal(){
		setVisible(true);
		setBounds(5,40,200,200);
		Lamina_principal miLAmina=new Lamina_principal();
		add(miLAmina);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
}
class Lamina_principal extends JPanel{
	public Lamina_principal(){
		
		setVisible(true);
		JButton boton_nuevo= new JButton("nuevo");
		add(boton_nuevo);
		boton_cerrar= new JButton("Cerrar todo");
		add(boton_cerrar);
		Oyente oyente=new Oyente();
		boton_nuevo.addActionListener(oyente);
	}
	JButton boton_cerrar;
	private class Oyente implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			marcoEmergente miMarco=new marcoEmergente(boton_cerrar);
		}
	}
}
class marcoEmergente extends JFrame{
	 public marcoEmergente(JButton boton_de_principal){
		 contador_Ventana++;
		setBounds(40*contador_Ventana,contador_Ventana*40,500,300); 
		setVisible(true);
		setTitle("Ventana "+ contador_Ventana);
		cerrarVentanas cierroVentana=new cerrarVentanas();
		boton_de_principal.addActionListener(cierroVentana);
	 }
	 public static int contador_Ventana=0;
class cerrarVentanas implements ActionListener{
	public void actionPerformed(ActionEvent e) {
		dispose();
	}
}
}
