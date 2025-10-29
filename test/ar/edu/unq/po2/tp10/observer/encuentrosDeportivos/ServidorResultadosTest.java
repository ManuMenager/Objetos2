package ar.edu.unq.po2.tp10.observer.encuentrosDeportivos;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.verifyNoInteractions;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;



class ServidorResultadosTest {
	ServidorResultados server;
	Partido p1;
	Partido p2;
	Observador s1;
	Observador s2;
	Observador app;
	Criterio cDeporte;
	Criterio cDeporte2;
	Criterio cContrincante;
	
	@BeforeEach
	public void setUp() {
		server = new ServidorResultados();
		p1 = mock(Partido.class);
		p2 = mock(Partido.class);
		
		cDeporte = spy(new CriterioDeporte("Futbol"));
		cDeporte2 = spy(new CriterioDeporte("Basquet"));
		cContrincante = spy(new CriterioContrincantes(List.of("Boca", "River")));
		
		List<Criterio> criterios = new ArrayList<Criterio>();
		criterios.add(cDeporte);
		criterios.add(cContrincante);
		
		List<Criterio> criterios2 = new ArrayList<Criterio>();
		criterios2.add(cDeporte2);
		
		List<Criterio> criteriosApp = new ArrayList<Criterio>();
		criteriosApp.add(cContrincante);
		
		s1 = spy(new ServidorDeportes(criterios));
		s2 = spy(new ServidorDeportes(criterios2));
		app = spy(new AplicacionMovil(criteriosApp));
		
		server.suscribir(s1);
		server.suscribir(s2);
		server.suscribir(app);
	}
	
	@Test
	public void notificarServidoresTest() {
		when(p1.getDeporte()).thenReturn("Futbol");
		when(p1.getContrincantes()).thenReturn(List.of("Boca", "River"));

		server.ingresarPartido(p1);
		
		verify(s1).update(p1);
		verify(app).update(p1);
		verify(s2, times(0)).update(p1);
	}
}
