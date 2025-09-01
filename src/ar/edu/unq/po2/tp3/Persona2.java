package ar.edu.unq.po2.tp3;

public class Persona2 {
	@SuppressWarnings("unused")
	private String nombre;
	@SuppressWarnings("unused")
	private String apellido;
	private int edad;
	
	public Persona2(String nombre, String apellido, int edad) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
	}
	
	public int getEdad() {
		return edad;
	}
}
