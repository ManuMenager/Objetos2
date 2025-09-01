package unq;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unq.po2.tp3.model.Point;

public class PointTest {

	Point punto1;
	Point punto2;
	
	@BeforeEach
	public void setUp() throws Exception {
		punto1 = new Point(3,5);
		punto2 = new Point(2,4);
	}
	
	@Test
	public void testMoverPunto() {
		punto1.moverPoint(4, 6);
		assertEquals(punto1.getX(), 4);
		assertEquals(punto1.getY(), 6);
	}
	
	@Test
	public void testSumarPuntos() {
		Point newPunto = punto1.sumarPoints(punto2);
		assertEquals(newPunto.getX(), 5);
		assertEquals(newPunto.getY(), 9);
	}
}