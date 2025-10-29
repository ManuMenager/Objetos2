package ar.edu.unq.po2.tp10.strategy;

public class EncriptadorNaive {
	private IEstrategia estrategia;
	
	public void setEstrategia(IEstrategia estrategia) {
		this.estrategia = estrategia;
	}
	
	public String encriptar(String palabra) {
		 return this.estrategia.encriptar(palabra);
	}
	
	public String desencriptar(String palabra) {
		 return this.estrategia.desencriptar(palabra);
	}
	
	public void setEstretegia(IEstrategia estrategia) {
		this.estrategia = estrategia;
	}
}
