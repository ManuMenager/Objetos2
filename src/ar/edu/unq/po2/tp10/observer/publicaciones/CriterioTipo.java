package ar.edu.unq.po2.tp10.observer.publicaciones;

public class CriterioTipo implements Criterio {
	private String tipo;

	public CriterioTipo(String tipo) {
		this.tipo = tipo;
	}

	@Override
	public boolean cumple(Articulo a) {
		return a.getTipo().equals(tipo);
	}

}
