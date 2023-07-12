package aplicandoColeccion;
import java.util.*;
public class Cliente {
	public Cliente(String nombre, String n_cuentas, double saldo) {
		this.nombre=nombre;
		
		this.n_cuentas=n_cuentas;
		
		this.saldo=saldo;
	}
	private String nombre;
	private String n_cuentas;
	private double saldo;
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getN_cuentas() {
		return n_cuentas;
	}
	public void setN_cuentas(String n_cuentas) {
		this.n_cuentas = n_cuentas;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public static void main(String[] args) {
		Cliente c1=new Cliente("Antonio Banderas","00001",200000);
		Cliente c2=new Cliente("Rafael Nadal","00002",250000);
		Cliente c3=new Cliente("Penelope cruz","00003",300000);
		Cliente c4=new Cliente("Julio Iglesias","00004",500000);
		Cliente c15=new Cliente("Antonio Banderas","00001",200000);
		
		/*Ahora instanciaremos la colleccion
	Nos haremos varias preguntas para poder elegir la coleccion mas adecuada a nuestro programa
		1.¿Tiene sentido que se puedan repetir los clientes?
		2.¿Haremos muchas operaciones de agregar y borrar elementos?
		3.¿Las operaciones seran de solo lectura?
		4.¿Necesito que los objetos esten ordenados?*/
		Set <Cliente> clientesBanco=new HashSet <Cliente>();
		clientesBanco.add(c1);
		clientesBanco.add(c2);
		clientesBanco.add(c3);
		clientesBanco.add(c4);
		clientesBanco.add(c15);
		System.out.println(c15.equals(c1));
	
		Iterator<Cliente> t=clientesBanco.iterator();
		while(t.hasNext()) {
			String nombre=t.next().getNombre();
			if(nombre.equals("Penelope cruz")) {
				t.remove();
			}
			//System.out.println(nombre);
			
		}
		for(Cliente cliente: clientesBanco) {
			System.out.println(cliente.getNombre()+" "+cliente.getSaldo()+" "+cliente.getN_cuentas());
			}
		
		
		
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((n_cuentas == null) ? 0 : n_cuentas.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cliente other = (Cliente) obj;
		if (n_cuentas == null) {
			if (other.n_cuentas != null)
				return false;
		} else if (!n_cuentas.equals(other.n_cuentas))
			return false;
		return true;
	}
}
