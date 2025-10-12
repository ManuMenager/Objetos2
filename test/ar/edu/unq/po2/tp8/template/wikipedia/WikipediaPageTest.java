package ar.edu.unq.po2.tp8.template.wikipedia;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class WikipediaPageTest {
	WikipediaPage buenosAires;
	WikipediaPage bernal;
	WikipediaPage quilmes;
	WikipediaPage solano;
	WikipediaPage ezpeleta;
	FiltroWikipedia mismaLetraInicial;
	FiltroWikipedia linkEnComun;
	FiltroWikipedia propiedadEnComun;
	
	@BeforeEach
	public void setUp() {
		buenosAires = mock(WikipediaPage.class);
		bernal = mock(WikipediaPage.class);
		quilmes = mock(WikipediaPage.class);
		solano = mock(WikipediaPage.class);
		ezpeleta = mock(WikipediaPage.class);
		mismaLetraInicial = new MismaLetraInicial();
		linkEnComun = new LinkEnComun();
		propiedadEnComun = new PropiedadEnComun();
		
		when(bernal.getTitle()).thenReturn("Bernal");
		when(buenosAires.getTitle()).thenReturn("Buenos Aires");
		when(quilmes.getTitle()).thenReturn("Quilmes");
		when(solano.getTitle()).thenReturn("Solano");
		when(ezpeleta.getTitle()).thenReturn("Ezpeleta");
	}
	
	@Test
	void mismaLetraInicialTest() {
		List<WikipediaPage> lista = new ArrayList<>(Arrays.asList(quilmes, buenosAires));
		List<WikipediaPage> r = MismaLetraInicial.getSimilarPages(bernal, lista);
		assertTrue(r.contains(buenosAires));
		assertFalse(r.contains(quilmes));
	}
	
	@Test
	void linkEnComunTest() {
		when(bernal.getLinks()).thenReturn(new ArrayList<>());
		when(buenosAires.getLinks()).thenReturn(new ArrayList<>(Arrays.asList(bernal, quilmes)));
		when(quilmes.getLinks()).thenReturn(new ArrayList<>(Arrays.asList(bernal, solano, ezpeleta)));
		
		List<WikipediaPage> lista = new ArrayList<>(Arrays.asList(bernal, buenosAires));
		List<WikipediaPage> r = LinkEnComun.getSimilarPages(quilmes, lista);
		assertTrue(r.contains(buenosAires));
		assertFalse(r.contains(bernal));
	}
	
	@Test
	void propiedadEnComunTest() {
		when(bernal.getInfobox()).thenReturn();
		when(buenosAires.getInfobox()).thenReturn();
		when(quilmes.getInfobox()).thenReturn();
		when(solano.getInfobox()).thenReturn();
		when(ezpeleta.getInfobox()).thenReturn();
		
		List<WikipediaPage> lista = new ArrayList<>(Arrays.asList(bernal, buenosAires, solano, quilmes));
		List<WikipediaPage> r = PropiedadEnComun.getSimilarPages(ezpeleta, lista);
		assertTrue(r.containsAll(solano, quilmes));
		assertFalse(r.containsAll(bernal, buenosAires));
	}

}
