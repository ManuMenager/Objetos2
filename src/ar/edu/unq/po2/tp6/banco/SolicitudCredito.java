package ar.edu.unq.po2.tp6.banco;

public abstract class SolicitudCredito {
	private Cliente cliente;
	private int montoSolicitado;
	private int plazoEnMeses;
	
	protected SolicitudCredito(Cliente cliente, int montoSolicitado, int plazoEnMeses) {
		this.cliente = cliente;
		this.montoSolicitado = montoSolicitado;
		this.plazoEnMeses = plazoEnMeses;
	}
	
	public Cliente getCliente() {
		return cliente;
	}
	
	public int getMontoSolicitado() {
		return montoSolicitado;
	}
	
	public int getPlazoEnMeses() {
		return plazoEnMeses;
	}
	
	public int montoCuotaMensual() {
		return montoSolicitado / getPlazoEnMeses();
	}
	
	public abstract boolean esAceptable();
}
