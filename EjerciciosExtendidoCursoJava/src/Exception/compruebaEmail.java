package Exception;
import javax.swing.*;

public class compruebaEmail {

	public static void main(String[] args) {
		String el_mail=JOptionPane.showInputDialog("Introduce el mail");
		try{
			examina_mail(el_mail);
		}catch(longitud_mail_erronea e) {
			
		}

	}
	static void examina_mail(String mail) throws longitud_mail_erronea {
		int arroba=0;
		boolean punto=false;
		if(mail.length()<=3) {
		//	ArrayIndexOutOfBoundsException mi_exception=new ArrayIndexOutOfBoundsException();
		//throw new ArrayIndexOutOfBoundsException();}else
			throw new longitud_mail_erronea("Es muy corto este email");}
			else{
		for(int i=0;i<mail.length();i++) {
			if(mail.charAt(i)=='@') {
				arroba++;
			}
			if(mail.charAt(i)=='.') {
				punto=true;
			}
			if(arroba==1 && punto) {
				System.out.println("Es correcto el mail");
			}else {
				System.out.println("Es incorrecto el mail");
			}
		}
		}
	}
	}

class longitud_mail_erronea extends Exception{
	public longitud_mail_erronea() {
		
	}
	public longitud_mail_erronea(String msj_error) {
		super(msj_error);
	}
	
}
