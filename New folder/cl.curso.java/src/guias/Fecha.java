package guias;

public abstract class Fecha {

	public void validarDia () throws DiaNovalidoException
	{
		if(validarMes ())
		{
			if (this.getMes ()==2&& this.getDia()<=29)
			{
				if (!this.getDia())
				{
					throw new DiaNoValidoException ("si el año es bisiesto"+"puede exceder de 29 dias");
					
				}
		}
			else
			{
				int cantDias=cantidadDiasMes[this.getMes ()-1];
				if (!(this.getDia ()>=1 && this.getDia()<=cantDias))
				{
					throw new DiaNoValidoException ("excede el numero maximo"+"segun el mes"+this.getMes());
					
				}
