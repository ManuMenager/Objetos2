package ar.edu.unq.po2.tp8.state;

public class Maquina {
	int fichas = 0;
	EstadoMaquina estado = new SinFicha();
	
	public void ingresarFicha() {
		fichas += 1;
	}
	
	public String iniciar() {
		// Vuelve al estado inicial
		fichas -= estado.getFichasQueConsume();
		this.estado = new SinFicha();
		return estado.iniciar();
	}
}
