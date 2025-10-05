package ar.edu.unq.po2.tp7.poquer;

import java.util.List;

public class JugadaPoker {
	List<Carta> cartas;
	int rango;
	
	public boolean leGanaA(JugadaPoker jugada) {
		if (this.rango == jugada.rango) {
			return this.valorCartas().getFuerza() > jugada.valorCartas().getFuerza();
		} else {
			return this.getRango() > jugada.getRango();
		}
	}
	
	public int getRango() {
		return this.rango;
	}
	
	public Valor valorCartas() {
		return cartas.getFirst().getValor();
	}
}
