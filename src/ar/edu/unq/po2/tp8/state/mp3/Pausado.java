package ar.edu.unq.po2.tp8.state.mp3;

public class Pausado extends Modo {
	
	public void pause(Song cancion, ReproductorMP3 reproductor) {
		cancion.play();
		reproductor.setModo(new Reproduciendo());
	}
}
