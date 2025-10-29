package ar.edu.unq.po2.tp10.observer.publicaciones;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class SistemaDePublicacionesTest {
	SistemaDePublicacion sis;
	Investigador i1;
	Investigador i2;
	Articulo a1;
	Articulo a2;
	CriterioTitulo cTitulo;
	CriterioTipo cTipo;
	CriterioKeyword cKeyword;
	CriterioLugar cLugar;
	
	@BeforeEach
	public void setUp() {
		sis = new SistemaDePublicacion();
		
		cTitulo = mock(CriterioTitulo.class);
		cTipo = mock(CriterioTipo.class);
		cKeyword = mock(CriterioKeyword.class);
		cLugar = mock(CriterioLugar.class);
		
		i1 = spy(new Investigador(cTitulo));
		i2 = spy(new Investigador(cLugar));
		
		a1 = mock(Articulo.class);
		a2 = mock(Articulo.class);
		
		sis.suscribir(i1);
		sis.suscribir(i2);
	}
	
	@Test
	public void notificacionI1Test() {
		when(a1.getTitulo()).thenReturn("El poder de programar con Haskell");
		when(cTitulo.getTitulo()).thenReturn("El poder de programar con Haskell");
		
		// Execute
		sis.cargarArticulo(a1);
		
		// Verify
		verify(i1).update(a1);
	}
	
	@Test
	public void notificacionI2Test() {
		when(a2.getLugar()).thenReturn("Quilmes");
		
		// Execute
		sis.cargarArticulo(a2);
		
		// Verify
		verify(i2).update(a2);
	}
}