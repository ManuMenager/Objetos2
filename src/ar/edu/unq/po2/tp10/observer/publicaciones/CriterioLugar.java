package ar.edu.unq.po2.tp10.observer.publicaciones;

public class CriterioLugar implements Criterio {
	 private String lugar;

	 public CriterioLugar(String lugar) {
		 this.lugar = lugar;
	 }

	 public boolean cumple(Articulo a) {
		 return a.getLugar().equalsIgnoreCase(lugar);
	 }
}
