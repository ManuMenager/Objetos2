package ar.edu.unq.po2.tp6.banco;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class BancoTest {
	private Banco miBanco;
	private Cliente cliente;
	private SolicitudCredito creditoHipotecario;
	private SolicitudCredito creditoPersonal;
	private Propiedad vivienda;
	
	@BeforeEach
	public void setUp() {
		miBanco = new Banco(new ArrayList<Cliente>(), new ArrayList<SolicitudCredito>());
		cliente = new Cliente("Pepito", "Fernandez", "Calle 123", 30, 13500);
		vivienda = new Propiedad("Una planta, 3 ambientes...", "Calle 123", 100000);
		creditoHipotecario = new SolicitudCreditoHipotecario(cliente, 10000, 6, vivienda);
		creditoPersonal = new SolicitudCreditoPersonal(cliente, 5000, 3);
	}
	
	@Test
	public void bancoClienteTest() {
		// Agregar nuevos clientes.
		miBanco.agregarCliente(cliente);
		assertEquals(1, miBanco.getClientes());
	}
	
	@Test
	public void bancoSolicitudesTest() {
		// Agregar nuevas solicitudes de credito.
		miBanco.registrarSolicitud(creditoHipotecario);
		assertEquals(10000, miBanco.montoTotalAPagar());
		
		// Calcular el monto total de las solicitudes aceptables.
		assertEquals(10000, miBanco.montoTotalAPagar());
		miBanco.registrarSolicitud(creditoPersonal);
		assertEquals(15000, miBanco.montoTotalAPagar());
	}
}