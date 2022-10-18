package edu.udc.is.test.banco.prestamos;
import edu.udc.is.test.banco.prestamos.test.MathUtils;

public class PrestamoInteresDirecto extends Prestamo {
	
	public PrestamoInteresDirecto(double capital, double interesAnual,
			int cantidadCuotas) {
		super(capital, interesAnual, cantidadCuotas);
	}

	@Override
	public void calcularPlan() {
		this.cuotas = new Cuota[this.getCantidadCuotas()];
		double interes = this.getCapital() * this.getInteresAnual() * this.getCantidadCuotas() / 12;
		for (int i = 0;  i < this.cuotas.length ; i++) {
			cuotas[i] = new Cuota(i+1, MathUtils.aplicarRedondeo(this.getCapital()/this.getCantidadCuotas()), interes);
		}
	}
}
