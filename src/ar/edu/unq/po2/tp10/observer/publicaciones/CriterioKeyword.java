package ar.edu.unq.po2.tp10.observer.publicaciones;

public class CriterioKeyword implements Criterio {
	private String keyword;
	
	public CriterioKeyword(String keyword) {
		this.keyword = keyword;
	}

	@Override
	public boolean cumple(Articulo a) {
		return a.getKeywords().stream().anyMatch(k -> k.equals(keyword));
		
	}

}
