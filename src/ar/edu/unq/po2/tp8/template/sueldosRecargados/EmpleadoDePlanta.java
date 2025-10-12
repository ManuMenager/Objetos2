package ar.edu.unq.po2.tp8.template.sueldosRecargados;

public class EmpleadoDePlanta extends Empleado{
	private int sueldoBasico = 3000;
	private int cantDeHijos;
	
	@Override
	public double sueldo() {
		return sueldoBasico + extraPorHijos();
	}
	
	private int extraPorHijos() {
		return 300 * cantDeHijos;
	}
}