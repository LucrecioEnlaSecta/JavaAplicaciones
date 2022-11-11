package conectaDB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class conectaPruebasII {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	try {//Crear la conexion con la base de datos
		Connection miConexion=DriverManager.getConnection("jdbc:mysql://localhost:3306/Prueba","root","remera123");
		
		//preparamos la consulta
		String instruccionsql="select idProducto,nombre,precio,marca,categoria,stock,disponible where nombre = ? and disponible = ?;";
	
		/*PreparedStatement miprepared=miConexion.prepareStatement(instruccionsql);*/
		
		
	}catch(Exception e) {
		
	}
	}

}
