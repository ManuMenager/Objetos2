package ar.edu.unq.po2.tp3;

import java.util.ArrayList;

public class Multioperador {

	public int sumarTodos(ArrayList<Integer> array) {
		int sumaActual = 0;
		for (Integer n : array) {
			sumaActual += n;
		}
		return sumaActual;
	}
	
	public int restarTodos(ArrayList<Integer> array) {
		if (array.isEmpty()) return 0;
		if (array.size() == 1) return array.get(0);
		
		int restaActual = array.get(0);
		for (int i = 1; i < array.size(); i++) {
			restaActual -= array.get(i);
		}
		return restaActual;
	}
	
	public int multiplicarTodos(ArrayList<Integer> array) {
		if (array.isEmpty()) return 0;
		
		int multiActual = 1;
		for (Integer n : array) {
			multiActual *= n;
		}
		return multiActual;
	}
	
}
