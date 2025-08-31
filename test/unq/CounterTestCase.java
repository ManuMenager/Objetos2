package unq;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unq.po2.tp3.Counter;

public class CounterTestCase {
	private Counter counter;
	
	/**
	* Crea un escenario de test básico, que consiste en un contador
	* con 10 enteros
	*
	* @throws Exception
	*/
	
	@BeforeEach
	public void setUp() throws Exception {
		//Se crea el contador
		counter = new Counter();
		//Se agregan los numeros. Un solo par y nueve impares
		counter.addNumber(1);
		counter.addNumber(3);
		counter.addNumber(5);
		counter.addNumber(7);
		counter.addNumber(9);
		counter.addNumber(1);
		counter.addNumber(1);
		counter.addNumber(1);
		counter.addNumber(1);
		counter.addNumber(4);
	}
	
	// Verifica la cantidad de pares
	@Test
	public void testCantidadDePares() {
		assertEquals(counter.cantPares(), 1);
	}
	
	// Verifica la cantidad de impares
	@Test
	public void testCantidadDeImpares() {
		assertEquals(counter.cantImpares(), 9);
	}
	
	// Verifica la cantidad de multiplos del número dado
	@Test
	public void testCantidadDeMultiplos() {
		assertEquals(counter.cantMultiplos(3), 2);
	}
	
	
	// Ejercicio 2
	
	@Test
	public void testNumeroConMasPares() {
		ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(156,222,457,-2));
		assertEquals(counter.numeroConMasPares(numbers), 222);
	}
	
	@Test
	public void testNumeroConMasParesStream() {
		ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(156,222,457,-2));
		assertEquals(counter.numeroConMasParesStream(numbers), 222);
	}
	
	
	//Ejercicio 3
	
	@Test
	public void elNumeroMultiploMasGrande() {
		assertEquals(counter.elNumeroMultiploMasGrande(3, 9), 999);
	}
	
}