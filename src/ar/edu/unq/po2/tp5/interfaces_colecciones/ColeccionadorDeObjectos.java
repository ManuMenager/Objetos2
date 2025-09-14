package ar.edu.unq.po2.tp5.interfaces_colecciones;

import java.util.Collection;
import java.util.List;
import java.util.Queue;
import java.util.Set;

public class ColeccionadorDeObjectos {

	//XXX = List. Devuelve el primer elemento de la lista.
	public Object getFirstFrom(List<Object> collection) {
		return collection.get(0);
	}
	
	// YYY = Queue. Agrega el elemento dado al final de la cola.
	public void addLast(Object element, Queue<Object> collection) {
		collection.add(element);
	}
	
	// ZZZ = List. Devuelve los elementos de la lista que estan entre las posiciones dadas.  
	public Collection<Object> getSubCollection(List<Object> collection, int from, int to) {
		return collection.subList(from, to);
	}
	
	// WWW = Set. Indica si el elemento dado está en el conjunto dado, está operación es mas eficiente en un Set aunque este no puede tener elementos repetidos.
	public Boolean constainsElement(Set<Object> collection, Object element) {
		return collection.contains(element);
	}
}