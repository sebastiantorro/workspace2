package ejemplos;

public class CuentaVista {

	//atributos
	private int saldo;
	private int giroMaximo;
	
	//constructores
	public CuentaVista ()
	{
		this.saldo=0;
		this.giroMaximo=200000;
		
	}
	
	public CuentaVista (int saldo, int giroMaximo)
	{
		this.saldo=saldo;
		this.giroMaximo=giroMaximo;
		
		//accesadores y mutadores
		
		/**
		 * @return the giroMaximo
		 */
		
		
		
		public void depositar (int deposito){
			if (montoAGirar > this.giroMaximo);
			{
				System.out.println("El saldo a retirar excede ");
			}
		}
	
}
