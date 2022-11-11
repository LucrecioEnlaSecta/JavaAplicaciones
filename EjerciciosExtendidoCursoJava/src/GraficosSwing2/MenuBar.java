package GraficosSwing;
import java.awt.event.*;
import java.awt.*;
import javax.swing.JFrame;
import javax.swing.*;

public class MenuBar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MarcoMenu mimarco=new MarcoMenu();
	}

}
class MarcoMenu extends JFrame {
	public MarcoMenu(){
		setBounds(200,150,350,550);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Menu Bar");
		laminaMenu milamina=new laminaMenu();
		add(milamina);
	}
}
class laminaMenu extends JPanel{
	public laminaMenu(){
		JMenuBar mibarra=new JMenuBar();
		JMenu archivo=new JMenu("archivo");
		JMenu edicion=new JMenu("edicion");
		JMenu herramientas=new JMenu("herramientas");
		JMenu opciones=new JMenu("opciones");
		JMenuItem opcion1=new JMenuItem("opcion1");
		JMenuItem opcion2=new JMenuItem("opcion2");
		JMenuItem guardar=new JMenuItem("guardar");
		JMenuItem guardarcomo=new JMenuItem("guardar como");
		JMenuItem copiar=new JMenuItem("copiar",new ImageIcon("/bin/graficos/cortar.gif"));
		JMenuItem pegar=new JMenuItem("pegar");
		JMenuItem cortar=new JMenuItem("cortar");
		JMenuItem generales=new JMenuItem("generales");
		mibarra.add(archivo);
		mibarra.add(edicion);
		mibarra.add(herramientas);
		
		opciones.add(opcion1);
		opciones.add(opcion2);
		archivo.add(guardar);
		archivo.add(guardarcomo);
		edicion.add(copiar);
		edicion.add(cortar);
		edicion.add(pegar);
		edicion.add(opciones);
		herramientas.add(generales);
		
		add(mibarra);
		
	}
}