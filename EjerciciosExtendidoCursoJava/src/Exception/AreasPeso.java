package Exception;
import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class AreasPeso {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada=new Scanner(System.in);
		System.out.println("Elige la opcion: \n1 Cuadrado \n2 Rectangulo \n3 Triangulo \n4 Circulo");
		figura=entrada.nextInt();
		switch(figura) {
		case 1:
			int lado=Integer.parseInt(JOptionPane.showInputDialog("Introduce cuanto vale el lado"));
			System.out.println(Math.pow(lado,2));
			break;
		
		case 2:
			int base=Integer.parseInt(JOptionPane.showInputDialog("Introduce cuanto vale la base"));
			int altura=Integer.parseInt(JOptionPane.showInputDialog("Introduce la altura"));
			System.out.println("El area del rectangulo es: "+base*altura);
			break;
			
		case 3:
			int baseTriangulo=Integer.parseInt(JOptionPane.showInputDialog("Introduce cuanto vale la base"));
			int lados=Integer.parseInt(JOptionPane.showInputDialog("Introduce cuanto vale cada lado"));
			System.out.println("El perimetro de tu triangulo es: "+(baseTriangulo*lados)/2);
			break;
			
		case 4:
			
			int radio=Integer.parseInt(JOptionPane.showInputDialog("Introduce el radio del circulo"));
			System.out.println("El Area del circulo es");
			System.out.println(Math.PI*(Math.pow(radio,2)));
			
			break;
			default:
			System.out.println("La opcion no es correcta");
		}
		//*-------------------------------------------------------------*//
		int altura=Integer.parseInt(JOptionPane.showInputDialog("Introduce los cm que mides"));
		System.out.println("Si eres hombre tu peso ideal es: "+(altura-110)+" Kg");
		System.out.println("Si eres mujer tu peso ideal es: "+(altura-120)+" Kg");
		
	}
	static int figura=0;
}
