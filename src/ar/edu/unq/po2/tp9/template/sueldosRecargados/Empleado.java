package ar.edu.unq.po2.tp9.template.sueldosRecargados;

public abstract class Empleado {
	public abstract double sueldo();
	public double aportesYObraSocial() {
		return sueldo() * 0.13;
	}
}
