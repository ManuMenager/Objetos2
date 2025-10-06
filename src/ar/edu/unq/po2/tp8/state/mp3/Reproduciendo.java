package ar.edu.unq.po2.tp8.state.mp3;

public class Reproduciendo extends Modo {
	
	public void pause(Song cancion, ReproductorMP3 reproductor) {
		cancion.pause();
		reproductor.setModo(new Pausado());
	}
	
	public void stop(Song cancion, ReproductorMP3 reproductor) {
		cancion.stop();
		reproductor.setModo(new SeleccionDeCanciones());
	}
}
