package ar.edu.unq.po2.tp3;

import java.util.ArrayList;

public class EquipoDeTrabajo {
	
	@SuppressWarnings("unused")
	private String nombre;
	private ArrayList<Persona2> personas = new ArrayList<>();
	
	public void agregarIntegrante(Persona2 persona) {
		personas.add(persona);
	}
	
	public void promedioDeEdades() {
		System.out.println((double) sumaDeEdadesDeIntegrantes() / personas.size());
	}
	
	private int sumaDeEdadesDeIntegrantes() {
		int sumaActual = 0;
		for (Persona2 persona : personas) {
			sumaActual += persona.getEdad();
		}
		return sumaActual;
	}
}
