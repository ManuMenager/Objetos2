package ar.edu.unq.po2.tp8.state;

public class DosJugadores extends EstadoMaquina {
	int fichasQueConsume = 2;
	
	@Override
	public String iniciar() {
		return ("Dos jugadores jugando");
	}

}
