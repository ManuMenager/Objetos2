package ar.edu.unq.po2.tp10.strategy;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.spy;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class EncriptadorNaiveTest {
	EncriptadorNaive encriptador;
	IEstrategia porOrdenPalabras;
	IEstrategia porVocales;
	IEstrategia porNumeros;
	
	@BeforeEach
	public void setUp() {
		encriptador = new EncriptadorNaive();
		porOrdenPalabras = spy(new EncriptacionPorOrdenPalabras());
		porVocales = spy(new EncriptacionPorVocales());
		porNumeros = spy(new EncriptacionPorNumeros());
		
	}
	
	@Test
	void encriptacionPorOrdenPalabrasTest() {
		encriptador.setEstrategia(porOrdenPalabras);
		
		String mensajeEncriptado = encriptador.encriptar("programacion con objetos");
		
		assertEquals("objetos con programacion", mensajeEncriptado);
		
		String mensajeDesencriptado = encriptador.desencriptar(mensajeEncriptado);
		
		assertEquals("programacion con objetos", mensajeDesencriptado);
	}
	
	@Test
	void encriptacionPorVocalesTest() {
		encriptador.setEstrategia(porVocales);
		
		String mensajeEncriptado = encriptador.encriptar("programacion con objetos");
		
		assertEquals("prugremecoun cun ubjitus", mensajeEncriptado);
		
		String mensajeDesencriptado = encriptador.desencriptar(mensajeEncriptado);
		
		assertEquals("programacion con objetos", mensajeDesencriptado);
	}
	
	@Test
	void encriptacionPorNumerosTest() {
		encriptador.setEstrategia(porNumeros);
		
		String mensajeEncriptado = encriptador.encriptar("programacion con objetos");
		
		assertEquals("16,18,15,7,18,1,13,1,3,9,15,14,0,3,15,14,0,15,2,10,5,20,15,19", mensajeEncriptado);
		
		String mensajeDesencriptado = encriptador.desencriptar(mensajeEncriptado);
		
		assertEquals("programacion con objetos", mensajeDesencriptado);
	}

}
