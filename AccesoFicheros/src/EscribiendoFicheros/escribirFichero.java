package EscribiendoFicheros;

import java.io.*;

public class escribirFichero {

	public static void main(String[] args) {
		Escribiendo accesoEscritura=new Escribiendo();
		accesoEscritura.escribir();

	}

}
class Escribiendo{
	public void escribir() {
		String frase="Esto es una prueba de escritura, aja";
		try{
			FileWriter escritura=new FileWriter("C:\\Users\\lucas\\Desktop\\textonuevo.txt");
			for(int i=0;i<frase.length();i++) {
				escritura.write(frase.charAt(i));
			}
			escritura.close();
			}catch(IOException e) {
				System.out.println("No se ha podido establecer la escritura");
				}
	}
}