package ar.edu.unq.po2.tp8.composite.juegoDeEstrategia;

public abstract class Personaje {
	public Tupla<Integer, Integer> posicion = new Tupla<>(0, 0);
	
	public abstract void caminar(Tupla<Integer, Integer> inicio, Tupla<Integer, Integer> fin);

	public void agregar(Personaje p) {
		return;
	}
	
	public void eliminar(Personaje p) {
		return;
	}

	public Tupla<Integer, Integer> getPosicion() {
		return posicion;
	}

	public void colocarLaja() {
		return;
	}

	protected void avanzarEnZigZag() {
		return;
	}

}
