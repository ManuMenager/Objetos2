package ar.edu.unq.po2.tp3;

public class Main {
	
	public static void main(String[] args) {
		EquipoDeTrabajo empresa = new EquipoDeTrabajo();
		Persona2 julio = new Persona2("Julio", "Fernandez", 23);
	    Persona2 ana = new Persona2("Ana", "Martinez", 28);
	    Persona2 carlos = new Persona2("Carlos", "Rodriguez", 35);
	    Persona2 lucia = new Persona2("Lucia", "Gonzalez", 19);
	    Persona2 pedro = new Persona2("Pedro", "Lopez", 42);
	    
	    empresa.agregarIntegrante(julio);
	    empresa.agregarIntegrante(ana);
	    empresa.agregarIntegrante(carlos);
	    empresa.agregarIntegrante(lucia);
	    empresa.agregarIntegrante(pedro);
	    
	    empresa.promedioDeEdades();
	}
}