package unq;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unq.po2.tp3.Cuadrado;
import ar.edu.unq.po2.tp3.Rectangulo;
import ar.edu.unq.po2.tp3.model.Point;

public class RectanguloTest {
	private Rectangulo rectangulo;
	private Cuadrado cuadrado;
	
	@BeforeEach
	public void setUp() throws Exception {
		Point esquinaInferiorIzquierda = new Point(2,3);
		rectangulo = new Rectangulo(esquinaInferiorIzquierda,3,5);
		cuadrado = new Cuadrado(esquinaInferiorIzquierda,3,3);
	}
	
	@Test
	public void testRectangulo() {
		assertEquals(rectangulo.direccionDelRectangulo(), "Vértical");
		assertEquals(rectangulo.area(), 15);
		assertEquals(rectangulo.perimetro(), 16);
	}
	
	@Test
	public void testCuadrado() {
		assertEquals(cuadrado.area(), 9);
		assertEquals(cuadrado.perimetro(), 12);
	}
}
