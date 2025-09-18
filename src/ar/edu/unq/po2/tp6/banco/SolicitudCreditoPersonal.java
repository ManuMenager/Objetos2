package ar.edu.unq.po2.tp6.banco;

public class SolicitudCreditoPersonal extends SolicitudCredito {

	protected SolicitudCreditoPersonal(Cliente cliente, int montoSolicitado, int plazoEnMeses) {
		super(cliente, montoSolicitado, plazoEnMeses);
	}

	@Override
	public boolean esAceptable() {
		return verificacionIngresoAnual() && verificacionIngresoMensual();
	}
	
	private boolean verificacionIngresoAnual() {
		return getCliente().sueldoNetoAnual() >= 15000; 
	}
	
	private boolean verificacionIngresoMensual() {
		return (getCliente().getSueldoNetoMensual() * 0.7) > montoCuotaMensual();
	} 
}
