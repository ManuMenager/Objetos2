package ar.edu.unq.po2.tp4.trabajador;

public class IngresoPorHorasExtras extends Ingreso{
	private double cantidadDeHorasExtras;
	
	public IngresoPorHorasExtras(String mesDePercepcion, String concepto, double monto, double cantidadDeHorasExtras) {
		super(mesDePercepcion, concepto, monto);
		this.cantidadDeHorasExtras = cantidadDeHorasExtras;
	}
	
	@Override
	public double getMontoImponible() {
		return 0;
	}
}
