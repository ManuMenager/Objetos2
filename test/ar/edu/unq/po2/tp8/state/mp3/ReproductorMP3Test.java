package ar.edu.unq.po2.tp8.state.mp3;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.inOrder;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.verifyNoMoreInteractions;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InOrder;

class ReproductorMP3Test {
	ReproductorMP3 reproductor;
	Song spyCancion;
	
	@BeforeEach
	public void setUp() {
		spyCancion = spy(Song.class);
		reproductor = new ReproductorMP3(spyCancion);
	}
	
	@Test
	public void playMP3Test() {
		// Exercise
		reproductor.play();
		
		// Verify
		verify(spyCancion).play();
		assertThrows(IllegalStateException.class, () -> reproductor.play());
	}
	
	@Test
	public void pauseMP3Test() {
		// Exercise
		reproductor.play();
		reproductor.pause();
		reproductor.pause();
		reproductor.stop();
		
		// Verify
		InOrder orden = inOrder(spyCancion);
		orden.verify(spyCancion).play();
		orden.verify(spyCancion).pause();
		orden.verify(spyCancion).play();
		
		assertThrows(IllegalStateException.class, () -> reproductor.pause());
	}
	
	@Test
	public void stopMP3Test() {
		// Exercise
		reproductor.play();
		reproductor.stop();
		reproductor.stop();
		
		
		// Verify
		InOrder orden = inOrder(spyCancion);
		orden.verify(spyCancion).play();
		orden.verify(spyCancion).stop();
		
		verifyNoMoreInteractions(spyCancion);		
	}
}
