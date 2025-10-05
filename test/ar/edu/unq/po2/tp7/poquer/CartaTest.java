package ar.edu.unq.po2.tp7.poquer;



import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

public class CartaTest {
	Carta cuatroDeCorazones;
	Carta doceDePicas;
	Carta diezDeCorazones;
	
	@BeforeEach
	public void setUp() {
		cuatroDeCorazones = new Carta(Valor.CUATRO, "Corazones");
		doceDePicas = new Carta(Valor.Q, "Picas");
		diezDeCorazones = new Carta(Valor.DIEZ, "Corazones");
	}
	
	@Test
	public void comparacionDeCartasTest() {
		// Exercise
		boolean menor = cuatroDeCorazones.esMayorQue(doceDePicas);
		boolean mayor = doceDePicas.esMayorQue(cuatroDeCorazones);
		
		boolean igual = diezDeCorazones.tieneMismoPaloQue(cuatroDeCorazones);
		boolean distinto = diezDeCorazones.tieneMismoPaloQue(doceDePicas);
		
		// Verify
		assertTrue(mayor);
		assertFalse(menor);
		
		assertTrue(igual);
		assertFalse(distinto);
	}
}