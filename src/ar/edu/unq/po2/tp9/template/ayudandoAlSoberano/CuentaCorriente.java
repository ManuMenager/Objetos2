package ar.edu.unq.po2.tp9.template.ayudandoAlSoberano;

public class CuentaCorriente extends CuentaBancaria{
	private int descubierto;
	
	public CuentaCorriente(String titular, int descubierto){
		super(titular);
		this.descubierto=descubierto;
	}
	
	public int getDescubierto(){
		return this.descubierto;
	}
	
	@Override
	public boolean condicionExtraer(int monto) {
		return this.getSaldo() + this.getDescubierto() >= monto;
	}
}
