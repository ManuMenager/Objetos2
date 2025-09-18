package ar.edu.unq.po2.tp5.wollok_a_java;

import java.time.LocalDate;
import java.time.Period;

public class Persona implements Nombrable{
	private String nombre;
	private LocalDate fechaNacimiento;
	
	public Persona(String nombre, LocalDate fechaNacimiento) {
		this.nombre = nombre;
		this.fechaNacimiento = fechaNacimiento;
	}
	
	@Override
	public String getNombre() {
		return nombre;
	}
	
	public LocalDate fechaNacimiento() {
		return fechaNacimiento;
	}
	
	public int getEdad() {
		return Period.between(fechaNacimiento, LocalDate.now()).getYears();
	}
	
	
	public boolean esMenorQue(Persona persona) {
		return this.getEdad() < persona.getEdad();
	}
}
