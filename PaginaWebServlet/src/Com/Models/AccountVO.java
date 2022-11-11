package Com.Models;

public class AccountVO {
	public String username;
	public String password;
	public int id;
	public boolean definicion;
	public boolean volumen;
	public int edad;
	public String nombre;
	public String apellido;
	public String email;
	
	
	public AccountVO(String username, String password, int id) {
		this.username = username;
		this.password = password;
		this.id = id;
	}

	public AccountVO() {
		
	}

	public boolean isDefinicion() {
		return definicion;
	}

	public void setDefinicion(boolean definicion) {
		this.definicion = definicion;
	}

	public boolean isVolumen() {
		return volumen;
	}

	public void setVolumen(boolean volumen) {
		this.volumen = volumen;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	
}
