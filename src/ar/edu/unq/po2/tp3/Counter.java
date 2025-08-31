package ar.edu.unq.po2.tp3;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.function.Predicate;
import java.util.stream.IntStream;

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
	

	
	//Ejercicio 2
	
	public int numeroConMasPares(ArrayList<Integer> numbers) {
		if (numbers.isEmpty()) return -1;
		
		int maxIndex = 0;
	    int maxDigitosPares = contarDigitosPares(numbers.get(0));
		
	    for (int i = 1; i < numbers.size(); i++) {
	        int digitosParesActual = contarDigitosPares(numbers.get(i));
	        if (digitosParesActual > maxDigitosPares) {
	            maxDigitosPares = digitosParesActual;
	            maxIndex = i;
	        }
	    }
	    
	    return numbers.get(maxIndex);
	}
	
	public int contarDigitosPares(int number) {
		number = Math.abs(number); //Para que sirva con números negativos.
		
		if (number == 0) return 1;
	
		int contador = 0;
		while (number > 0) {
			int digito = number % 10;
			if (digito % 2 == 0) {
				contador++;
			}
			number /= 10;
		}
		return contador;
	}
	
	// Versión con Stream
	public int numeroConMasParesStream(ArrayList<Integer> numbers) {
	    return IntStream.range(0, numbers.size())
	            .boxed()
	            .max(Comparator.comparingInt(i -> contarDigitosPares(numbers.get(i))))
	            .map(numbers::get)  // Convierte el índice al valor
	            .orElse(-1); // Devuelve -1 si es vacía.
	} 
	
	
	
	//Ejercicio 3
	
	public int elNumeroMultiploMasGrande(int x, int y) {
		int multiploMasGrandeActual = -1;
		
		for (int i=1; i <= 1000; i++) {
			if (i % x == 0 && i % y == 0) {
				multiploMasGrandeActual = i;
			}
		}
		return multiploMasGrandeActual;
	}
	
}