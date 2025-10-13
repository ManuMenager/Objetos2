package ar.edu.unq.po2.tp9.template.sueldosRecargados;

public class Pasante extends Empleado{
	private int horasTrabajadas;
	private int pagoPorHora;
	
	public double sueldo() {
		return horasTrabajadas * pagoPorHora - aportesYObraSocial();
	}
}
