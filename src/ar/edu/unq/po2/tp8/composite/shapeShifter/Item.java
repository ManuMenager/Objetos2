package ar.edu.unq.po2.tp8.composite.shapeShifter;

import java.util.ArrayList;
import java.util.List;

public class Item implements IShapeShifter {
	private List<Integer> value = new ArrayList<Integer>();
	
	public Item(int v) {
		value.add(v);
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
		return 0;
	}

	@Override
	public IShapeShifter flat() {
	    List<IShapeShifter> singleItem = new ArrayList<>();
	    singleItem.add(this);
	    // Devuelve un Nivel que solo contiene este Item
	    return new Nivel(singleItem); 
	}

	@Override
	public List<Integer> values() {
		return value;
	}

}
