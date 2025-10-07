package ar.edu.unq.po2.tp8.composite.juegoDeEstrategia;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.never;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PersonajeTest {
	Personaje ingenieroA;
	Personaje caballeroA;
	Personaje ingenieroB;
	Personaje caballeroB;
	Personaje ejercito;
	Personaje ingenieroSinLajas;
	Tupla<Integer, Integer> inicioRecorrido;
	Tupla<Integer, Integer> finRecorrido;
	
	@BeforeEach
	public void setUp() {
		ingenieroA = mock(Ingeniero.class);
		caballeroA = mock(Caballero.class);
		ingenieroB = mock(Ingeniero.class);
		caballeroA = mock(Caballero.class);
		ingenieroSinLajas = mock(Ingeniero.class);
		
		ejercito = new Ejercito();
		ejercito.agregar(caballeroB);
		ejercito.agregar(ingenieroB);
		
		inicioRecorrido = new Tupla<>(3, 3);
		finRecorrido = new Tupla<>(3, 3);
	}
	

	@Test
	void caminarTest() {
		// Exercise
		ingenieroA.caminar(inicioRecorrido, finRecorrido);
		caballeroA.caminar(inicioRecorrido, finRecorrido);
		ejercito.caminar(inicioRecorrido, finRecorrido);
		
		// Verify
		verify(ingenieroA, times(3)).colocarLaja();
		assertEquals(finRecorrido, ingenieroA.getPosicion());
		verify(caballeroA, times(3)).avanzarEnZigZag();
		assertEquals(finRecorrido, caballeroA.getPosicion());
		assertEquals(finRecorrido, ejercito.getPosicion());
	}
	
	void caminarPeroSinLajasTest() {	
		// Exercise
		ingenieroSinLajas.caminar(inicioRecorrido, finRecorrido);
		
		// Verify
		verify(ingenieroSinLajas, never()).colocarLaja();
		assertEquals(finRecorrido, ingenieroSinLajas.getPosicion());
	}
}
