package cl.curso.java.control;

public class Articulo {

	int precioAlDetalle;
	int precioAlMayor;
	

public Articulo (){
	precioAlDetalle=30;
	precioAlMayor=15;
	}


public int Articulo (int pAd, int pAm ){

	return this.precioAlDetalle=pAd;
	return this.precioAlMayor=pAm;
	System.out.println("La cantidad es" + this.precioAlDetalle+this.precioAlMayor);

}
