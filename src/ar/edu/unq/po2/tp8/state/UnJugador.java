package ar.edu.unq.po2.tp8.state;

public class UnJugador extends EstadoMaquina {
	int fichasQueConsume = 1;
	
	@Override
	public String iniciar() {
		return ("Modo: Un Jugador");
	}

}
