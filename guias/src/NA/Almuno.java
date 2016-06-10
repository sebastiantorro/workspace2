package NA;

public class Almuno {

private String nombre;
private int Notas;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Nota getNotas() {
		return Notas;
	}

	public void setNotas(Nota notas) {
		this.notas = notas;
	}

	public double calcularPromedio ()
	{
		for (int i=0; i <this.getNotas().lenght ; i++)
		{
			double nota = (this.getNotas()[i].getNota()*
			this.getNotas()[i].getPorcentaje())/100;
			notaFinal=notaFinal+nota;

		}
	
	

	
	
 public Almuno(String nombre, nota notas) {
		super();
		this.nombre = nombre;
		this.notas = notas;
	}

	{}
}
