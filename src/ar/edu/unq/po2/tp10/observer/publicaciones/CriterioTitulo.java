package ar.edu.unq.po2.tp10.observer.publicaciones;

public class CriterioTitulo implements Criterio {
	private String titulo;

	public CriterioTitulo(String titulo) {
		this.titulo = titulo;
	}

	@Override
	public boolean cumple(Articulo a) {
		return a.getTitulo().equals(this.getTitulo());
	}
	
	public String getTitulo() {
		return this.titulo;
	}

}
