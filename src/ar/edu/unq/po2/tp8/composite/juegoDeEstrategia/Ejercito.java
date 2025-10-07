package ar.edu.unq.po2.tp8.composite.juegoDeEstrategia;

import java.util.ArrayList;
import java.util.List;

public class Ejercito extends Personaje {
	private List<Personaje> personajes = new ArrayList<Personaje>();
	
	public void caminar(Tupla<Integer, Integer> inicio, Tupla<Integer, Integer> fin) {
		personajes.forEach(p -> p.caminar(inicio, fin));
	}
	
	@Override
	public void agregar(Personaje p) {
		personajes.add(p);
	}
	
	@Override
	public void eliminar(Personaje p) {
		personajes.remove(p);
	}
}
