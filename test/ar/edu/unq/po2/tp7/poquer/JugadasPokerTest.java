package ar.edu.unq.po2.tp7.poquer;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class JugadasPokerTest {
	JugadaPoker pokerDiez;
	JugadaPoker pokerAz;
	JugadaPoker trio;
	JugadaPoker color;
	Carta cuatroDeCorazones;
	Carta diezDeCorazones;
	Carta diezDePicas;
	Carta diezDeDiamante;
	Carta diezDeTrebol;
	Carta azDeCorazones;
	Carta dosDeCorazones;
	Carta seisDeCorazones;
	Carta azDeDiamante;
	Carta azDeTrebol;
	Carta azDePicas;
	
	@BeforeEach
	public void setUp() {
		// Setup
		cuatroDeCorazones = mock(Carta.class);
		diezDeCorazones = mock(Carta.class);
		diezDePicas = mock(Carta.class);
		diezDeDiamante = mock(Carta.class);
		diezDeTrebol = mock(Carta.class);
		azDeCorazones = mock(Carta.class);
		dosDeCorazones = mock(Carta.class);
		seisDeCorazones = mock(Carta.class);
		azDeDiamante = mock(Carta.class);
		azDeTrebol = mock(Carta.class);
		azDePicas = mock(Carta.class);
		
		ArrayList<Carta> cartasPokerDiez = new ArrayList<>(Arrays.asList(diezDeDiamante, diezDeCorazones, diezDeTrebol, diezDePicas));
		ArrayList<Carta> cartasPokerAz = new ArrayList<>(Arrays.asList(azDeDiamante, azDeCorazones, azDeTrebol, azDePicas));
		ArrayList<Carta> cartasTrio = new ArrayList<>(Arrays.asList(diezDeDiamante, diezDeCorazones, diezDeTrebol));
		ArrayList<Carta> cartasColor = new ArrayList<>(Arrays.asList(dosDeCorazones, azDeCorazones, seisDeCorazones, cuatroDeCorazones, diezDeCorazones));
		
		pokerDiez = new Poker(cartasPokerDiez);
		pokerAz = new Poker(cartasPokerAz);
		trio = new Trio(cartasTrio);
		color = new Color(cartasColor); 
	}
	
	@Test
	public void jugadasPokerTest() {
		when(pokerDiez.valorCartas()).thenReturn(Valor.DIEZ);
		when(pokerAz.valorCartas()).thenReturn(Valor.A);
		
		// Exercise
		boolean pokerAColor = pokerDiez.leGanaA(color);
		boolean pokerATrio = pokerAz.leGanaA(trio);
		boolean pokerAPoker = pokerAz.leGanaA(pokerDiez);
		boolean pokerAPoker2 = pokerDiez.leGanaA(pokerAz);
		boolean colorATrio = color.leGanaA(trio);
		boolean trioAColor = trio.leGanaA(color);
		
		// Verify
		assertTrue(pokerAColor);
		assertTrue(pokerATrio);
		assertTrue(pokerAPoker);
		assertTrue(colorATrio);
		assertFalse(pokerAPoker2);
		assertFalse(trioAColor);
	}
	
	// 3. Test Doubles : Carta -> Stub (Ya que solo devuelve valores pero no realiza la función de verificar nada).
}
