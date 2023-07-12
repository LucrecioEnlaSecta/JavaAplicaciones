package GraficosSwing;
import javax.swing.*;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.*;

public class Combo_box {

	public static void main(String[] args) {
		marco_combo mimarco= new marco_combo();

	}

}
class marco_combo extends JFrame{
	public marco_combo(){
		setBounds(200,300,400,400);
		setVisible(true);
		setTitle("Ejemplo Combo box");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		lamina_comboBox milamina=new lamina_comboBox();
		add(milamina);
	}
}
class lamina_comboBox extends JPanel{
	public lamina_comboBox(){
		setLayout(new BorderLayout());
		texto = new JLabel("este es un ejemplo de como cambiar la fuente con un combo desplegable");
		micombo=new JComboBox();
		micombo.addItem("Serif");
		micombo.addItem("SansSerif");
		micombo.addItem("Monospaced");
		micombo.addItem("Dialog");
		JPanel laminanorte=new JPanel();
		laminanorte.add(micombo);
		add(laminanorte,BorderLayout.NORTH);
		add(texto,BorderLayout.CENTER);
		evento_comboBox evento = new evento_comboBox();
		micombo.addActionListener(evento);
		
	}
	JComboBox micombo;
	private JLabel texto;
	class evento_comboBox implements ActionListener{
		public void actionPerformed(ActionEvent e){
			texto.setFont(new Font((String)micombo.getSelectedItem(),Font.PLAIN,18));
		}
	}
}