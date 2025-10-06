package ar.edu.unq.po2.tp8.composite.cultivos;

import java.util.List;

public class ParcelaMixta implements PorcionTierra {
	List<PorcionTierra> cultivos;
	
	public ParcelaMixta(List<PorcionTierra> cultivos) {
		this.cultivos = cultivos;
	}

	@Override
	public int gananciaAnualTrigo() {
		return cultivos.stream().mapToInt(c -> c.gananciaAnualTrigo()).sum() / 4;
	}

	@Override
	public int gananciaAnualSoja() {
		return cultivos.stream().mapToInt(c -> c.gananciaAnualSoja()).sum() / 4;
	}

}
