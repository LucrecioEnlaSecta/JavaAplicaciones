package GraficosSwing;
import javax.swing.*;
import javax.swing.JFrame.*;

import java.awt.BorderLayout;
import java.awt.event.*;
public class PruebaAreaII {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Marco mimarco = new Marco();
		
	}

}
 class Marco extends JFrame{
	 JButton botoninsertar, botonSalto;
		JPanel laminaBotones;
	Marco(){
		setVisible(true);
		setBounds(500,300,500,350);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Area de texto II");
		
		setLayout(new BorderLayout());
		botoninsertar = new JButton("botonInsertar");
		
		botoninsertar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				areaTexto.append("En un lugar de la manzana");
			}
		});
		laminaBotones.add(botoninsertar);
		botonSalto = new JButton("boton Salto de linea");
		botonSalto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				boolean saltar=!areaTexto.getLineWrap();
				areaTexto.setLineWrap(saltar);
				if(saltar) {
					botonSalto.setText("Quitar salto");
				}else {
					botonSalto.setText("Salto Linea");
				}
			}
		});
		laminaBotones.add(botonSalto);
		add(laminaBotones, BorderLayout.SOUTH);
		areaTexto = new JTextArea(8,20);
		laminaConBarras = new JScrollPane(areaTexto);
		add(laminaConBarras, BorderLayout.CENTER);
	}
	
	private JTextArea areaTexto = new JTextArea();
	private JScrollPane laminaConBarras;
}
