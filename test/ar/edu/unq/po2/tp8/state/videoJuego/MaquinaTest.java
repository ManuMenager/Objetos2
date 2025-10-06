package ar.edu.unq.po2.tp8.state.videoJuego;

import static org.mockito.Mockito.inOrder;
import static org.mockito.Mockito.spy;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InOrder;

import ar.edu.unq.po2.tp8.state.videoJuego.Maquina;
import ar.edu.unq.po2.tp8.state.videoJuego.Pantalla;

public class MaquinaTest {
	Maquina maquina;
	Pantalla spyPantalla;
	
	@BeforeEach
	public void setUp() {
		spyPantalla = spy(new Pantalla());
		maquina = new Maquina(spyPantalla);
	}
	
	@Test
	public void testMaquina() {
		// Exercise
		maquina.iniciar();
		maquina.ingresarFicha();
		maquina.iniciar();
		maquina.ingresarFicha();
		maquina.ingresarFicha();
		maquina.iniciar();

		// Verify
		InOrder orden = inOrder(spyPantalla);			
		orden.verify(spyPantalla).mostrar("Ingrese al menos una ficha");
		orden.verify(spyPantalla).mostrar("Modo: Un Jugador");
		orden.verify(spyPantalla).mostrar("Modo: Dos Jugadores");
	}
}