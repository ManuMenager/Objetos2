package ar.edu.unq.po2.tp10.observer.publicaciones;

import java.util.List;

public class Articulo {
	private String titulo;
	private List<String> autores;
	private List<String> filiaciones;
	private String tipo;
	private String lugarDePublicacion;
	private List<String> keywords;
	
	public Articulo(String titulo, List<String> autores, List<String> filiaciones, String tipo, String lugarDePublicacion, List<String> keywords) {
		this.titulo = titulo;
		this.autores = autores;
		this.filiaciones = filiaciones;
		this.tipo = tipo;
		this.lugarDePublicacion = lugarDePublicacion;
		this.keywords = keywords;
	}
	
	public String getTitulo() {
		return this.titulo;
	}
	
	 public String getLugar() {
		 return this.lugarDePublicacion;
	 }

	 public List<String> getKeywords() {
		return this.keywords;
	 }

	 public String getTipo() {
		return this.tipo;
	 }

}
