package Exception;

import java.util.*;
import java.util.Scanner;
import javax.swing.*;
import java.awt.*;


public class entrada_datos {

	public static void main(String[] args) {
		System.out.println("¿Que desea hacer?");
		System.out.println("1. Introducir datos");
		System.out.println("2. Salir del programa");
		Scanner entrada=new Scanner (System.in);
		int desicion=entrada.nextInt();
		if(desicion==1) {
			try{
			pedirDatos();
			}catch(InputMismatchException e) {
				System.out.println("Que demonios has introducido en la edad");
			}
		}else {
			System.out.println("Adios");
			System.exit(0);
		}
		entrada.close();
	}	
	static void pedirDatos() throws InputMismatchException{
		
		Scanner entrada=new Scanner(System.in);
		System.out.println("Introduce tu nombre, por favor");
		String nombre_usuario=entrada.nextLine();
		System.out.println("Introduce tu edad, por favor");
		int edad=entrada.nextInt();
		System.out.println("Hola "+nombre_usuario+". El año que viene tendras "+(edad+1)+" años");
		entrada.close();
		System.out.println("Hemos terminado");
		}
	}

