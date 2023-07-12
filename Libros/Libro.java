package Libros;
import java.util.*;
public class Libro {
	public Libro(String nombre,String autor, int ISBN) {
		this.nombre=nombre;
		this.autor=autor;
		this.ISBN=ISBN;
	}
private String nombre, autor;
private int ISBN;
public String getDatos() {
	return "El titulo es "+nombre+" el autor "+autor+" y el codigo id unico (ISBN) "+ISBN;
}
public boolean equals(Object obj) {
	
	if(obj instanceof Libro) {
		
		Libro otro=(Libro)obj;
		
		if(this.ISBN==otro.ISBN) {
		
			return true;
		
		}else { return false; }
			
		}else { return false; }
}
}
