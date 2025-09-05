package ar.edu.unq.po2.tp4.supermercado;

public class ProductoPrimeraNecesidad extends Producto {

	private int descuento;
	
	public ProductoPrimeraNecesidad(String nombre, double precio, boolean precioCuidado, int descuento) {
		super(nombre, precio, precioCuidado);
		this.descuento = descuento;
	}
	
	@Override
	public double getPrecio() {
		return super.getPrecio() - ((super.getPrecio()*descuento) / 100);
	}
}
