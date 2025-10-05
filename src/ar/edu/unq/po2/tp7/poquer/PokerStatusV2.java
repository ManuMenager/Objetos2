package ar.edu.unq.po2.tp7.poquer;

public class PokerStatusV2 {

	public String verificar(Carta carta1, Carta carta2, Carta carta3, Carta carta4, Carta carta5) {
		if (esPoquer(carta1, carta2, carta3, carta4, carta5)) return "Poquer";
        if (esTrio(carta1, carta2, carta3, carta4, carta5)) return "Trio";
        if (esColor(carta1, carta2, carta3 , carta4, carta5)) return "Color";
        return "Nada";
	}
	
	public boolean esPoquer(Carta c1, Carta c2, Carta c3, Carta c4, Carta c5) {
		int[] valores = {	
				c1.getValor(),
				c2.getValor(),
				c3.getValor(),
				c4.getValor(),
				c5.getValor()
			};
			
			for (int valor : valores) {
				int iguales = 0;
				for (int actual : valores) {
					if (valor == actual) {
						iguales++;
					}
				}
				if (iguales >= 4) {
					return true;
				}
			}
			return false;
	}
	
	public boolean esTrio(Carta c1, Carta c2, Carta c3, Carta c4, Carta c5) {
		int[] valores = {	
				c1.getValor(),
				c2.getValor(),
				c3.getValor(),
				c4.getValor(),
				c5.getValor()
			};
			
			for (int valor : valores) {
				int iguales = 0;
				for (int actual : valores) {
					if (valor == actual) {
						iguales++;
					}
				}
				if (iguales == 3) {
					return true;
				}
			}
			return false;
	}
	
	public boolean esColor(Carta c1, Carta c2, Carta c3, Carta c4, Carta c5) {
		String[] palos = {	
				c1.getPalo(),
				c2.getPalo(),
				c3.getPalo(),
				c4.getPalo(),
				c5.getPalo()
			};
			
			for (String palo : palos) {
				int iguales = 0;
				for (String actual : palos) {
					if (palo.equals(actual)) {
						iguales++;
					}
				}
				if (iguales == 5) {
					return true;
				}
			}
			return false;
	}
	
}