package ar.edu.unq.po2.tp5.wollok_a_java;

public class Mascota implements Nombrable{
	public String nombre;
	public String raza;
	
	public Mascota(String nombre, String raza) {
		this.nombre = nombre;
		this.raza = raza;
	}
	
	@Override
	public String getNombre() {
		return nombre;
	}
	
	public String getRaza() {
		return raza;
	}
}
