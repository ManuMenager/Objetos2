package ar.edu.unq.po2.tp4.trabajador;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TrabajadorTest {
	private Trabajador trabajador;
	private Ingreso ingresoComun;
	private IngresoPorHorasExtras ingresoExtra;
	
	@BeforeEach
	public void setUp() {
		trabajador = new Trabajador();
		ingresoComun = new Ingreso("Agosto", "Pago de la primer semana", 300000);
		ingresoExtra = new IngresoPorHorasExtras("Agosto", "Proyecto extra", 50000, 4);
		trabajador.agregarIngreso(ingresoComun);
		trabajador.agregarIngreso(ingresoExtra);
	}
	
	@Test
	public void testTrabajador() {
		assertEquals(6000 ,trabajador.getImpuestoAPagar());
		assertEquals(300000 ,trabajador.getMontoImponible());
		assertEquals(350000 ,trabajador.getTotalMontoPercibido());
	}
}
