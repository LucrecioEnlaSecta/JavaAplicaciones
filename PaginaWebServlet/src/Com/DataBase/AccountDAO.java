package Com.DataBase;

import java.sql.SQLException;
import java.sql.Statement;

import Com.Models.AccountVO;

public class AccountDAO {
	public boolean registrarUsuario(AccountVO user) {
		Conexion conn=new Conexion();
		try {
		Statement estatuto = conn.getConnection().createStatement();
		user.setId((int)Math.random() * 1000);
		estatuto.executeUpdate("INSERT INTO persona ('"+user.getUsername()+"','"+user.getPassword()+"',"+user.getId()+","+user.isVolumen()+","+user.isDefinicion()+",'"+user.getEmail()+
				"','"+user.getNombre()+"','"+user.getApellido()+"',"+user.getEdad()+")");
		conn.desconectar();
		estatuto.close();
		System.out.println("Se ha registrado al usuario: "+user.getUsername());
			return true;
		}catch(SQLException e) {
			System.out.println("No se ha podido registrar al usuario"+user);
			e.printStackTrace();
			return false;
		}
	}
}
