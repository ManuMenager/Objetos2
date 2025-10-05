package ar.edu.unq.po2.tp8.state;

public class JuegoArcade {
	Maquina maquina;
	
	public JuegoArcade(Maquina maquina) {
		this.maquina = maquina;
	}
	
	public void jugar() {
		maquina.iniciar();
	}
}
