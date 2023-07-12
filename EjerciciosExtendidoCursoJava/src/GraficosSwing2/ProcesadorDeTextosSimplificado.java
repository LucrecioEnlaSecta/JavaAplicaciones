package GraficosSwing;
import javax.swing.*;
import javax.swing.text.*;
import java.awt.event.*;
import java.awt.*;
public class ProcesadorDeTextosSimplificado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
		configuraMenu("Arial","fuente","Arial",9,1);
		configuraMenu("Courier","fuente","Courier",9,1);
		configuraMenu("Verdana","fuente","Verdana",9,1);
		//-------------------------------
		configuraMenu("Negrita","estilo","",Font.BOLD,1);
		configuraMenu("Cursiva","estilo","",Font.ITALIC,1);
		//--------------------------------
		configuraMenu("12","tamagno","",9,12);
		configuraMenu("14","tamagno","",9,14);
		configuraMenu("16","tamagno","",9,16);
		configuraMenu("18","tamagno","",9,18);
		//--------------------------------
		mibarra.add(fuente);
		mibarra.add(estilo);
		mibarra.add(tamagno);
		/*JMenuItem opcion1=new JMenuItem("opcion1");
		tamagno.add(opcion1);*/
		//gestionaEventos mievento=new gestionaEventos("Fuente","Arial",1,14);
		laminamenu.add(mibarra);
		add(laminamenu,BorderLayout.NORTH);
		miarea=new JTextPane();
		add(miarea,BorderLayout.CENTER);
	}
	public void configuraMenu(String rotulo,String menu,String tipoLetra,int estilos,int tam) {
		JMenuItem elem_menu=new JMenuItem(rotulo);
		if(menu=="fuente") {
			fuente.add(elem_menu);
			if(tipoLetra=="Arial") {
				elem_menu.addActionListener(new StyledEditorKit.FontFamilyAction("Cambio de letra","Arial"));
			}else if(tipoLetra=="Courier") {
				elem_menu.addActionListener(new StyledEditorKit.FontFamilyAction("cambio de letra","Courier"));
			}else if(tipoLetra=="Verdana") {
				elem_menu.addActionListener(new StyledEditorKit.FontFamilyAction("Cambio de letra","Verdana"));
			}
		}
		else if(menu=="estilo") {
			estilo.add(elem_menu);
			if(estilos==Font.BOLD) {
			elem_menu.addActionListener(new StyledEditorKit.BoldAction());
			}else if(estilos==Font.ITALIC) {
				elem_menu.addActionListener(new StyledEditorKit.ItalicAction());
			}
			}
		else if(menu=="tamagno") {
			tamagno.add(elem_menu);
			elem_menu.addActionListener(new StyledEditorKit.FontSizeAction("Cambio tamaño",tam));
		}
		else {
			System.out.println("error");
		}
		//elem_menu.addActionListener(new gestionaEventos(rotulo,tipoLetra,estilos,tam));
	}
	/*private class gestionaEventos implements ActionListener{
		String menu, tipoLetra;
		int estilo, tamagno;
		gestionaEventos(String menu, String tipoLetra,int estilo,int tamagno){
			this.tipoLetra=tipoLetra;
			this.estilo=estilo;
			this.tamagno=tamagno;
			this.menu=menu;
		}
		public void actionPerformed(ActionEvent arg0) {
			letras=miarea.getFont();
			if(menu=="Arial"||menu=="Courier"||menu=="Verdana") {
				estilo = letras.getStyle();
				tamagno= letras.getSize();
			}else if(menu=="Cursiva"||menu=="Negrita") {
				if(letras.getStyle()==1||letras.getStyle()==2) {
					estilo=3;
				}
					tipoLetra=letras.getFontName();
				tamagno=letras.getSize();
			}else if(menu=="12"||menu=="14"||menu=="16"||menu=="18") {
				tipoLetra=letras.getFontName();
				estilo=letras.getStyle();
			}
			miarea.setFont(new Font(tipoLetra,estilo,tamagno));
			System.out.println("tipo de letra: "+tipoLetra+" Estilo: "+estilo+" tamaño de la letra: "+tamagno);
		}
		
	}
	*/JTextPane miarea;
	JMenu fuente,estilo,tamagno;
	Font letras;
	
	}