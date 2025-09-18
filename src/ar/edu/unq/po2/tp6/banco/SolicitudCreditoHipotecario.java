package ar.edu.unq.po2.tp6.banco;

public class SolicitudCreditoHipotecario extends SolicitudCredito{

	private Propiedad propiedadGarantia;
	
	public SolicitudCreditoHipotecario(Cliente cliente, int montoSolicitado, int plazoEnMeses, Propiedad propiedadGarantia) {
		super(cliente, montoSolicitado, plazoEnMeses);
		this.propiedadGarantia = propiedadGarantia;
	}

	@Override
	public boolean esAceptable() {
		return verificacionIngresoMensual() && verificacionGarantia() && verificacionEdad();
	}
	
	private boolean verificacionIngresoMensual() {
		return (getCliente().getSueldoNetoMensual() * 0.5) > montoCuotaMensual();
	}
	
	private boolean verificacionGarantia() {
		return (propiedadGarantia.getValorFiscal() * 0.7) > getMontoSolicitado();
	}
	
	private boolean verificacionEdad() {
		return getCliente().getEdad() + (getPlazoEnMeses() / 12) <= 65;
	}
	
}
