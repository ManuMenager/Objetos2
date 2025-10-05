package ar.edu.unq.po2.tp7.poquer;

public class Carta {
	Valor valor;
	String palo;
	
	public Carta(Valor valor, String palo) {
		this.valor = valor;
		this.palo = palo;
	}
	
	public Valor getValor() {
		return this.valor;
	}

	public boolean esMayorQue(Carta carta) {
		return (this.valor.getFuerza() > carta.valor.getFuerza());
	}

	public boolean tieneMismoPaloQue(Carta carta) {
		return (this.palo.equals(carta.palo));
	}

	public String getPalo() {
		return this.palo;
	}
}