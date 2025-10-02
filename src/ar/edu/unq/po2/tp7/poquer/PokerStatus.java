package ar.edu.unq.po2.tp7.poquer;

public class PokerStatus {
	
	public boolean verificar(String c1, String c2, String c3, String c4, String c5) {
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
}