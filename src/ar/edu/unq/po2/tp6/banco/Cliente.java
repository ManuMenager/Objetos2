package ar.edu.unq.po2.tp6.banco;

public class Cliente {

	private String nombre;
	private String apellido;
	private String direccion;
	private int edad;
	private int sueldoNetoMensual;
	
	public Cliente(String nombre, String apellido, String direccion, int edad, int sueldoNetoMensual) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.direccion = direccion;
		this.edad = edad;
		this.sueldoNetoMensual = sueldoNetoMensual;
	}
	
	public int getEdad() {
		return edad;
	}
	
	public int getSueldoNetoMensual() {
		return sueldoNetoMensual;
	}
	
	public void agregarDinero(int cantidad) {
		// Agrega el dinero otorgado por el banco.
	}
	
	public int sueldoNetoAnual() {
		return sueldoNetoMensual * 12;
	}
	
	public void solicitarDinero(Banco banco, SolicitudCredito solicitud) {
		banco.registrarSolicitud(solicitud);
	}

}