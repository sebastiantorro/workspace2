package ejemplos;

public class motor {
	int caballosDefuerza;
	String tipo;
    boolean encendido;
    
	public motor() {
		this.caballosDefuerza = 1000;
	}

	public motor(int caballosDeFuerza) {
		this.caballosDefuerza = caballosDeFuerza;
	}

	public motor(int caballosDeFuerza, String tipo) {
		super();
		this.caballosDefuerza = caballosDeFuerza;
		this.tipo = tipo;
	}

	public int getCaballosDeFuerza(){
		return caballosDefuerza;
	
	}
	
	public void setCaballosDeFuerza(int caballosDefuerza){
		this.caballosDefuerza=caballosDefuerza;
				
		
	}

}
