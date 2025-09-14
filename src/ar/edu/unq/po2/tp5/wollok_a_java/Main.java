package ar.edu.unq.po2.tp5.wollok_a_java;
import java.time.LocalDate;
import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		Persona p1 = new Persona("Juan", LocalDate.of(1990, 5, 15));
		Persona p2 = new Persona("Ana", LocalDate.of(2000, 10, 3));
		Mascota m1 = new Mascota("Firulais", "Labrador");
		Mascota m2 = new Mascota("Mishi", "Siames");

		List<Nombrable> lista = Arrays.asList(p1, p2, m1, m2);

		for (Nombrable n : lista) {
			System.out.println(n.getNombre());
		}

		// Ejemplo de comparación de edad
		System.out.println(p1.getNombre() + " es menor que " + p2.getNombre() + "? " + p1.esMenorQue(p2));
		System.out.println(p2.getNombre() + " es menor que " + p1.getNombre() + "? " + p2.esMenorQue(p1));
	}
}