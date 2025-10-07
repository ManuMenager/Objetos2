package ar.edu.unq.po2.tp8.composite.shapeShifter;

import java.util.ArrayList;
import java.util.List;

public class Nivel implements IShapeShifter {
	List<IShapeShifter> elementos;
	
	public Nivel(List<IShapeShifter> elementos) {
		this.elementos = elementos;
	}
	
	@Override
	public IShapeShifter compose(IShapeShifter elemento) {
		List<IShapeShifter> compose = new ArrayList<IShapeShifter>();
		compose.add(this);
		compose.add(elemento);
		return new Nivel(compose);
	}

	@Override
	public int deepest() {
		int profundidadMax = 0;
		for (IShapeShifter elemento : this.elementos) {
			profundidadMax = Math.max(elemento.deepest(), profundidadMax);
		}
		return profundidadMax + 1;
	}

	@Override
	public IShapeShifter flat() {
	    List<IShapeShifter> hojasAplanadas = new ArrayList<IShapeShifter>();
	    
	    for (IShapeShifter elemento : this.elementos) {
	        Nivel n = (Nivel) elemento.flat(); 
	        hojasAplanadas.addAll(n.elementos);
	    }
	    return new Nivel(hojasAplanadas);
	}

	@Override
	public List<Integer> values() {
		List<Integer> totalValues = new ArrayList<>();
		for (IShapeShifter elemento : this.elementos) {
			totalValues.addAll(elemento.values());
		}
		return totalValues;
	}
}
