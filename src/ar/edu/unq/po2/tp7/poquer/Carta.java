package ar.edu.unq.po2.tp7.poquer;

public class Carta {
	int valor;
	String palo;
	
	public Carta(int valor, String palo) {
		this.valor = valor;
		this.palo = palo;
	}
	
	public int getValor() {
		return this.valor;
	}

	public boolean esMayorQue(Carta carta) {
		return (this.valor > carta.valor);
	}

	public boolean tieneMismoPaloQue(Carta carta) {
		return (this.palo.equals(carta.palo));
	}

	public String getPalo() {
		return this.palo;
	}
}