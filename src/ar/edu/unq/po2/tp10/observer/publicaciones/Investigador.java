package ar.edu.unq.po2.tp10.observer.publicaciones;

public class Investigador {
    private Criterio criterio;

    public Investigador(Criterio criterio) {
        this.criterio = criterio;
    }

    public void update(Articulo articulo) {
        if (criterio.cumple(articulo)) {
        	System.out.println("🔔 recibió notificación del artículo: " + articulo.getTitulo());
        }
    }
}
