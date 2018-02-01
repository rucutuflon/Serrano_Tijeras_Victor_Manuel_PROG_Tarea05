package tarea05;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Cliente {
	private String nombre;
	private String direccion;
	private String localidad;
	private String codigoPostal;
	private int identificador;
	private static int numClientes= 0;
	
	public Cliente  (String nombre, String direccion, String localidad, String codigoPostal) 
						throws ExcepcionAlquilerVehiculos {
		this.nombre = nombre;
		this.direccion = direccion;
		this.localidad = localidad;
		if (comprobarCodigoPostal (codigoPostal) == false)
			throw new ExcepcionAlquilerVehiculos ("Error de codigo postal");
		this.codigoPostal = codigoPostal;
		numClientes++;
		this.identificador = numClientes;
	}
	
	private boolean comprobarCodigoPostal(String codigoPostal2) {
		Pattern p = Pattern.compile("[0-9]{5}");
		Matcher m = p.matcher(codigoPostal2);
		if ( ! m.matches())
			return false;
		return true;
	}

	public Cliente  (Cliente cliente) 
			throws ExcepcionAlquilerVehiculos {
		this.nombre = cliente.nombre;
		this.direccion = cliente.direccion;
		this.localidad = cliente.localidad;
		this.codigoPostal = cliente.codigoPostal;
		numClientes++;
		this.identificador = numClientes;
	}

	public String getNombre() {
		return nombre;
	}

	public String getDireccion() {
		return direccion;
	}

	public String getLocalidad() {
		return localidad;
	}

	public String getCodigoPostal() {
		return codigoPostal;
	}

	public int getIdentificador() {
		return identificador;
	}

	public static int getNumClientes() {
		return numClientes;
	}

	public String toString() {
		return "(" + nombre + ", " + direccion + ", " + localidad + ", " + codigoPostal + ", " + identificador + ")";
	}
	
	
}
