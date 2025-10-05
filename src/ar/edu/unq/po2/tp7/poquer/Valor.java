package ar.edu.unq.po2.tp7.poquer;

public enum Valor {
	A(14),
	K(13),
	Q(12),
	J(11),
	DIEZ(10),
	NUEVE(9),
	OCHO(8),
	SIETE(7),
	SEIS(6),
	CINCO(5),
	CUATRO(4),
	TRES(3),
	DOS(2);
	
	private final int fuerza;

	Valor(int fuerza) {
		this.fuerza = fuerza;
	}
	
	public int getFuerza() {
		return fuerza;
	}
}