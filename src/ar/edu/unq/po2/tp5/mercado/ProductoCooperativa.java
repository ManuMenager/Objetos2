package ar.edu.unq.po2.tp5.mercado;

public class ProductoCooperativa extends Producto{
	
	public ProductoCooperativa(int precio, int stock) {
		super(precio, stock);
	}

	public int getPrecio() {
		return super.getPrecio() - ((10*precio) / 100);
	}
}
