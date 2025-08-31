package ar.edu.unq.po2.tp3;

import java.util.ArrayList;
import java.util.function.Predicate;

public class Counter {
	
	private ArrayList<Integer> numbers = new ArrayList<Integer>();
	
	public void addNumber(int number) {
		numbers.add(number);
	}
	
	
	public int contarConCondicion(Predicate<Integer> condicion) {
		int contador = 0;
		for (Integer number : numbers) {
			if (condicion.test(number)) {
				contador++;
			}
		}
		return contador;
	}
	

	public int cantPares() {
		return contarConCondicion(number -> number % 2 == 0);
	}
	
	public int cantImpares() {
		return contarConCondicion(number -> number % 2 != 0);
	}
	
	public int cantMultiplos(int x) {
		return contarConCondicion(number -> number % x == 0);
	}
}