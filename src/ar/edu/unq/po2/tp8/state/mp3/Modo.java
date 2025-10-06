package ar.edu.unq.po2.tp8.state.mp3;

public class Modo {

	public void play(Song cancion, ReproductorMP3 reproductor) {
		throw new IllegalStateException("No se puede hacer play en este estado");
	}

	public void pause(Song cancion, ReproductorMP3 reproductor) {
		throw new IllegalStateException("No se puede hacer pause en este estado");
	}

	public void stop(Song cancion, ReproductorMP3 reproductor) {
		return;
	}
}
