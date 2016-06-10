/**
 * 
 */
package cl.curso.java.control_cinco.gmadrid;

import java.util.Collections;
import java.util.List;

/**
 * @author Gonzalo Madrid
 *
 */
public class CuentaBancaria {

	private int numero;
	private List<Transaccion> transacciones;

	/**
	 * @param numero
	 * @param transacciones
	 */
	public CuentaBancaria() {

	}

	/**
	 * @param numero
	 * @param transacciones
	 */
	public CuentaBancaria(int numero, List<Transaccion> transacciones) {
		super();
		this.numero = numero;
		this.transacciones = transacciones;
	}

	/**
	 * @return the numero
	 */
	public int getNumero() {
		return numero;
	}

	/**
	 * @param numero
	 *            the numero to set
	 */
	public void setNumero(int numero) {
		this.numero = numero;
	}

	/**
	 * @return the transacciones
	 */
	public List<Transaccion> getTransacciones() {
		return transacciones;
	}

	/**
	 * @param transacciones
	 *            the transacciones to set
	 */
	public void setTransacciones(List<Transaccion> transacciones) {
		this.transacciones = transacciones;
	}

	/**
	 * metodo ordenarTransaccionesPorFecha()
	 */
	public void ordenarTransaccionesPorFecha() {

		Collections.sort(transacciones, new Transaccion());
	}

	/**
	 * metodo ordenarTransaccionesPorTipo()
	 */
	public void ordenarTransaccionesPorTipo() {
		Collections.sort(transacciones, new Transaccion());

	}

	/**
	 * metodo imprimir
	 */
	public void imprimir() {
		for (Transaccion transaccion : transacciones) {
			System.out.println(getTransacciones());
		}

	}

}
