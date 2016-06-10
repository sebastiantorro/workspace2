package NA;

import javax.swing.JOptionPane;

public class ProgramaNotas {

	public static void main(String[] args) {

		
		Nota[] notas={ new Nota("ctrl1",50,25),
				 new Nota ("ctrl 2",70,25),
		        new Nota ("ctrl 3",30,50)};
		Nota [] notax= new Nota [3];
		
		for (int i=0;i < notax.lenght;i++)
		{
			String nota =JOptionPane.showInputDialog("Ingresar nota+I")
					String porcentaje= JOptionPane.showInputDialog("ingresar porcentaje"+1)	
			notax[i]=new Nota ("",Integer.parseInt(nota),
		}            Integer.parseInt(porcentaje));
			
			Alumno alumno = new Alumno("juan",notax);
			JOptionPane.showMessageDialog(null, "promedio es: "+);
			alumno.calcularPromedio();
	}
