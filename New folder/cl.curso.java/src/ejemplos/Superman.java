package ejemplos;

public class Superman extends SuperHeroes {

	@Override
	public void RecibirAtaque(Armas armas) {
		if (armas instanceof Criptonita)
		{
			System.out.println("muere");
		}
		else{
			
			if (armas instanceof Granada)
					System.out.println("vive");
				}
		}
		
			
		
		
	

}
