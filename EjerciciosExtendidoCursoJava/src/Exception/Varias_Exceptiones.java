package Exception;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Varias_Exceptiones {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		division();
		}catch(ArithmeticException e) {
			System.out.println("Usted quiere dividir por 0 y eso no es correcto");
		}catch(NumberFormatException e) {
			System.out.println("usted quiere dividir un numero no entero y eso no es correcto");
		}
		}
	public static void division() {
		int num1=Integer.parseInt(JOptionPane.showInputDialog("Introduce el dividendo"));
		int num2=Integer.parseInt(JOptionPane.showInputDialog("Introduce el divisor"));
		System.out.println("El resultado es "+num1/num2);
	}
}
