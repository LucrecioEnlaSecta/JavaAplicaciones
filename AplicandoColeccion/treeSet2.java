package aplicandoColeccion;

import java.util.Comparator;
import java.util.TreeSet;

public class treeSet2 {

	public static void main(String[] args) {
		TreeSet<articulo> articulosEasy=new TreeSet<articulo>();

	articulo cif=new articulo(1,"Producto de limpieza");
	articulosEasy.add(cif);
	articulo esponja=new articulo(2,"Esponja para lavar");
	articulosEasy.add(esponja);
	articulo esponjaMetal=new articulo(3,"Asponja metalica");
	articulosEasy.add(esponjaMetal);

	/*for(articulo misart : articulosEasy) {
		System.out.println(misart.getDescription());
	}*/
	//ComparadorArticulos compara=new ComparadorArticulos();
	TreeSet<articulo> ordenaArticulo=new TreeSet<articulo>(new Comparator<articulo>() {

		public int compare(articulo arg0, articulo arg1) {
			String desc1=arg0.getDescription();
			String desc2=arg1.getDescription();
			
			return desc1.compareTo(desc2);
		}
	});
	ordenaArticulo.add(esponjaMetal);
	ordenaArticulo.add(cif);
	ordenaArticulo.add(esponja);
	for(articulo art:ordenaArticulo) {
		System.out.println(art.getDescription());
	}
	
	/*TreeSet<articulo> articulosFarmacity=new TreeSet<articulo>();
	articulosFarmacity.add(cif);
	for(articulo art:articulosFarmacity) {
		System.out.println(art.getDescription());
	}*/
	}
	

}
class articulo implements Comparable<articulo>{
	
	public articulo(int num, String desc){
		numArticulo=num;
		description=desc;
	}
	public String getDescription() {
		return description;
	}
	@Override
	public int compareTo(articulo o) {
		return numArticulo-o.numArticulo;
	}
	private int numArticulo;
	private String description;
	
	
}
/*class ComparadorArticulos implements Comparator<articulo>{
	public ComparadorArticulos(){
		
	}

	@Override
	public int compare(articulo arg0, articulo arg1) {
		String desc1=arg0.getDescription();
		String desc2=arg1.getDescription();
		
		return desc1.compareTo(desc2);
	}
}*/