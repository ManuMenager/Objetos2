package ar.edu.unq.po2.tp5.mercado;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

public class CajaTest {
	private Caja caja;
	private ProductoTradicional leche;
	private ProductoCooperativa harina;
	private Agencia agencia;
	private FacturaServicio internet;
	private FacturaImpuesto municipal;
	
	@BeforeEach
	public void setUp() {
		agencia = new AgenciaEjemplo();
		caja = new Caja(new ArrayList<Cobrable>(), agencia);
		leche = new ProductoTradicional(1380, 63);
		harina = new ProductoCooperativa(1560, 45);
		internet = new FacturaServicio(25000, 1);
		municipal = new FacturaImpuesto(45000);
	}
	
	@Test
	public void cajaTestEjercicio1() {
		assertEquals(63, leche.getStock());
		caja.registrarProducto(leche);
		assertEquals(62, leche.getStock());
		assertEquals(1380, caja.montoTotal());
		caja.registrarProducto(harina);
		assertEquals(2784, caja.montoTotal());
	}
	
	@Test
	public void cajaTestEjercicio2() {
		caja.registrarProducto(leche);
		caja.registrarProducto(harina);
		caja.registrarPago(internet);
		assertEquals(27784, caja.montoTotal());
		caja.registrarPago(municipal);
		assertEquals(72784, caja.montoTotal());
	}
}
