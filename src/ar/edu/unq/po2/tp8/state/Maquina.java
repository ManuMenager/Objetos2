package ar.edu.unq.po2.tp8.state;

public class Maquina {
	int fichas = 0;
	Pantalla pantalla;
	EstadoMaquina estado;
	
	public Maquina(Pantalla pantalla) {
		this.fichas = 0;
		this.pantalla = pantalla;
		this.estado = new SinFicha();
	}

	public void ingresarFicha() {
		fichas += 1;
		if (fichas == 1) {
			this.estado = new UnJugador();
		} else {
			this.estado = new DosJugadores();
		}
	}
	
	public void iniciar() {
		pantalla.mostrar(estado.iniciar());
		
		// Vuelve al estado inicial
		fichas -= estado.getFichasQueConsume();
		this.estado = new SinFicha();
	}
}
