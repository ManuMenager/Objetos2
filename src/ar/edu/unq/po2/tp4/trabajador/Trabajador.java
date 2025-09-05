package ar.edu.unq.po2.tp4.trabajador;

import java.util.ArrayList;
import java.util.List;

public class Trabajador {
	private List<Ingreso> ingresos = new ArrayList<>();
	
	public void agregarIngreso(Ingreso ingreso) {
		ingresos.add(ingreso);
	}
	
	public double getTotalMontoPercibido() {
		return ingresos.stream()
						.mapToDouble(Ingreso::getMonto)
						.sum();
	}
	
	public double getMontoImponible() {
		return ingresos.stream()
						.mapToDouble(Ingreso::getMontoImponible)
						.sum();
				
	}
	
	public double getImpuestoAPagar() {
		return getMontoImponible()*0.02;
	}
}
