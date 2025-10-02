package ar.edu.unq.po2.tp7.poquer;

public class PokerStatusV2 {

	public String verificar(String c1, String c2, String c3, String c4, String c5) {
		if (esPoquer(c1, c2, c3, c4, c5)) return "Poquer";
        if (esTrio(c1, c2, c3, c4, c5)) return "Trio";
        if (esColor(c1, c2, c3 , c4, c5)) return "Color";
        return "Nada";
	}
	
	public boolean esPoquer(String c1, String c2, String c3, String c4, String c5) {
		String[] valores = {	
				c1.substring(0, c1.length() - 1),
				c2.substring(0, c2.length() - 1),
				c3.substring(0, c3.length() - 1),
				c4.substring(0, c4.length() - 1),
				c5.substring(0, c5.length() - 1)
			};
			
			for (String valor : valores) {
				int iguales = 0;
				for (String actual : valores) {
					if (valor.equals(actual)) {
						iguales++;
					}
				}
				if (iguales >= 4) {
					return true;
				}
			}
			return false;
	}
	
	public boolean esTrio(String c1, String c2, String c3, String c4, String c5) {
		String[] valores = {	
				c1.substring(0, c1.length() - 1),
				c2.substring(0, c2.length() - 1),
				c3.substring(0, c3.length() - 1),
				c4.substring(0, c4.length() - 1),
				c5.substring(0, c5.length() - 1)
			};
			
			for (String valor : valores) {
				int iguales = 0;
				for (String actual : valores) {
					if (valor.equals(actual)) {
						iguales++;
					}
				}
				if (iguales == 3) {
					return true;
				}
			}
			return false;
	}
	
	public boolean esColor(String c1, String c2, String c3, String c4, String c5) {
		char[] figuras = {	
				c1.charAt(c1.length() - 1),
				c2.charAt(c2.length() - 1),
				c3.charAt(c3.length() - 1),
				c4.charAt(c4.length() - 1),
				c5.charAt(c5.length() - 1)
			};
			
			for (char figura : figuras) {
				int iguales = 0;
				for (char actual : figuras) {
					if (figura == actual) {
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