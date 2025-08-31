package tp2;

import java.time.LocalDate;

public class EmpleadoTemporario extends Empleado {
	LocalDate fechaFinDesignacion;
	int horasExtras;
	
	public EmpleadoTemporario(String nombre, String direccion, String estadoCivil, LocalDate fecNacimiento, int sueldoBasico, LocalDate fechaFinDesignacion, int horasExtras) {
		super(nombre, direccion, estadoCivil, fecNacimiento, sueldoBasico);
		this.fechaFinDesignacion = fechaFinDesignacion;
		this.horasExtras = horasExtras;
	}
	
	@Override
	public int sueldoBruto() {
		return sueldoBasico + bonoHorasExtras();
	}
	
	public int bonoHorasExtras() {
		return 40 * horasExtras;
	}
	
	@Override
	public int retenciones() {
		/* 
		 * 10% del sueldo bruto por obra social + $25 si tiene más de 50 años.
		 * 10% del sueldo bruto por jubilación + 5 por cada hora extra.
		 */
		return retencionesObraSocial() + retencionesJubilacion();
	}
		@Override
		protected int retencionesObraSocial() {
			return super.retencionesObraSocial() + retencionesEdad();
		}
		
		private int retencionesEdad() {
			return (edad() > 50) ? 25 : 0;
		}
		
		private int retencionesJubilacion() {
			return porcentajeDelSueldoBruto(10) + retencionesHorasExtras();
		}
		
		private int retencionesHorasExtras() {
			return 5 * horasExtras;
		}
	
		@Override
		public String concepto() {
			return "\n" + nombre +
					"\nSUELDO BRUTO \n"
						+ "Sueldo Básico = $" +  sueldoBasico + "\n"
						+ "Horas Extras = $" + bonoHorasExtras() + "\n \n"
					+ "RETENCIONES \n"
						+ "Obra Social = $" + retencionesObraSocial() + "\n"
						+ "Jubilación = $" + retencionesJubilacion();
		}
}