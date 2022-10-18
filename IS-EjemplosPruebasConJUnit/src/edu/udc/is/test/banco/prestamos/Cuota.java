package edu.udc.is.test.banco.prestamos;

public class Cuota {

	private int numero;
	private double capital;
	private double intereses;
	
	public Cuota(int numero, double capital, double intereses) {
		super();
		this.numero = numero;
		this.capital = capital;
		this.intereses = intereses;
	}
	
	public int getNumero() {
		return numero;
	}

	public double getCapital() {
		return capital;
	}
	
	public double getIntereses() {
		return intereses;
	}
	
	@Override
	public String toString() {
		return this.getNumero() + "   " +  this.getCapital() + "  " + this.getIntereses();
	}
	
}
