package unq;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unq.po2.tp3.Multioperador;

public class MultioperadorTest {
	
	private Multioperador operador = new Multioperador();
	private ArrayList<Integer> miArray;

	@BeforeEach
	public void setUp() throws Exception {
		//Se crea el contador
		miArray = new ArrayList<>();
		//Se agregan los numeros. Un solo par y nueve impares
		miArray.add(1);
		miArray.add(3);
		miArray.add(5);
		miArray.add(7);
	}
	
	@Test
	public void testSumarTodos() {
		assertEquals(operador.sumarTodos(miArray), 16);
	}
	
	@Test
	public void testRestarTodos() {
		assertEquals(operador.restarTodos(miArray), -14);
	}
	
	@Test
	public void testMultiplicarTodos() {
		assertEquals(operador.multiplicarTodos(miArray), 105);
	}
	
}