package ar.edu.unq.po2.tp10.observer.preguntasYRespuestas;

import org.junit.jupiter.api.*;
import static org.mockito.Mockito.*;
import java.util.List;

public class ServidorTest {
    Servidor servidor;
    Jugador j1, j2, j3, j4, j5;
    Pregunta p1;

    @BeforeEach
    public void setUp() {
        servidor = new Servidor();
        p1 = new Pregunta("2+2", "4");
        j1 = spy(new Jugador("Ema", servidor));
        j2 = spy(new Jugador("Lau", servidor));
        j3 = spy(new Jugador("Nico", servidor));
        j4 = spy(new Jugador("Ana", servidor));
        j5 = spy(new Jugador("Sofi", servidor));

        j1.solicitarParticipacion();
        j2.solicitarParticipacion();
        j3.solicitarParticipacion();
        j4.solicitarParticipacion();
        j5.solicitarParticipacion();
    }

    @Test
    public void testJugadorRespondeCorrectamente() {
        j1.enviarRespuesta(p1, "4");
        verify(j1).recibirNotificacion("¡Respuesta correcta!");
    }

    @Test
    public void testJugadorRespondeIncorrectamente() {
        j1.enviarRespuesta(p1, "5");
        verify(j1).recibirNotificacion("Respuesta incorrecta.");
    }
}