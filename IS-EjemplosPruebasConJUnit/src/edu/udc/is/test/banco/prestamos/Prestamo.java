package edu.udc.is.test.banco.prestamos;

public abstract class Prestamo {
	
	private double capital;
	private double interesAnual;
	private int cantidadCuotas;
	protected Cuota[] cuotas;
	
	
	
	public Prestamo(double capital, double interesAnual, int cantidadCuotas) {
		super();
		this.capital = capital;
		this.interesAnual = interesAnual;
		this.cantidadCuotas = cantidadCuotas;
	}

	public abstract void calcularPlan();
	
	public int getCantidadCuotas() {
		return cantidadCuotas;
	}
	
	public double getCapital() {
		return capital;
	}
	
	public double getInteresAnual() {
		return interesAnual;
	}
	
	public Cuota[] getCuotas() {
		return cuotas;
	}
	
	@Override
	public String toString() {
		String s = "Capital: " + this.getCapital() + " - Intereses: " + this.getInteresAnual() + " - " 
					+ this.getCantidadCuotas() + " cuotas \n";
		for (Cuota cuota: this.cuotas){
			s = "   " +  cuota.toString();
		}
		return s;
	}
	
}
