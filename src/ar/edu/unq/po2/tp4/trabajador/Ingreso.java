package ar.edu.unq.po2.tp4.trabajador;

public class Ingreso {
	protected String mesDePercepcion;
	protected String concepto;
	protected double monto;
	
	public Ingreso(String mesDePercepcion, String concepto, double monto) {
		this.mesDePercepcion = mesDePercepcion;
		this.concepto = concepto;
		this.monto = monto;
	}
	
	public double getMonto() {
		return monto;
	}
	
	public double getMontoImponible() {
		return monto;
	}
}
