package ar.edu.unq.po2.tp3;

import java.time.LocalDate;
import java.time.Period;

public class Persona {

	private String nombre;
	private LocalDate fechaNacimiento;
	
	public Persona(String nombre, LocalDate fechaNacimiento) {
		this.nombre = nombre;
		this.fechaNacimiento = fechaNacimiento;
	}
	
	public String getNombre() {
		return nombre;
	}

	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}

	public int edad() {
		LocalDate fecActual = LocalDate.now();
		return Period.between(fechaNacimiento, fecActual).getYears();
	}

	//1. Solo conoce el valor de la edad, no tiene información sobre como se calcula. El mecanismo se llama encapsulamiento.

	public boolean menorQue(Persona persona) {
		return edad() < persona.edad();
	}
	
	
	
	
}
