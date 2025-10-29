package ar.edu.unq.po2.tp10.observer.preguntasYRespuestas;

import java.util.*;

public class Servidor {
    private List<Jugador> jugadoresPendientes = new ArrayList<>();
    private Partida partidaActual;

    public void solicitarParticipacion(Jugador jugador) {
        jugadoresPendientes.add(jugador);
        jugador.recibirNotificacion("Solicitud recibida. Esperando más jugadores...");

        if (jugadoresPendientes.size() == 5) {
            iniciarPartida();
        }
    }

    private void iniciarPartida() {
        List<Pregunta> preguntas = List.of(
                new Pregunta("Capital de Francia", "Paris"),
                new Pregunta("2 + 2", "4")
        );
        partidaActual = new Partida(preguntas);
        for (Jugador j : jugadoresPendientes) {
            partidaActual.registrarJugador(j);
            j.recibirNotificacion("Partida iniciada. ¡Buena suerte!");
        }
        jugadoresPendientes.clear();
    }

    public void recibirRespuesta(Jugador jugador, Pregunta pregunta, String respuesta) {
        if (pregunta.esCorrecta(respuesta)) {
            partidaActual.registrarRespuestaCorrecta(jugador);
            jugador.recibirNotificacion("¡Respuesta correcta!");
            for (Jugador j : partidaActual.getJugadores()) {
                if (j != jugador) {
                    j.recibirNotificacion(jugador.getNombre() + " respondió correctamente la pregunta: " + pregunta.getEnunciado());
                }
            }

            if (partidaActual.esUltimaPregunta(pregunta)) {
                partidaActual.finalizar(jugador);
            }
        } else {
            jugador.recibirNotificacion("Respuesta incorrecta.");
        }
    }
}