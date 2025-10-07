package ar.edu.unq.po2.tp8.composite.juegoDeEstrategia;

public class Caballero extends Personaje {

	@Override
	public void caminar(Tupla<Integer, Integer> inicio, Tupla<Integer, Integer> fin) {
		while(!inicio.equals(fin)) {
			avanzarEnZigZag();
		}
	}
	
	@Override
	public void avanzarEnZigZag() {
		caminarHaciaLaDerecha();
		caminarHaciaLaIzquierda();
	}
	
	public void caminarHaciaLaIzquierda() {
		posicion.setFirst(posicion.getFirst()+1);
	}
	
	public void caminarHaciaLaDerecha() {
		posicion.setSecond(posicion.getSecond()+1);
	}

}
