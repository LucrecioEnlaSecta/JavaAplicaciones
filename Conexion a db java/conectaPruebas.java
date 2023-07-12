package conectaDB;
import java.io.IOException;
import javax.sql.*;
import java.sql.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class conectaPruebas {

	public static void main(String[] args) {
		try {
			/*//Obtenemos la conexion
			Connection Conexion=DriverManager.getConnection("jdbc:mysql://localhost:3306/Prueba","root","remera123");
			
			//creamos un Statement 
			 Statement statement=Conexion.createStatement();
			
			//Ejecutamos la Qery
			//String instruccionsql="insert into productos (idProducto,nombre,precio,marca,categoria,stock,disponible)values(7,'Hamburguesas',500,'dia','freezer',10,true);";
			//PreparedStatement miprepared=miConexion.prepareStatement();
			//PreparedStatement miprepared=miConexion.prepareStatement("insert into productos(idProducto,nombre,precio,marca,categoria,stock,disponible)values(7,'Hamburguesas',500,'dia','freezer',10,true)");
			
			//statement.executeUpdate(instruccionsql);
			
			String instruccionsql="select * from productos;";
			
			ResultSet Resultado=statement.executeQuery(instruccionsql);
			
			System.out.println("Salio todo bien padre");
			//Recorrer el resulset
			
			while(Resultado.next()) {
				System.out.println(Resultado.getString("nombre")+"  "+Resultado.getString("marca")+"\n");
			}
		}catch(Exception e) {
			e.printStackTrace();
		}*/
	//}
//}
		conectaPruebass miobjeto=new conectaPruebass();
		miobjeto.insertarProductos("insert into productos (idProducto,nombre,precio,marca,categoria,stock,disponible)values(8,'Panchos',250,'dia','freezer',10,true);");
	}catch(Exception e) {
		e.printStackTrace();
	}

}
}
		
class conectaPruebass {
public	void insertarProductos(String sql){
	try{
		Connection Conexion=DriverManager.getConnection("jdbc:mysql://localhost:3306/Prueba","root","remera123");
		Statement statement=Conexion.createStatement();
		statement.executeUpdate(sql);
		System.out.println("Todo bien capo");
	}catch(Exception e) {
		
	}
}
}	