package ar.edu.unq.po2.tp10.observer.preguntasYRespuestas;

import java.util.ArrayList;
import java.util.List;

public class Jugador {
    private String nombre;
    private Servidor servidor;
    private List<Pregunta> preguntas = new ArrayList<>();

    public Jugador(String nombre, Servidor servidor) {
        this.nombre = nombre;
        this.servidor = servidor;
    }

    public String getNombre() {
        return nombre;
    }

    public void solicitarParticipacion() {
        servidor.solicitarParticipacion(this);
    }

    public void recibirNotificacion(String mensaje) {
        System.out.println(nombre + " recibe notificación: " + mensaje);
    }

    public void setPreguntas(List<Pregunta> preguntas) {
        this.preguntas = preguntas;
    }

    public void enviarRespuesta(Pregunta pregunta, String respuesta) {
        servidor.recibirRespuesta(this, pregunta, respuesta);
    }
}