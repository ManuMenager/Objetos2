package ar.edu.unq.po2.tp7.poquer;

import java.util.ArrayList;

public class Poker extends JugadaPoker {
	public Poker(ArrayList<Carta> cartas) {
		this.cartas = cartas;
		this.rango = 3;
	}
}
