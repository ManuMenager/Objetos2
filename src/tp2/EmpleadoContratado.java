package tp2;

import java.time.LocalDate;

public class EmpleadoContratado extends Empleado {
	
	@SuppressWarnings("unused")
	private int numeroContrato;
	@SuppressWarnings("unused")
	private String medioDePago;

	public EmpleadoContratado(String nombre, String direccion, String estadoCivil, LocalDate fecNacimiento,
		int sueldoBasico, int numeroContrato, String medioDePago) {
		super(nombre, direccion, estadoCivil, fecNacimiento, sueldoBasico);
		this.numeroContrato = numeroContrato;
		this.medioDePago = medioDePago;
	}

	@Override
	public int sueldoBruto() {
		return sueldoBasico;
	}

	@Override
	public int retenciones() {
		return 50;
	}

	@Override
	public String concepto() {
		return "\n" + nombre +
				"\n RETENCIONES \n Gastos Administrativos Contractuales = $50";
	}

}
