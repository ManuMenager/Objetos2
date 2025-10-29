package ar.edu.unq.po2.tp10.observer.publicaciones;

import java.util.ArrayList;
import java.util.List;

public class SistemaDePublicacion {
	private List<Investigador> investigadoresSuscritos = new ArrayList<>();
	private List<Articulo> articulos = new ArrayList<>();

	public void suscribir(Investigador i) {
		investigadoresSuscritos.add(i);
	}

	public void cargarArticulo(Articulo a) {
		articulos.add(a);
		notificar(a);
	}

	private void notificar(Articulo a) {
		for (Investigador i : investigadoresSuscritos) {
			i.update(a);
	    }
	}
}
