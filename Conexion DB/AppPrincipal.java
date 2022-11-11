package com.educacionit.Clase5temaClase6;

public class AppPrincipal {

	public static void main(String[] args) {
	//	Conexion cn= new Conexion();
	//	cn.desconectar();
		PersonaVO Camilo=new PersonaVO(2,19,"Atencion al cliente","Camilo Santa Maria",1166821576);
		PersonaDAO dao=new PersonaDAO();
		dao.registrarPersona(Camilo);
		
		
	}

}
