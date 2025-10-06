package ar.edu.unq.po2.tp8.state.videoJuego;

public abstract class EstadoMaquina {
	int fichasQueConsume;
	
	public abstract String iniciar();
	
	public int getFichasQueConsume() {
		return fichasQueConsume;
	}
}
