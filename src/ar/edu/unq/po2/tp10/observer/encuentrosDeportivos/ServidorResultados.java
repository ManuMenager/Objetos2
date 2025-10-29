package ar.edu.unq.po2.tp10.observer.encuentrosDeportivos;

import java.util.ArrayList;
import java.util.List;

public class ServidorResultados {
	private List<Partido> partidos = new ArrayList<>();
	private List<Observador> observers = new ArrayList<>(); 
	
	public void ingresarPartido(Partido p) {
		partidos.add(p);
		notificar(p);
	}
	
	public void suscribir(Observador o) {
		observers.add(o);
	}
	
	public void notificar(Partido p) {
		for (Observador o : observers) {
			if(o.cumpleCriterio(p)) {
				o.update(p);
			}	
		}
	}

}
