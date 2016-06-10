package ejemplos;

import javax.swing.JOptionPane;

public class programa {

	public static void main(String[] args)

	{
		boolean opcionSalir = false;
		do
		{
			
			String opcion = JOptionPane.showInputDialog("opcion 1: Encender auto\n"+ "opcion 2: Avanzar \n"+"opcion 3 : Imprimir\n"+"opcion 4: salir");
			
			switch (opcion)
			{
			
			  case "1":
			  {
				  autoToyota.encender();
				  break;
			  }
			  case "2":
				 String kilometros = JOptionPane.showInputDialog("ingrese autoToyota.avanzar( Integer.parseInt)(kilometros) );"
				 		
				  autoToyota.encender();
				  break;
			  {		  
			  
			  case "3":
			  {
			   autoToyota.imprimir();
				  break;
			  }
			  case "4":
			  {
				  opcionSalir =!opcionSalir;
			      break;
			  
			  {
			  default:
			  { 
				 break;
			  }
			}
		}
			  
		         
while (!opcionSalir);
auto autoToyota = new auto("rojo", "toyota", "aaaa23");
motor motorToyota = new motor (2000, "bencina");
autoToyota.setMotor(motorToyota);
autoToyota.setColor ("verde");


autoToyota.avanzar();
autoToyota.encender();
autoToyota.avanzar();




auto autoHonda = new auto ("blanco","honda", "aaaa24");
auto autoDefecto= new Auto();
 autoToyota.avanzar();
 System.out.println(autoToyota.getColor());
 autoToyota.setColor("verde");
 System.out.println(autoToyota.getColor());
 autoToyota.setMarca("autoToyota");
 
 
 
 autoHonda.avanzar();
 System.out.println(autoToyota.getColor());
 autoDefecto.avanzar ();
 System.out.println(autoToyota.getColor());
 
 
	}

}
