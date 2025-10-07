package ar.edu.unq.po2.tp8.composite.juegoDeEstrategia;

public class Ingeniero extends Personaje {
	private int lajas;
	
	public Ingeniero() {
		this.lajas = 0;
	}
	
	public Ingeniero(int lajas) {
		this.lajas = lajas;
	}

	@Override
	public void caminar(Tupla<Integer, Integer> inicio, Tupla<Integer, Integer> fin) {
		while(!inicio.equals(fin)) {
			colocarLaja();
			caminarHaciaArriba();
			colocarLaja();
			caminarHaciaLaDerecha();
		}
	}
	
	@Override
	public void colocarLaja() {
		if (lajas > 0) {
			lajas--;
		}
	}
	
	public void caminarHaciaArriba() {
		posicion.setFirst(posicion.getFirst()+1);
	}
	
	public void caminarHaciaLaDerecha() {
		posicion.setSecond(posicion.getSecond()+1);
	}
	
}
