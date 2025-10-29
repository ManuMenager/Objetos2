package ar.edu.unq.po2.tp10.observer.preguntasYRespuestas;

public class Pregunta {
    private String enunciado;
    private String respuestaCorrecta;

    public Pregunta(String enunciado, String respuestaCorrecta) {
        this.enunciado = enunciado;
        this.respuestaCorrecta = respuestaCorrecta;
    }

    public boolean esCorrecta(String respuesta) {
        return this.respuestaCorrecta.equalsIgnoreCase(respuesta);
    }

    public String getEnunciado() {
        return enunciado;
    }
}