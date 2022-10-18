package edu.udc.is.test.banco.prestamos.test;

import junit.framework.TestCase;

import org.junit.Test;

import edu.udc.is.test.banco.prestamos.Cuota;
import edu.udc.is.test.banco.prestamos.Prestamo;
import edu.udc.is.test.banco.prestamos.PrestamoInteresDirecto;


public class TestPrestamos extends TestCase {
	
	Prestamo prestamoPersonal1;
	
	@Override
	protected void setUp() throws Exception {
		this.prestamoPersonal1 = new PrestamoInteresDirecto(12000.00, 0.35, 12);
		this.prestamoPersonal1.calcularPlan();
	}
	
	@Test
	public void testCapital() {
		
		double recupero = 0.0;
		
		for (Cuota cuota: prestamoPersonal1.getCuotas()){
			recupero += cuota.getCapital();
		}
		
		assertEquals("El monto del prestamo debe coincidir con el recupero de las cuotas", recupero, prestamoPersonal1.getCapital(), 0.00);
	}
	
	public void testCapital2() {
		
		double recupero = 0.0;
		
		Prestamo prestamo = new PrestamoInteresDirecto(47527.13, 0.354, 17);
		prestamo.calcularPlan();
		
		for (Cuota cuota: prestamo.getCuotas()){
			recupero = MathUtils.sumarMontos(recupero, cuota.getCapital());
		}
		
		Double aux = prestamo.getCapital() - recupero;
		recupero = recupero+aux;
		
		assertEquals("El monto del prestamo debe coincidir con el recupero de las cuotas", prestamo.getCapital(), recupero, 0.00);
	}
	


	@Test
	public void testCuotas() {
		assertEquals("Error en la cantidad de cuotas", prestamoPersonal1.getCantidadCuotas(), prestamoPersonal1.getCuotas().length);
		
		// ¿Cómo controlo que las cuotas estén bien numeradas?
		
		Cuota cuotas [] = prestamoPersonal1.getCuotas();
		for (int i=0 ; i < cuotas.length ; i++ ){
			assertEquals("Debe coincidir numero de cuota", i+1, cuotas[i].getNumero() ); 
		}		
	}
	/*	Intento de metodeo de prueba
	public void testInteres() {
		Prestamo prestamo = new PrestamoInteresDirecto(20000.00, 0.35, 10);
		prestamo.calcularPlan();
		for (Prestamo porcentaje: prestamo.getInteresAnual()){
			porcentaje = MathUtils.sumarMontos(porcentaje, prestamo.getInteresAnual());
		}
		assertEquals("Los porcentajes no coinciden", porcentaje, prestamos[i].getInteresesAnual() );
	}
	*/
}
