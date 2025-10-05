package ar.edu.unq.po2.tp8.state;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MaquinaTest {
	Maquina maquina;
	
	// Utilizar Mockito para hacer un Spy y asi saber que mensaje le llega a Juego.
	
	@BeforeEach
	public void setUp() {
		maquina = new Maquina();
	}
	
	@Test
	public void testMaquina() {
		assertEquals("Ingrese una ficha", maquina.iniciar());
		maquina.ingresarFicha();
		assertEquals("Un jugador jugando", maquina.iniciar());
		maquina.ingresarFicha();
		maquina.ingresarFicha();
		assertEquals("Dos jugadores jugando", maquina.iniciar());
	}
}