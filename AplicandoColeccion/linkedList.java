package aplicandoColeccion;

import java.util.*;

public class linkedList {

	public static void main(String[] args) {
		LinkedList <String> personas=new LinkedList<String>();
		personas.add("Lucas");
		personas.add("Yamil");
		personas.add("Sandra");
		personas.add("Ailen");
		personas.add("Roberto");
		
		System.out.println(personas.size());
		personas.add("Valentin");
		personas.add(3,"Milagros");
		ListIterator<String> miiterator=personas.listIterator();
		miiterator.next();
		miiterator.add("Penelope Cruz Maldicia");
		for(String persona : personas) {
			System.out.println(persona);
		}
		personas.add("Roberto");
	}

}
