package GraficosSwing;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class checkbox {

	public static void main(String[] args) {
		MarcoChek mimarco = new MarcoChek();
		

	}

}
 class MarcoChek extends JFrame{
	public MarcoChek(){
		setVisible(true);
		setTitle("marcoperchek");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(500,300,500,350);
		LaminaCheck milamina= new LaminaCheck();
		add(milamina);
		
	}
}
 class LaminaCheck extends JPanel{
	 LaminaCheck(){
		 setLayout(new BorderLayout());
		 Font miletra=new Font("Serif", Font.PLAIN,24);
		 texto = new JLabel("Encuentro mi soledad en algun lugar...");
		 texto.setFont(miletra);
		 JPanel laminatexto = new JPanel();
		 laminatexto.add(texto);
		 add(laminatexto,BorderLayout.CENTER);
		 check1 = new JCheckBox("Negrita");
		 check2 = new JCheckBox("Cursiva");
		 check1.addActionListener(new manejaChecks());
		 check2.addActionListener(new manejaChecks());
		 JPanel laminachecks=new JPanel();
		 laminachecks.add(check1);
		 laminachecks.add(check2);
		 add(laminachecks,BorderLayout.SOUTH);
		 
	 }
	  private JCheckBox check1, check2;
	 private JLabel texto;
	 class manejaChecks implements ActionListener{

			
			public void actionPerformed(ActionEvent e) {
				int tipo = 0;
				if(check1.isSelected()) tipo+=Font.BOLD;
					
				if(check2.isSelected()) tipo+=Font.ITALIC;
					texto.setFont(new Font("Serif",tipo,24));
					
				}
				
			}
			 
		 }
 
 