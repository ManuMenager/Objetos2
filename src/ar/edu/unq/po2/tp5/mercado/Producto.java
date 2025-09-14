package ar.edu.unq.po2.tp5.mercado;

public class Producto {
	int precio;
	int stock;
	
	public Producto(int precio, int stock) {
		this.precio = precio;
		this.stock = stock;
	}
	
	public int getPrecio() {
		return precio;
	}
	
	public int getStock() {
		return stock;
	}
	
	public void decrementarStock() {
		stock--;
	}
}
