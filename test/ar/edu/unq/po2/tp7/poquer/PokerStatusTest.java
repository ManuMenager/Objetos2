package ar.edu.unq.po2.tp7.poquer;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PokerStatusTest {
	
	// Definiciones de variables globales.
	PokerStatus pokerStatus;
	PokerStatusV2 pokerStatusV2;
	Carta cuatroDeCorazones;
	Carta doceDePicas;
	Carta diezDeCorazones;
	Carta diezDePicas;
	Carta diezDeDiamante;
	Carta diezDeTrebol;
	Carta azDeCorazones;
	Carta dosDeCorazones;
	Carta seisDeCorazones;
	
	@BeforeEach
	public void setUp() {
		// SetUp
		// SUT : pokerStatus
		pokerStatus = new PokerStatus();
		pokerStatusV2 = new PokerStatusV2();
		
		// DOC : doubles
		cuatroDeCorazones = mock(Carta.class);
		doceDePicas = mock(Carta.class);
		diezDeCorazones = mock(Carta.class);
		diezDePicas = mock(Carta.class);
		diezDeDiamante = mock(Carta.class);
		diezDeTrebol = mock(Carta.class);
		azDeCorazones = mock(Carta.class);
		dosDeCorazones = mock(Carta.class);
		seisDeCorazones = mock(Carta.class);
		
		when(cuatroDeCorazones.getValor()).thenReturn(4);
		when(doceDePicas.getValor()).thenReturn(12);
		when(diezDeCorazones.getValor()).thenReturn(10);
		when(diezDePicas.getValor()).thenReturn(10);
		when(diezDeDiamante.getValor()).thenReturn(10);
		when(diezDeTrebol.getValor()).thenReturn(10);
		when(azDeCorazones.getValor()).thenReturn(1);
		when(dosDeCorazones.getValor()).thenReturn(2);
		when(seisDeCorazones.getValor()).thenReturn(6);
		
		when(cuatroDeCorazones.getPalo()).thenReturn("Corazones");
		when(doceDePicas.getPalo()).thenReturn("Picas");
		when(diezDeCorazones.getPalo()).thenReturn("Corazones");
		when(diezDePicas.getPalo()).thenReturn("Picas");
		when(diezDeDiamante.getPalo()).thenReturn("Diamante");
		when(diezDeTrebol.getPalo()).thenReturn("Trebol");
		when(azDeCorazones.getPalo()).thenReturn("Corazones");
		when(dosDeCorazones.getPalo()).thenReturn("Corazones");
		when(seisDeCorazones.getPalo()).thenReturn("Corazones");
	}

	@Test
	public void testPokerStatusV1() {
		// Exercise
		boolean poker = pokerStatus.verificar(diezDeCorazones, diezDePicas, diezDeDiamante, diezDeTrebol, cuatroDeCorazones);
		boolean nada = pokerStatus.verificar(diezDeDiamante, dosDeCorazones, azDeCorazones, doceDePicas, diezDeTrebol);
		
		// Verify
		assertTrue(poker);
		assertFalse(nada);
	}
	
	@Test
	public void testPokerStatusV2() {
		// Exercise
		String poker = pokerStatusV2.verificar(diezDeCorazones, diezDePicas, diezDeDiamante, diezDeTrebol, cuatroDeCorazones);
		String trio = pokerStatusV2.verificar(diezDeCorazones, diezDePicas, diezDeDiamante, doceDePicas, cuatroDeCorazones);
		String color = pokerStatusV2.verificar(dosDeCorazones, azDeCorazones, seisDeCorazones, cuatroDeCorazones, diezDeCorazones);
		String nada = pokerStatusV2.verificar(diezDeDiamante, dosDeCorazones, azDeCorazones, doceDePicas, diezDeTrebol);
		
		// Verify
		assertEquals("Poquer", poker);
		assertEquals("Trio", trio);
		assertEquals("Color", color);
		assertEquals("Nada", nada);
	}
}
