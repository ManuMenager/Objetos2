package ar.edu.unq.po2.tp10.observer.preguntasYRespuestas;

import java.util.*;

public class Partida {
    private List<Pregunta> preguntas = new ArrayList<>();
    private List<Jugador> jugadores = new ArrayList<>();
    private Map<Jugador, Integer> respuestasCorrectas = new HashMap<>();

    public Partida(List<Pregunta> preguntas) {
        this.preguntas = preguntas;
    }

    public void registrarJugador(Jugador jugador) {
        jugadores.add(jugador);
        respuestasCorrectas.put(jugador, 0);
        jugador.setPreguntas(preguntas);
    }

    public boolean esUltimaPregunta(Pregunta pregunta) {
        return preguntas.indexOf(pregunta) == preguntas.size() - 1;
    }

    public void registrarRespuestaCorrecta(Jugador jugador) {
        respuestasCorrectas.put(jugador, respuestasCorrectas.get(jugador) + 1);
    }

    public void finalizar(Jugador ganador) {
        for (Jugador j : jugadores) {
            j.recibirNotificacion("El ganador es: " + ganador.getNombre());
        }
    }

    public List<Jugador> getJugadores() {
        return jugadores;
    }
}