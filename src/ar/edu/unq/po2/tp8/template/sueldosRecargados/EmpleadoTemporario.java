package ar.edu.unq.po2.tp8.template.sueldosRecargados;

public class EmpleadoTemporario extends Empleado{
	private int sueldoBasico = 1000;
	private int horasTrabajadas;
	private int pagoPorHora = 5;
	private boolean esCasado;
	private boolean tieneHijos;

	public double sueldo() {
		return pagoPorHora * horasTrabajadas + sueldoBasico + extraPorFamilia() - aportesYObraSocial();
	}
	
	public int extraPorFamilia() {
		if (esCasado || tieneHijos) {
			return 100;
		} else {
			return 0;
		}
	}

}
