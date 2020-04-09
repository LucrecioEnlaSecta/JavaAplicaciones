package com.educacionit.Clase5temaClase6;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JOptionPane;

import com.sun.corba.se.spi.legacy.connection.GetEndPointInfoAgainException;
//Data access object 
//CRUD = Create read updete delete
public class PersonaDAO {
	public void registrarPersona(PersonaVO miPersona) {
		Conexion conex = new Conexion();

		try {
			Statement estatuto = conex.getConnection().createStatement();

			estatuto.executeUpdate("INSERT INTO persona VALUES ('" + miPersona.getID() + "','"
					+ miPersona.getNombre() + "','" + miPersona.getEdadPersona() + "','"
					+ miPersona.getProfesion() + "','" + miPersona.getTelefono() + "')");

			JOptionPane.showMessageDialog(null, "Se ah registrado Exitosamente a " + miPersona.getNombre(),
					"Informacion", JOptionPane.INFORMATION_MESSAGE);
			estatuto.close();
			conex.desconectar();

		} catch (SQLException e) {
			System.out.println(e.getMessage());
			JOptionPane.showMessageDialog(null, "No se registro a " + miPersona.getNombre());

		}

	}
}	
