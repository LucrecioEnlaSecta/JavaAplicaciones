package com.educacionit.Clase5temaClase6;

public class PersonaVO {
	private Integer ID;
	private Integer EdadPersona;
	private String Profesion;
	private String Nombre;
	private Integer Telefono;
	public PersonaVO() {
	
	}
	
	public PersonaVO(Integer iD, Integer edadPersona, String profesion, String nombre, Integer telefono) {
		
		ID = iD;
		EdadPersona = edadPersona;
		Profesion = profesion;
		Nombre = nombre;
		Telefono = telefono;
	}

	public Integer getID() {
		return ID;
	}
	public void setID(Integer iD) {
		ID = iD;
	}
	public Integer getEdadPersona() {
		return EdadPersona;
	}
	public void setEdadPersona(Integer edadPersona) {
		EdadPersona = edadPersona;
	}
	public String getProfesion() {
		return Profesion;
	}
	public void setProfesion(String profesion) {
		Profesion = profesion;
	}
	public String getNombre() {
		return Nombre;
	}
	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	public Integer getTelefono() {
		return Telefono;
	}
	public void setTelefono(Integer telefono) {
		Telefono = telefono;
	}

	
	public String toString() {
		return "PersonaVO [ID=" + ID + ", EdadPersona=" + EdadPersona + ", Profesion=" + Profesion + ", Nombre="
				+ Nombre + ", Telefono=" + Telefono + "]";
	}
	
}
