package ejemplos;

import javax.swing.JOptionPane;

public class ProgramaCalculadora {

	public static void main(String[] args) {
		


	String numero1= JOptionPane.showInputDialog("ingrese numero");
    String numero2= JOptionPane.showInputDialog("ingrese numero");
    int n1= Integer.parseInt(numero1);
    int n2= Integer.parseInt(numero2);
    
   
    
    
    Calculadora cal= new Calculadora (n1,n2);
    int suma = cal.sumar ();
    System.out.println(suma);
    
    int 
}
