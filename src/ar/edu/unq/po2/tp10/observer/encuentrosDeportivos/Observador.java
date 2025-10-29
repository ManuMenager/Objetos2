package ar.edu.unq.po2.tp10.observer.encuentrosDeportivos;

public interface Observador {
    void update(Partido partido);
    boolean cumpleCriterio(Partido partido);
}