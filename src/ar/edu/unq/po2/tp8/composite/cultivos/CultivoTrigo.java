package ar.edu.unq.po2.tp8.composite.cultivos;

public class CultivoTrigo implements PorcionTierra {

	@Override
	public int gananciaAnualTrigo() {
		return 1200;
	}

	@Override
	public int gananciaAnualSoja() {
		return 0;
	}

}
