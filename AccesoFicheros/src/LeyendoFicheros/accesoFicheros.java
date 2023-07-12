package LeyendoFicheros;
import java.io.*;
public class accesoFicheros {

	public static void main(String[] args) {
		leerFichero mificheroaleer=new leerFichero();
		mificheroaleer.lee();
	}

}
class leerFichero{
	public void lee() {
		try {
			entrada=new FileReader("C:\\Users\\lucas\\Desktop\\Fichero.txt");
			//int c=entrada.read();
			BufferedReader buffer=new BufferedReader(entrada);
			String linea="";
			while(linea!=null) {
			
				linea=buffer.readLine();
				/*	c=entrada.read();
				char letra = (char) c;*/
				if(linea!=null) {
				System.out.println(linea);
				}
				
			}
		entrada.close();
		} catch (FileNotFoundException e) {
			System.out.println("No se ha encontrado el archivo");
			//e.printStackTrace();
		}catch(IOException e) {
			System.out.println("No se ha encontrado el archivo");
		}finally {
			try{entrada.close();}catch(IOException e) {System.out.println("No se pudo cerrar el fichero");}
		}
		
	}
	FileReader entrada;
}