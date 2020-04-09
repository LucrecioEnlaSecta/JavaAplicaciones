package com.educacionit.Clase5temaClase6;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
	public static String db="persona";
	public static String login="root";
	public static String password="Dlukilohacebien1";
	//Java DataBase conectivity
	public static String urlconeccion="jdbc:mysql://localhost/"+db+"?autoReconnect=true&useSSL=false";
	
	Connection conn=null;
	
	public Conexion() {
		try {
			//obtenemos el driver para mysql
			Class.forName("com.mysql.jdbc.Driver");
			//Obtenemos la conexion a la db
			conn=DriverManager.getConnection(urlconeccion, login, password);
			if(conn!=null) {
				System.out.println("Conexion exitosa a la base de datos "+db);
			}
		}catch(SQLException a) {
			System.out.println(a);
			a.printStackTrace();
		}catch(ClassNotFoundException a) {
			System.out.println(a);
			a.printStackTrace();
		}catch(Exception a) {
			System.out.println(a);
			a.printStackTrace();
		}
		
	}public Connection getConnection(){
		return conn;
	}
	public void desconectar() {
		conn=null;
		System.out.println("Se ha desconectado la base de datos"+db);
	}
	 
 }
	
