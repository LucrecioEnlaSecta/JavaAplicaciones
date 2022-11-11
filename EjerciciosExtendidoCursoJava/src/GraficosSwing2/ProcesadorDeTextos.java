package GraficosSwing;
import javax.swing.*;
import javax.swing.text.*;
import java.awt.event.*;
import java.awt.*;
public class ProcesadorDeTextos {

	public static void main(String[] args) {
		ProcesadorDeTexto miprocesador=new ProcesadorDeTexto();

	}
}
class ProcesadorDeTexto extends JFrame{
	public ProcesadorDeTexto(){
		setBounds(500,300,550,400);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("ProcesadorDeTexto Artesanal");
		LaminaProcesador milamina=new LaminaProcesador();
		add(milamina);
		
		
	}
}
class LaminaProcesador extends JPanel{
	
	public  LaminaProcesador(){
		setLayout(new BorderLayout());
		
		JPanel laminamenu=new JPanel();
		JMenuBar mibarra=new JMenuBar();
		//-------------------------------
		JMenu fuente=new JMenu("fuente");
		JMenu estilo=new JMenu("estilo");
		JMenu tamagno=new JMenu("tamagno");
		//-------------------------------
		JMenuItem arial=new JMenuItem("Arial");
		arial.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				miarea.setFont(new Font("Arial",Font.PLAIN,12));
			}

		});
		JMenuItem courier=new JMenuItem("Courier");
		//gestionaMenu tipoletra=new gestionaMenu();
		//courier.addActionListener(new gestionaMenu());
		courier.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				miarea.setFont(new Font("Courier",Font.PLAIN,12));
			}

		});
		JMenuItem verdana=new JMenuItem("Verdana");
		verdana.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				miarea.setFont(new Font("Verdana",Font.PLAIN,12));
			}

		});
		fuente.add(arial);
		fuente.add(courier);
		fuente.add(verdana);
		//-------------------------------
		JMenuItem negrita=new JMenuItem("Negrita");
		JMenuItem cursiva=new JMenuItem("Cursiva");
		
		estilo.add(negrita);
		estilo.add(cursiva);
		//-------------------------------
		JMenuItem tam12=new JMenuItem("12");
		JMenuItem tam14=new JMenuItem("14");
		JMenuItem tam16=new JMenuItem("16");
		JMenuItem tam18=new JMenuItem("18");
		
		tamagno.add(tam12);
		tamagno.add(tam14);
		tamagno.add(tam16);
		tamagno.add(tam18);
		//-------------------------------
		mibarra.add(fuente);
		mibarra.add(estilo);
		mibarra.add(tamagno);
		laminamenu.add(mibarra);
		add(laminamenu,BorderLayout.NORTH);
		miarea=new JTextPane();
		add(miarea,BorderLayout.CENTER);
	}
	/*private class gestionaMenu implements ActionListener{

		public void actionPerformed(ActionEvent arg0) {
			miarea.setFont(new Font("Courier",Font.PLAIN,12));
		}
	}*/
	JTextPane miarea;
}