package ar.edu.unq.po2.tp5.mercado;

import java.util.List;

public class Caja {
	private List<Cobrable> cobrables;
	private Agencia agencia;
	
	public Caja(List<Cobrable> cobrables, Agencia agencia) {
		this.cobrables = cobrables;
		this.agencia = agencia;
	}
	
	public void registrarProducto(Producto producto) {
		producto.decrementarStock();
		cobrables.add(producto);
	}
	
	public void registrarPago(Factura factura) {
		cobrables.add(factura);
		agencia.registrarPago(factura);
	}
	
	public int montoTotal() {
		return cobrables.stream()
				.mapToInt(Cobrable::getPrecio)
				.sum();
	}
}
