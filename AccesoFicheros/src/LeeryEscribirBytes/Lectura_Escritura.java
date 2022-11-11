package LeeryEscribirBytes;
import java.io.*;
public class Lectura_Escritura {

	public static void main(String[] args) {
		int contador=0;
		int datos_entrada[]=new int[1170791];
		// TODO Auto-generated method stub
		try{
			FileInputStream archivo_lectura=new FileInputStream("C:/Users/lucas/Desktop/CarpetaPrueba/imagen.jpg");
			boolean final_ar=false;
			while(!final_ar) {
				int byte_entrada=archivo_lectura.read();
				if(byte_entrada!=-1) {
					datos_entrada[contador]=byte_entrada;
				}else {
					System.out.println(contador);
					final_ar=true;
					}
				
				System.out.println(datos_entrada[contador]);
				contador++;
			}
			
		}catch(IOException e) {
			System.out.println("No se ha podido escribir el archivo");
		}
		crea_fichero(datos_entrada);
	}

		static void crea_fichero(int datos_nuevo_fichero[]) {
			try {
				FileOutputStream fichero_nuevo=new FileOutputStream("C:/Users/lucas/Desktop/CarpetaPrueba/imagencopia.jpg");
				for(int i=0;i<datos_nuevo_fichero.length;i++) {
					fichero_nuevo.write(datos_nuevo_fichero[i]);
				}
			}catch(IOException e) {
				System.out.println("No se pudo crear el fichero");
			}
		
		}
	
}

