public class Alumno {
String nombre;
int nota1;
int nota2;
int nota3;

public Alumno() {
	this.nombre= "German";
	this.nota1=40;
	this.nota2=50;
	this.nota3=60;
	

	
}

public Alumno (String nombre,String apellidoPaterno, String apellidoMaterno,int edad)
{
	this.nombre=nombre;
	this.apellidoPaterno=apellidoPaterno;
	this.apellidoMaterno=apellidoMaterno;
	this.edad=edad;

}

public void imprimir ()
{
	
System.out.println(this.nombre);
System.out.println(this.apellidoPaterno);
System.out.println(this.apellidoMaterno);
System.out.println(this.edad);
}