package ar.edu.unq.po2.tp8.composite.cultivos;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CultivosTest {
	PorcionTierra tierra;
	List<PorcionTierra> cultivosTierra;
	List<PorcionTierra> cultivosParcelaMixta;
	
	@BeforeEach
	public void setUp() {
		cultivosParcelaMixta = Arrays.asList(new CultivoSoja(), new CultivoTrigo(), new CultivoSoja(), new CultivoTrigo());
		cultivosTierra = Arrays.asList(new CultivoSoja(), new CultivoTrigo(), new CultivoSoja(), new ParcelaMixta(cultivosParcelaMixta));
		tierra = new ParcelaMixta(cultivosTierra);
	}
	
	@Test
	public void cultivosTest() {
		// Exercise
		int gananciaAnualTrigo = tierra.gananciaAnualTrigo();
		int gananciaAnualSoja = tierra.gananciaAnualSoja();
		
		// Verify
		assertEquals(1250, gananciaAnualSoja);
		assertEquals(450, gananciaAnualTrigo);
	}

}
