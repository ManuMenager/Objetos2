package ar.edu.unq.po2.tp8.composite.shapeShifter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		Item hoja1 = new Item(1); 
        Item hoja2 = new Item(2);
        
        System.out.println("--- Instancia Hoja 1 ---");
        System.out.println("Valores: " + hoja1.values()); // [1]
        System.out.println("Profundidad: " + hoja1.deepest()); // 0
        System.out.println("Aplanado (flat): " + hoja1.flat().values()); // [1]
        
        List<IShapeShifter> elementosNivelA = new ArrayList<>(Arrays.asList(hoja1, hoja2));
        Nivel nivelA = new Nivel(elementosNivelA);
        
        System.out.println("\n--- Instancia Nivel A (Hoja 1, Hoja 2) ---");
        System.out.println("Valores: " + nivelA.values()); // [1, 2]
        System.out.println("Profundidad: " + nivelA.deepest()); // 1
        System.out.println("Aplanado (flat): " + nivelA.flat().values());
	}
}
