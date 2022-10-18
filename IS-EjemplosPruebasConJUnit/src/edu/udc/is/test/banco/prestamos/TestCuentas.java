package edu.udc.is.test.banco.prestamos;

public class TestCuentas {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Prestamo prestamo = new PrestamoInteresDirecto( 12000.00, 0.35, 12);
		prestamo.calcularPlan();
		double recupero = 0.0;
		for (Cuota cuota: prestamo.getCuotas()){
			recupero += cuota.getCapital();
		}
		
		System.out.println(recupero  + " " + prestamo.getCapital());
		
		
	}
}
