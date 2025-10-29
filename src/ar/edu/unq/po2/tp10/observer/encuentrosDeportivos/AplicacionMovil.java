package ar.edu.unq.po2.tp10.observer.encuentrosDeportivos;

import java.util.ArrayList;
import java.util.List;

public class AplicacionMovil implements Observador {
    private List<Criterio> criterios = new ArrayList<>();

    public AplicacionMovil(List<Criterio> criterios) {
        this.criterios = criterios;
    }

    @Override
    public void update(Partido partido) {
        System.out.println("App Móvil recibió: " + partido.getResultado());
    }

    @Override
    public boolean cumpleCriterio(Partido partido) {
        return criterios.stream().anyMatch(c -> c.cumple(partido));
    }
}