package Exception;

import javax.swing.JOptionPane;

public class Fallos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] mi_matriz=new int [5];
		mi_matriz[0]=5;
		mi_matriz[1]=38;
		mi_matriz[2]=-15;
		mi_matriz[3]=92;
		mi_matriz[4]=71;
		for(int i=0;i<mi_matriz.length;i++) {
			System.out.println("posicion: "+i+"= "+mi_matriz[i]);
			
		}
		String nombre=JOptionPane.showInputDialog("introduce un nombre:");
		
		int edad=Integer.parseInt(JOptionPane.showInputDialog("introduce una edad: "));
		System.out.println("Hola "+nombre+" Tu edad es: "+edad);
	}

}