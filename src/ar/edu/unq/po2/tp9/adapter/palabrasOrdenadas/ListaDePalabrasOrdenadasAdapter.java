package ar.edu.unq.po2.tp9.adapter.palabrasOrdenadas;

import javax.swing.DefaultListModel;

public class ListaDePalabrasOrdenadasAdapter extends DefaultListModel<String>{
	private ListaDePalabrasOrdenadas listaOrdenada;
	
	public ListaDePalabrasOrdenadasAdapter(ListaDePalabrasOrdenadas listaOrdenada) {
		this.listaOrdenada = listaOrdenada;
	}
	
	@Override
	public void addElement(String palabra) {
		this.listaOrdenada.agregarPalabra(palabra);
        super.clear();
        for (int i = 0; i < listaOrdenada.cantidadDePalabras(); i++) {
            super.addElement(listaOrdenada.getPalabraDePosicion(i));
        }
	}
}
