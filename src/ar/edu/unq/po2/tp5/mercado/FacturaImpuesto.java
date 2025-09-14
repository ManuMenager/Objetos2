package ar.edu.unq.po2.tp5.mercado;

public class FacturaImpuesto extends Factura {
	int tasaServicio;
	
	public FacturaImpuesto(int tasaServicio) {
		super();
		this.tasaServicio = tasaServicio;
	}
	
	public int getPrecio() {
		return tasaServicio;
	}
}
