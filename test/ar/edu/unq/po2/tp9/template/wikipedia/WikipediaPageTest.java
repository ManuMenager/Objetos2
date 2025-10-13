package ar.edu.unq.po2.tp9.template.wikipedia;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unq.po2.tp9.template.wikipedia.FiltroWikipedia;
import ar.edu.unq.po2.tp9.template.wikipedia.LinkEnComun;
import ar.edu.unq.po2.tp9.template.wikipedia.MismaLetraInicial;
import ar.edu.unq.po2.tp9.template.wikipedia.PropiedadEnComun;
import ar.edu.unq.po2.tp9.template.wikipedia.WikipediaPage;

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
		List<WikipediaPage> r = mismaLetraInicial.getSimilarPages(bernal, lista);
		assertTrue(r.contains(buenosAires));
		assertFalse(r.contains(quilmes));
	}
	
	@Test
	void linkEnComunTest() {
		when(bernal.getLinks()).thenReturn(new ArrayList<>());
		when(buenosAires.getLinks()).thenReturn(new ArrayList<>(Arrays.asList(bernal, quilmes)));
		when(quilmes.getLinks()).thenReturn(new ArrayList<>(Arrays.asList(bernal, solano, ezpeleta)));
		
		List<WikipediaPage> lista = new ArrayList<>(Arrays.asList(bernal, buenosAires));
		List<WikipediaPage> r = linkEnComun.getSimilarPages(quilmes, lista);
		assertTrue(r.contains(buenosAires));
		assertFalse(r.contains(bernal));
	}
	
	@Test
	void propiedadEnComunTest() {
		when(bernal.getInfobox()).thenReturn(new HashMap<>());
	    when(buenosAires.getInfobox()).thenReturn(new HashMap<>());
		
		when(quilmes.getInfobox()).thenReturn(Map.of("birth_place", bernal));
	    when(solano.getInfobox()).thenReturn(Map.of("birth_place", buenosAires));
	    when(ezpeleta.getInfobox()).thenReturn(Map.of("birth_place", quilmes));
		
		List<WikipediaPage> lista = new ArrayList<>(Arrays.asList(bernal, buenosAires, solano, quilmes));
		List<WikipediaPage> r = propiedadEnComun.getSimilarPages(ezpeleta, lista);
		assertTrue(r.containsAll(Arrays.asList(solano, quilmes)));
		assertFalse(r.containsAll(Arrays.asList(bernal, buenosAires)));
	}

}
