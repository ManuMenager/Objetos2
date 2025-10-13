package ar.edu.unq.po2.tp8.template.llamadasTelefonicas;


public abstract class LlamadaTelefonica {
	private int tiempo;
	private int horaDelDia;
	
	public LlamadaTelefonica(int tiempo, int horaDelDia){
		this.tiempo=tiempo;
		this.horaDelDia=horaDelDia;
	}
	
	// Operaciones Concretas.
	public int getTiempo(){
		return this.tiempo;
	}
	
	// Operaciones Concretas.
	public int getHoraDelDia(){
		return this.horaDelDia;
	}
	
	// Operación Primitiva.
	public abstract boolean esHoraPico();
	
	// Template Method.
	// Este método fija la estructura del cálculo del costo, pero delega en otros métodos (esHoraPico() y costoNeto()) el detalle concreto.
	public float costoFinal(){
		if(this.esHoraPico()) {
			return this.costoNeto()*1.2f*this.getTiempo();
		}else{
			return this.costoNeto()*this.getTiempo();
		}
	}
	
	// Hook Method
	// Tiene una implementación por defecto (getTiempo() * 1). LlamadaDescuento lo redefine para alterar el cálculo.
	public float costoNeto(){
		return this.getTiempo() * 1;
	}
}