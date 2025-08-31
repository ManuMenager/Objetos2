package ar.edu.unq.po2.tp2;

import java.time.LocalDate;

public class ReciboDeHaberes {
	
	String nombreEmpleado;
	String direccion;
	LocalDate fechaEmision;
	int sueldoBruto;
	int sueldoNeto;
	String desgloceDeConceptos;
	
	public ReciboDeHaberes(String nombreEmpleado, String direccion, LocalDate fechaEmision, int sueldoBruto, int sueldoNeto, String desgloceDeConceptos) {
		this.nombreEmpleado = nombreEmpleado;
		this.direccion = direccion;
		this.fechaEmision = fechaEmision;
		this.sueldoBruto = sueldoBruto;
		this.sueldoNeto = sueldoNeto;
		this.desgloceDeConceptos = desgloceDeConceptos;
	}
	
}