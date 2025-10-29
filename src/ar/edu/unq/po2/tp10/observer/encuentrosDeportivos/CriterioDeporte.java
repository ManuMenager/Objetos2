package ar.edu.unq.po2.tp10.observer.encuentrosDeportivos;

public class CriterioDeporte implements Criterio {
    private String deporte;

    public CriterioDeporte(String deporte) {
        this.deporte = deporte;
    }

    @Override
    public boolean cumple(Partido partido) {
        return partido.getDeporte().equalsIgnoreCase(deporte);
    }
}