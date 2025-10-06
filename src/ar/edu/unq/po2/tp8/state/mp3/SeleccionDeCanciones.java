package ar.edu.unq.po2.tp8.state.mp3;

public class SeleccionDeCanciones extends Modo {
	@Override
	public void play(Song cancion, ReproductorMP3 reproductor) {
		cancion.play();
		reproductor.setModo(new Reproduciendo());
	}
}
