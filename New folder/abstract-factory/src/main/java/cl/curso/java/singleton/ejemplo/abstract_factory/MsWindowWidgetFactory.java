/**
 * 
 */
package cl.curso.java.singleton.ejemplo.abstract_factory;

/**
 * @author Usuario
 *
 */
public class MsWindowWidgetFactory implements AbstractWidgetFactory{

	public Window createWindow() {
		// TODO Auto-generated method stub
		return new MSWindow();
	}
	
	

}