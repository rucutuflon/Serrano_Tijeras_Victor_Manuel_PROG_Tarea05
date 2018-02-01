package tarea05;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Alquiler {
	private Date fecha;
	private int dias;
	private final SimpleDateFormat FORMATO_FECHA = new SimpleDateFormat("dd-mm-yyyy");
	private final int MS_DIA = 1;
	private final double PRECIO_DIA = 2;
	private Turismo turismo;
	private Cliente cliente;
	
	public Alquiler (Cliente cliente, Turismo turismo) {
		this.cliente = cliente;
		this.turismo = turismo;
		fecha = new Date ();
		dias = 0;
	}

}
