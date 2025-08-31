package ar.edu.unq.po2.tp2;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
	
	public static void main(String[] args) {
		EmpleadoPermanente empleado1 = new EmpleadoPermanente("David", "Calle 456", "Casado", LocalDate.of(2004, 12, 5), 652000, 2, 15);
		EmpleadoTemporario empleado2 = new EmpleadoTemporario("Javier", "Calle 123", "Soltero", LocalDate.of(1995, 8, 21), 578000, LocalDate.of(2025, 12, 21), 20);
		EmpleadoContratado empleado3 = new EmpleadoContratado("Lorenzo", "Calle 846", "Casado",  LocalDate.of(1965, 8, 21), 940560, 506, "Transferencia Bancaria");
		ArrayList<Empleado> empleados = new ArrayList<>(Arrays.asList(empleado1, empleado2, empleado3));
		ArrayList<ReciboDeHaberes> haberes = new ArrayList<ReciboDeHaberes>();
		Empresa asus = new Empresa("Asus", 8293202, empleados, haberes);
		
		System.out.println("El sueldo neto total de la empresa es: " + asus.montoTotalSueldosNeto());
		asus.liquidacionDeSueldos();
		System.out.println("Cantidad de recibos de haberes realizados: " + asus.haberes.size());

		System.out.println(empleado1.concepto());
		System.out.println(empleado2.concepto());
		System.out.println(empleado3.concepto());
	}
	
}