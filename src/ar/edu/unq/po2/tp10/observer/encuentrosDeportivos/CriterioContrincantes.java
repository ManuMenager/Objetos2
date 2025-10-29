package ar.edu.unq.po2.tp10.observer.encuentrosDeportivos;

import java.util.ArrayList;
import java.util.List;

public class CriterioContrincantes implements Criterio {
    private List<String> nombres = new ArrayList<>();

    public CriterioContrincantes(List<String> nombres) {
        this.nombres = nombres;
    }

    @Override
    public boolean cumple(Partido partido) {
        return partido.getContrincantes().containsAll(nombres);
    }
}