package ar.edu.unq.po2.tp6.banco;

import java.util.ArrayList;

public class Banco {
	private ArrayList<Cliente> clientes;
	private ArrayList<SolicitudCredito> solicitudes;
	
	public void agregarCliente(Cliente cliente) {
		clientes.add(cliente);
	}
	
	public void registrarSolicitud(SolicitudCredito solicitud) {
		solicitudes.add(solicitud);
	}
	
	public void aceptarSolicitud(SolicitudCredito solicitud) {
		solicitud.getCliente().agregarDinero(solicitud.getMontoSolicitado());
	}
	
	public void rechazarSolicitud(SolicitudCredito solicitud) {
		// Rechaza la solicitud.
	}
	
	public int montoTotalAPagar() {
		return solicitudes.stream().filter(SolicitudCredito::esAceptable).mapToInt(SolicitudCredito::getMontoSolicitado).sum();
	}
}
