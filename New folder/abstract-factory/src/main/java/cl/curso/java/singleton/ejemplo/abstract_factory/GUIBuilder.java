/**
 * 
 */
package cl.curso.java.singleton.ejemplo.abstract_factory;

/**
 * @author Usuario
 *
 */
public class GUIBuilder {
	
	public Window buildWindow ( AbstractWidgetFactory factory)
	{
		return factory.createWindow();
	}
	

	
	
	
	
	
	
}