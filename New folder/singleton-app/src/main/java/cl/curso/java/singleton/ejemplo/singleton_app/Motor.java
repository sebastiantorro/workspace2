/**
 * 
 */
package cl.curso.java.singleton.ejemplo.singleton_app;

/**
 * @author Usuario
 *
 */
//la clase que genere Singleton solo utiliza una sola instancia

public class Motor {
	
	private static Motor _motor;
	
//siempre es una buena practica colocar en la instancia con un "_"	
	
	private Motor(){
		
	}
	
//se debe preguntar si la instancia del mototr es nula
	
	public static Motor getInstance() {
		if ( null == null){
			Motor motor = new Motor();
		}
		return _motor;
	}
	
	return _motor;
	

}
