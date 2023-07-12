package aplicandoColeccion;

import java.util.LinkedList;
import java.util.*;

public class linkedList2 {

	public static void main(String[] args) {
		LinkedList<String> paises=new LinkedList<String>();
		
		paises.add("España");
		paises.add("Colombia");
		paises.add("Mexico");
		paises.add("Peru");
		
		LinkedList<String> capitales=new LinkedList<String>();
		
		capitales.add("Madrid");
		capitales.add("Bogota");
		capitales.add("DF");
		capitales.add("Lima");
		
		System.out.println(paises);
		System.out.println(capitales);
		
		ListIterator<String> ita=paises.listIterator();
		ListIterator<String> itb=capitales.listIterator();
		while(ita.hasNext()) {
			if(itb.hasNext()) {
				ita.next();
				
			}
			ita.add(itb.next());
		}
		System.out.println(paises);
		itb=capitales.listIterator();
		while(itb.hasNext()) {
			itb.next();
			if(itb.hasNext()) {
				itb.next();
				itb.remove();
			}
			
		}
		System.out.println(capitales);
		paises.removeAll(capitales);
		System.out.println(paises);
	}

}
