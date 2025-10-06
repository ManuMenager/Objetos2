package ar.edu.unq.po2.tp8.state.videoJuego;

public class SinFicha extends EstadoMaquina {
	int fichasQueConsume = 0;
	
	@Override
	public String iniciar() {
		return ("Ingrese al menos una ficha");
	}

}
