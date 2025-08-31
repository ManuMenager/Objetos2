package ar.edu.unq.po2.tp2;

import java.time.LocalDate;

public class EmpleadoPermanente extends Empleado {
	int cantHijos;
	int antigüedad;
	
	public EmpleadoPermanente(String nombre, String direccion, String estadoCivil, LocalDate fecNacimiento, int sueldoBasico, int cantHijos, int antigüedad) {
		super(nombre, direccion, estadoCivil, fecNacimiento, sueldoBasico);
		this.cantHijos = cantHijos;
		this.antigüedad = antigüedad;
	}
	
	@Override
	public int sueldoBruto() {
		return sueldoBasico + salarioFamiliar();
	}
	
	public int salarioFamiliar() {
		return asignacionPorHijo() + asignacionPorConyuge() + bonoAntigüedad();
	}
	
		private int asignacionPorConyuge() {
			return "Casado".equals(estadoCivil) ? 100 : 0;
		}
		
		private int asignacionPorHijo() {
			return 150 * cantHijos;
		}
		
		private int bonoAntigüedad() {
			return 50 * antigüedad;
		}
	
	@Override
	public int retenciones() {
		// 10% del sueldoBruto por obra social + $20 por cada hijo + 15% del sueldoBruto por jubilación.
		return retencionesObraSocial() + retencionesJubilacion();
	}
	@Override
	protected int retencionesObraSocial() {
		return super.retencionesObraSocial() + retencionesPorHijos();
	}
	
	private int retencionesPorHijos() {
		return 20 * cantHijos;
	}
		
	private int retencionesJubilacion() {
		return porcentajeDelSueldoBruto(15);
	}
	
	@Override
	public String concepto() {
		return "\n" + nombre +
				"\nSUELDO BRUTO \n"
					+ "Sueldo Básico = $" +  sueldoBasico + "\n"
					+ "Salario Familiar = $" + salarioFamiliar() + "\n \n"
				+ "RETENCIONES \n"
					+ "Obra Social = $" + retencionesObraSocial() + "\n"
					+ "Jubilación = $" + retencionesJubilacion();
	}
		
	
}	