package ar.edu.unq.po2.tp5.mercado;

import java.util.ArrayList;
import java.util.List;

public class Caja {
	List<Producto> productos = new ArrayList<Producto>();
	
	public void registrarProducto(Producto producto) {
		producto.decrementarStock();
		productos.add(producto);
	}
	
	public int montoTotal() {
		return productos.stream()
				.mapToInt(Producto::getPrecio)
				.sum();
	}
}
