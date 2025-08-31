package tp2;

import java.time.LocalDate;
import java.util.ArrayList;

public class Empresa {
	
	String nombre;
	int cuit;
	ArrayList<Empleado> empleados;
	ArrayList<ReciboDeHaberes> haberes;
	
	public Empresa(String nombre, int cuit, ArrayList<Empleado> empleados, ArrayList<ReciboDeHaberes> haberes) {
		this.nombre = nombre;
		this.cuit = cuit;
		this.empleados = empleados;
		this.haberes = haberes;
	}
	
	public int montoTotalSueldosNeto() {
		int total = 0;
		for (Empleado empleado: empleados) {
			total += empleado.sueldoNeto();
		}
		return total;
	}
	
	public int montoTotalSueldosBruto() {
		int total = 0;
		for (Empleado empleado: empleados) {
			total += empleado.sueldoBruto();
		}
		return total;
	}
	
	public void liquidacionDeSueldos() {
		for (Empleado empleado: empleados) {
			ReciboDeHaberes reciboHaberes = new ReciboDeHaberes(empleado.nombre(), empleado.direccion(),  LocalDate.now(), empleado.sueldoBruto(), empleado.sueldoNeto(), empleado.concepto());
			haberes.addFirst(reciboHaberes);
		}
	}
	
	public int montoTotalRetenciones() {
		int total = 0;
		for (Empleado empleado: empleados) {
			total += empleado.retenciones();
		}
		return total;
	}
	
	
}