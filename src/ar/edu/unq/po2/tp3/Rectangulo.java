package ar.edu.unq.po2.tp3;

import ar.edu.unq.po2.tp3.model.Point;

public class Rectangulo {
	
	protected Point esquinaInferiorIzquierda;
	protected int ancho;
	protected int alto;
	
	public Rectangulo(Point esquina, int ancho, int alto) {
		this.esquinaInferiorIzquierda = esquina;
		this.ancho = ancho;
		this.alto = alto;
	}
	
	public int perimetro() {
		return 2 * (ancho + alto);
	}
	
	public int area() {
		return ancho * alto;
	}
	
	public String direccionDelRectangulo() {
		if (ancho > alto) {
			return "Horizontal";
		} else {
			return "Vértical";
		}
	}
}