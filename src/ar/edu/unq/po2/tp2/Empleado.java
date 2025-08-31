package ar.edu.unq.po2.tp2;

import java.time.LocalDate;
import java.time.Period;

public abstract class Empleado {

	protected String nombre;
	protected String direccion;
	protected String estadoCivil;
	LocalDate fecNacimiento;
	protected int sueldoBasico;
	
	protected Empleado(String nombre, String direccion, String estadoCivil, LocalDate fecNacimiento, int sueldoBasico) {
		this.nombre = nombre;
		this.direccion = direccion;
		this.estadoCivil = estadoCivil;
		this.fecNacimiento = fecNacimiento;
		this.sueldoBasico = sueldoBasico;
	}
	
	public String nombre() {
		return nombre;
	}
	
	public String direccion() {
		return direccion;
	}
	
	
	public int edad() {
		LocalDate fecActual = LocalDate.now();
		return Period.between(fecNacimiento, fecActual).getYears();
	}
	
	public int sueldoNeto() {
		return sueldoBruto() - retenciones();
	}
	
	public abstract int sueldoBruto();
	
	public abstract int retenciones();
	
	protected int retencionesObraSocial() {
		return porcentajeDelSueldoBruto(10);
	}
	
	protected int porcentajeDelSueldoBruto(int porcentaje) {
		return (sueldoBruto() * porcentaje) / 100;
	}
	
	public abstract String concepto();
}