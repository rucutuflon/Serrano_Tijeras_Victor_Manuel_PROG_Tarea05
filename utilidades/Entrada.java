package utilidades;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Clase que nos permite leer datos por teclado asegur�ndose
 * que el tipo de dato introducido es compatible con el esperado.
 * 
 * @author pepino
 */
public class Entrada {
	
	/**
	 * M�todo est�tico que lee una cadena por teclado
	 * @return la cadena le�da
	 */
	public static String cadena() {
            String valor = "";
            InputStreamReader flujo = new InputStreamReader(System.in);
            BufferedReader teclado = new BufferedReader(flujo);
            try {
                    valor = teclado.readLine();
            } catch (IOException e) {
                    System.out.print("Error de Entrada/Salida. Int�ntalo de nuevo: ");
            }
            return valor;
	}

	/**
	 * M�todo est�tico que lee un entero por teclado y se asegura
	 * que el valor introducido es compatible con un entero
	 * @return el entero le�do
	 */
	public static int entero() {
            int valor = 0;
            boolean leido = false;
            do {
                    try {
                            valor = Integer.parseInt(cadena());
                            leido = true;
                    } catch (NumberFormatException e) {
                            System.out.print("ERROR: Esperaba un entero. Int�ntalo de nuevo: ");
                    }
            } while (!leido);
            return valor;
	}
	
	/**
	 * M�todo est�tico que lee un entero largo (long) por teclado y se asegura
	 * que el valor introducido es compatible con un entero largo
	 * @return el entero largo le�do
	 */
	public static long enteroLargo() {
            long valor = 0;
            boolean leido = false;
            do {
                    try {
                            valor = Long.parseLong(cadena());
                            leido = true;
                    } catch (NumberFormatException e) {
                            System.out.print("ERROR: Esperaba un entero largo. Int�ntalo de nuevo: ");
                    }
            } while (!leido);
            return valor;
	}
	
	/**
	 * M�todo est�tico que lee un real (float) por teclado y se asegura
	 * que el valor introducido es compatible con un real
	 * @return el real le�do
	 */
	public static float real() {
            float valor = 0;
            boolean leido = false;
            do {
                    try {
                            valor = Float.parseFloat(cadena());
                            leido = true;
                    } catch (NumberFormatException e) {
                            System.out.print("ERROR: Esperaba un real. Int�ntalo de nuevo: ");
                    }
            } while (!leido);
            return valor;
	}
	
	/**
	 * M�todo est�tico que lee un real de doble precisi�n (double) 
	 * por teclado y se asegura que el valor introducido es compatible 
	 * con un real de doble precisi�n
	 * @return el real de doble precisi�n le�do
	 */
	public static double realDoble() {
            double valor = 0;
            boolean leido = false;
            do {
                    try {
                            valor = Double.parseDouble(cadena());
                            leido = true;
                    } catch (NumberFormatException e) {
                            System.out.print("ERROR: Esperaba un real de doble precisi�n. Int�ntalo de nuevo: ");
                    }
            } while (!leido);
            return valor;
	}
	
	/**
	 * M�todo est�tico que lee un caracter por teclado y se asegura
	 * que el valor introducido es compatible con un caracter
	 * @return el caracter le�do
	 */
	public static char caracter() {
            String valor = "";
            boolean leido = false;
            do {
                    valor = cadena();
                    if (valor.length() == 1)
                            leido = true;
                    else 
                            System.out.print("ERROR: Esperaba un caracter. Int�ntalo de nuevo: ");
            } while (!leido);
            return valor.charAt(0);
	}

}