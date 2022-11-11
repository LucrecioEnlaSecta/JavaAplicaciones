package aplicandoColeccion;
import java.util.*;
public class treeSet {
//Las colecciones treeSet implementan la interfaz comparable, la cual podemos modificar para 
	//ordenar los elementos de la coleccion con la variable querramos
	// en este caso, queremos ordenar los articulos de un negocio con su numero de articulo
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<articulos> articulosEasy=new TreeSet<articulos>();
		/*TreeSet<String> ordenapersonas=new TreeSet<String>();
		ordenapersonas.add("Alejo");
		ordenapersonas.add("duki");
		ordenapersonas.add("frijo");
		ordenapersonas.add("YSYa");
		ordenapersonas.add("lit killah");

		for(String persona:ordenapersonas) {
			System.out.println(ordenapersonas);
		}*/
	articulos cif=new articulos(1,"Producto de limpieza");
	articulosEasy.add(cif);
	articulos esponja=new articulos(2,"Esponja para lavar");
	articulosEasy.add(esponja);
	articulos esponjaMetal=new articulos(3,"Esponja metalica");
	articulosEasy.add(esponjaMetal);
	articulos escobillon=new articulos(4,"Escobillon de piso");
	articulosEasy.add(escobillon);
	articulos yerba=new articulos(5,"Yerba mate");
	articulosEasy.add(yerba);
	articulos budin=new articulos(6,"Budin casero dia");
	articulosEasy.add(budin);
	for(articulos misart : articulosEasy) {
		System.out.println(misart.getDescription());
	}
	articulos comparable=new articulos();
	TreeSet<articulos> articulosFarmacity=new TreeSet<articulos>(comparable);
	articulosFarmacity.add(yerba);
	articulosFarmacity.add(budin);
	articulosFarmacity.add(cif);
	for(articulos art:articulosFarmacity) {
		System.out.println(art.getDescription());
	}
	}
	

}
class articulos implements Comparable<articulos>,Comparator<articulos>{
	public articulos() {
		
	}
	public articulos(int num, String desc){
		numArticulo=num;
		description=desc;
	}
	public String getDescription() {
		return description;
	}
	@Override
	public int compareTo(articulos o) {
		return numArticulo-o.numArticulo;
	}
	private int numArticulo;
	private String description;
	@Override
	public int compare(articulos a1, articulos a2) {
		String descriptiionn=a1.getDescription();
		String descriptiion=a2.getDescription();
		return descriptiionn.compareTo(descriptiion);
		
	}
	
}