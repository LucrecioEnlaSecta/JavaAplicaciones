package Com.DataBase;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.jdbc.Statement;
public class Conexion {
	public String db="appweb";
	public String username="root";
	public String password="";
	public String url="jdbc:mysql://localhost/" + db;
	Connection conn=null;
	public Conexion() {
		try { 
			Class.forName("com.mysql.jdbc.Driver");
			conn= DriverManager.getConnection(url, username, password);
			if(conn != null) {
				System.out.println("Se ha logrado establecer la conexion con la base de datos: "+db);
			}
			
		}catch(ClassNotFoundException | SQLException e) {
			System.out.println("No se ha podido establecer la conexion con la base de datos: "+db);
			e.printStackTrace();
		}
	}
	public Connection getConnection() {
		return conn;
	}
	public void desconectar() {
		try{
			conn.close();
			conn=null;
			System.out.println("Se ha logrado desconectar la base de datos: "+db);
		}catch(SQLException e) {
			System.out.println("No se ha podido desconectar la base de datos: "+db);
			e.printStackTrace();
		}
		
	}
}
