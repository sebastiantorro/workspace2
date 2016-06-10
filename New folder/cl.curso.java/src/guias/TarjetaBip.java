package guias;

public abstract class TarjetaBip {
	int saldo;
	int nTarjeta;
	String color;

	public TarjetaBip(int saldo, int nTarjeta, String color) {
		super();
		this.saldo = saldo;
		this.nTarjeta = nTarjeta;
		this.color = color;
	}

	public int getSaldo() {
		return saldo;
	}

	public void setSaldo(int saldo) {
		this.saldo = saldo;
	}

	public int getnTarjeta() {
		return nTarjeta;
	}

	public void setnTarjeta(int nTarjeta) {
		this.nTarjeta = nTarjeta;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public abstract void recargar (int monto);
	
	public abstract void pagarViaje ();
	
}
