/**
 * 
 */
package cl.curso.java.control_cinco.gmadrid;

import java.util.Comparator;

/**
 * @author Gonzalo Madrid
 *
 */
public class Empleado extends Persona implements Comparator<Empleado> {
	private Departamento departamento;
	private int salario;

	/**
	 * @param departamento
	 * @param salario
	 */
	public Empleado() {

	}

	/**
	 * @param departamento
	 * @param salario
	 */
	public Empleado(Departamento departamento, int salario) {
		super();
		this.departamento = departamento;
		this.salario = salario;
	}

	/**
	 * @return the departamento
	 */
	public Departamento getDepartamento() {
		return departamento;
	}

	/**
	 * @param departamento
	 *            the departamento to set
	 */
	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}

	/**
	 * @return the salario
	 */
	public int getSalario() {
		return salario;
	}

	/**
	 * @param salario
	 *            the salario to set
	 */
	public void setSalario(int salario) {
		this.salario = salario;
	}

	/**
	 * metodo equals que comparan si dos empleados son iguales segun su rut
	 */
	@Override
	public boolean equals(Object obj) {
		return this.getRut() == ((Persona) obj).getRut();

	}

	@Override
	public int compare(Empleado o1, Empleado o2) {

		return o1.getNombre().compareTo(o2.getNombre());
	}

}