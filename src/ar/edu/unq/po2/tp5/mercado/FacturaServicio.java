package ar.edu.unq.po2.tp5.mercado;

public class FacturaServicio extends Factura {
	int costoUnidad;
	int cantUnidades;
	
	public FacturaServicio(int costoUnidad, int cantUnidades) {
		super();
		this.costoUnidad = costoUnidad;
		this.cantUnidades = cantUnidades;
	}
	
	@Override
	public int getPrecio() {
		return costoUnidad*cantUnidades;
	}
}
