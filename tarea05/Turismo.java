package tarea05;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Turismo {
	private String matricula;
	private String marca;
	private String modelo;
	private int cilindrada;
	
	public Turismo (String matricula, String marca, String modelo, int cilindrada) 
					throws ExcepcionAlquilerVehiculos {
		if (comprobarMatricula(matricula) == false)
			throw new ExcepcionAlquilerVehiculos("Error, matricula no valida");
		this.matricula = matricula;
		this.marca = marca;
		this.modelo = modelo;
		this.cilindrada = cilindrada;
	}

	private boolean comprobarMatricula(String matricula) {
		Pattern p = Pattern.compile("[0-9]{4}[A-Z]{3}");
		Matcher m = p.matcher(matricula);
		if ( ! m.matches())
			return false;
		return true;
	}

	public String getMatricula() {
		return matricula;
	}

	public String getMarca() {
		return marca;
	}

	public String getModelo() {
		return modelo;
	}

	public int getCilindrada() {
		return cilindrada;
	}
	
	@Override
	public String toString() {
		return "Turismo [matricula=" + matricula + ", marca=" + marca + ", modelo=" + modelo + ", cilindrada="
				+ cilindrada + "]";
	}

}
