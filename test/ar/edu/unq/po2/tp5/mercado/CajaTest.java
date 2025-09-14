package ar.edu.unq.po2.tp5.mercado;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class CajaTest {
	private Caja caja;
	private ProductoTradicional leche;
	private ProductoCooperativa harina;
	
	@BeforeEach
	public void setUp() {
		caja = new Caja();
		leche = new ProductoTradicional(1380, 63);
		harina = new ProductoCooperativa(1560, 45);
	}
	
	@Test
	public void cajaTest() {
		assertEquals(63, leche.getStock());
		caja.registrarProducto(leche);
		assertEquals(62, leche.getStock());
		assertEquals(1380, caja.montoTotal());
		caja.registrarProducto(harina);
		assertEquals(2784, caja.montoTotal());
	}
}
