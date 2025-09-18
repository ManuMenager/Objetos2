package ar.edu.unq.po2.tp6.clienteDeEmail.caso1;

import java.util.List;

public interface IServidor1 {
	
	public List<Correo> recibirNuevos(String user, String pass);

	public void conectar(String nombreUsuario, String passusuario);

	public void enviar(Correo correo);

}
