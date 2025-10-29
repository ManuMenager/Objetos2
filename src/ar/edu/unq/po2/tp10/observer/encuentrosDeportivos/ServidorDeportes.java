package ar.edu.unq.po2.tp10.observer.encuentrosDeportivos;

import java.util.ArrayList;
import java.util.List;

public class ServidorDeportes implements Observador {
    private List<Criterio> criterios = new ArrayList<>();

    public ServidorDeportes(List<Criterio> criterios) {
        this.criterios = criterios;
    }

    @Override
    public void update(Partido partido) {
        System.out.println("Servidor recibió: " + partido.getResultado());
    }

    @Override
    public boolean cumpleCriterio(Partido partido) {
        return criterios.stream().anyMatch(c -> c.cumple(partido));
    }
}