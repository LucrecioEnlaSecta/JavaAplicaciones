package conectaDB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class consultasPreparadas {

	public static void main(String[] args) {
		
		try {
		// 1 Establecemos la conexion con la DB
		Connection miConexion=DriverManager.getConnection("jdbc:mysql://localhost:3306/Prueba","root","");
		
		// 2 Creamos la consulta 
		String instruccionsql="select idProducto,nombre,precio,marca,categoria,stock,disponible from productos where nombre = ? and marca = ?;";
		
		// 3 Creamos el objeto prepareStatement
		PreparedStatement miprepared=miConexion.prepareStatement(instruccionsql);
		
		// 4 Le agregamos los parametros para encontrar los datos especificos
		
		miprepared.setString(1,"Jorgelin");
		
		miprepared.setString(2,"Jorgelin");
		
		// 5 Ejecutar la consulta preparada
		
		ResultSet resultado=miprepared.executeQuery();
		
		// 6 recorrer los resultados e imprimirlos por pantalla
		
		while(resultado.next()) {
			System.out.println("Los productos seleccionados en su carrito fueron los siguientes: "+resultado.getString(2)+" y hay "+resultado.getInt(7)+" disponible actualmente");
			
		}
		
		
		
		
		
		
		
		
		}catch(Exception e) {
			e.printStackTrace();
		}
		}

}
