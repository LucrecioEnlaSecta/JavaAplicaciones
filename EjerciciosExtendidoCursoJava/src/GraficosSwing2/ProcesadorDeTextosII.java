package GraficosSwing;
import javax.swing.*;
import javax.swing.text.*;
import java.awt.event.*;
import java.awt.*;
public class ProcesadorDeTextosII {

	public static void main(String[] args) {
		ProcesadorDeTexto miprocesador=new ProcesadorDeTexto();

	}
}
class ProcesadorDeTexto extends JFrame{
	public ProcesadorDeTexto(){
		setBounds(500,300,550,400);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("ProcesadorDeTexto Artesana");
		LaminaProcesador milamina=new LaminaProcesador();
		add(milamina);
		
		
	}
}
class LaminaProcesador extends JPanel{
	
	public LaminaProcesador(){
		setLayout(new BorderLayout());
		
		JPanel laminamenu=new JPanel();
		JMenuBar mibarra=new JMenuBar();
		//-------------------------------
		 fuente=new JMenu("fuente");
		 estilo=new JMenu("estilo");
		 tamagno=new JMenu("tamagno");
		configuraMenu("Arial","fuente","",1,1);
		configuraMenu("Courier","fuente","",1,1);
		configuraMenu("Verdana","fuente","",1,1);
		//-------------------------------
		configuraMenu("Negrita","estilo","",1,1);
		configuraMenu("Cursiva","estilo","",1,1);
		//--------------------------------
		configuraMenu("12","tamagno","",1,12);
		configuraMenu("14","tamagno","",1,14);
		configuraMenu("16","tamagno","",1,16);
		configuraMenu("18","tamagno","",1,18);
		//--------------------------------
		mibarra.add(fuente);
		mibarra.add(estilo);
		mibarra.add(tamagno);
		JMenuItem opcion1=new JMenuItem("opcion1");
		tamagno.add(opcion1);
		laminamenu.add(mibarra);
		add(laminamenu,BorderLayout.NORTH);
		miarea=new JTextPane();
		add(miarea,BorderLayout.CENTER);
	}
	public void configuraMenu(String rotulo,String menu,String tipoLetra,int estilos,int tam) {
		JMenuItem elem_menu=new JMenuItem(rotulo);
		if(menu=="fuente") {
			fuente.add(elem_menu);
		}
		else if(menu=="estilo") {
			estilo.add(elem_menu);
		}
		else if(menu=="tamagno") {
			tamagno.add(elem_menu);
		}
		else {
			System.out.println("error");
		}
	
	}
	JTextPane miarea;
	JMenu fuente,estilo,tamagno;
	
}