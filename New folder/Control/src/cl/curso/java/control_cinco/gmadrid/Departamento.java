/**
 * 
 */
package cl.curso.java.control_cinco.gmadrid;

import java.util.Comparator;

/**
 * @author Gonzalo Madrid
 *
 */
public class Departamento implements Comparator<Departamento> {
	private String nombre;
	private String descripcion;

	/**
	 * @param nombre
	 * @param descripcion
	 */
	public Departamento() {

	}

	/**
	 * @param nombre
	 * @param descripcion
	 */
	public Departamento(String nombre, String descripcion) {
		super();
		this.nombre = nombre;
		this.descripcion = descripcion;
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre
	 *            the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return the descripcion
	 */
	public String getDescripcion() {
		return descripcion;
	}

	/**
	 * @param descripcion
	 *            the descripcion to set
	 */
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	/**
	 * metodo equals
	 */
	@Override
	public boolean equals(Object obj) {
		return super.equals(obj);
	}

	@Override
	public int compare(Departamento o1, Departamento o2) {

		return o1.getNombre().compareTo(o2.getNombre());
	}

}