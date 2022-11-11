package GraficosSwing;
import javax.swing.*;
import java.awt.event.*;
public class AreaTexto {

	public static void main(String[] args) {
		MarcoArea mimarco = new MarcoArea();

	}

}
class MarcoArea extends JFrame{
	MarcoArea(){
		setBounds(0,50,400,350);
		setTitle("Area de Texto grande");
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		lamina_areaTexto milamina = new lamina_areaTexto();
		add(milamina);
	}
}
class lamina_areaTexto extends JPanel{
	JTextArea cuadro = new JTextArea(8,20);
	lamina_areaTexto(){
		
		cuadro.setLineWrap(true);
		JScrollPane otralamina = new JScrollPane(cuadro);		
		add(otralamina);
		JButton enviar = new JButton("enviar");
		add(enviar);
		enviar.addActionListener(new gestionArea());
	}
	private class gestionArea implements ActionListener{
		public void actionPerformed(ActionEvent e){
			String pene = cuadro.getText();
			System.out.println(pene);
		}
	}
}
