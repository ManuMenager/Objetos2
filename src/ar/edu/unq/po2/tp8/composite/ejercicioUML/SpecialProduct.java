package ar.edu.unq.po2.tp8.composite.ejercicioUML;

public class SpecialProduct extends Product {
	@Override
	public  float getPrice() {
		return super.getPrice() - 100;
	}
}
