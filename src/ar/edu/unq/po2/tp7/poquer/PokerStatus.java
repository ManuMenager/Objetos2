package ar.edu.unq.po2.tp7.poquer;

public class PokerStatus {
	
	public boolean verificar(Carta carta1, Carta carta2, Carta carta3, Carta carta4, Carta carta5) {
		Valor[] valores = {	
				carta1.getValor(),
				carta2.getValor(),
				carta3.getValor(),
				carta4.getValor(),
				carta5.getValor(),
		};
		
		for (Valor valor : valores) {
			int iguales = 0;
			for (Valor actual : valores) {
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
}