package Herencia;

public class Profesor extends Persona {

	
	public profesor (String [] cursos){
	super();
	this.cursos=cursos;

	
	private String[] cursos;
	
	public Profesor(String rut, String nombre, String apellidoPaterno, String apellidoMaterno, String[] cursos) {
		super(rut, nombre, apellidoPaterno, apellidoMaterno);
		this.cursos = cursos;
	}


}
