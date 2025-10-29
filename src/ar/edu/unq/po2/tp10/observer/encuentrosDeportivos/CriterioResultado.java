package ar.edu.unq.po2.tp10.observer.encuentrosDeportivos;

public class CriterioResultado implements Criterio{
	private String resultado;

	public CriterioResultado(String resultado) {
		this.resultado = resultado;
	}
	
	@Override
	public boolean cumple(Partido partido) {
		return partido.getResultado().equalsIgnoreCase(resultado);
	}

}
