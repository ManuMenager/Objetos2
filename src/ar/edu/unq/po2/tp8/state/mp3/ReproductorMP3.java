package ar.edu.unq.po2.tp8.state.mp3;

public class ReproductorMP3 {
	Song cancion;
	Modo modo;
	
	public ReproductorMP3(Song cancion) {
		this.cancion = cancion;
		this.modo = new SeleccionDeCanciones();
	}

	public void play() {
		modo.play(cancion, this);
	}

	public void pause() {
		modo.pause(cancion, this);
	}

	public void stop() {
		modo.stop(cancion, this);
	}

	public void setModo(Modo modo) {
		this.modo = modo;
	}
}
