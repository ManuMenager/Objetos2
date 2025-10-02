package ar.edu.unq.po2.tp7.poquer;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PokerStatusTest {
	
	// Definiciones de variables globales.
	PokerStatus pokerStatus;
	PokerStatusV2 pokerStatusV2;
	
	@BeforeEach
	public void setUp() {
		// SetUp
		pokerStatus = new PokerStatus();
		pokerStatusV2 = new PokerStatusV2();
	}

	@Test
	public void testPokerStatusV1() {
		// Exercise
		boolean poker = pokerStatus.verificar("10C", "10P", "10D", "10T", "5P");
		boolean nada = pokerStatus.verificar("10P", "7T", "8D", "2C", "3T");
		
		// Verify
		assertTrue(poker);
		assertFalse(nada);
	}
	
	@Test
	public void testPokerStatusV2() {
		// Exercise
		String poker = pokerStatusV2.verificar("10C", "10P", "10D", "10T", "5P");
		String trio = pokerStatusV2.verificar("7P", "7T", "7C", "2C", "3T");
		String color = pokerStatusV2.verificar("10P", "7P", "8P", "2P", "3P");
		String nada = pokerStatusV2.verificar("10P", "7T", "8D", "2C", "3T");
		
		// Verify
		assertEquals("Poquer", poker);
		assertEquals("Trio", trio);
		assertEquals("Color", color);
		assertEquals("Nada", nada);
	}
}
