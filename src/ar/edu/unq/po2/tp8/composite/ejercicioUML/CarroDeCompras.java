package ar.edu.unq.po2.tp8.composite.ejercicioUML;

import java.util.ArrayList;
import java.util.List;

public abstract class CarroDeCompras {
	List<Product> productos = new ArrayList<Product>();
	
	protected void setElements(List<Product> products) {
		for (Product p : products) {
			productos.add(p);
		}
	}
	public List<Product> getElements(){
		return productos;
	}
	
	public int totalRounded() {
		return (int) productos.stream().mapToDouble(p -> p.getPrice()).sum();
	}
	
	public float total() {
		return (float) productos.stream().mapToDouble(p -> p.getPrice()).sum();
	}
}
