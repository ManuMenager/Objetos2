package ar.edu.unq.po2.tp3;

public class Expresiones {

	//Ejercicio 4
	
	public static void main(String[] args) {
		String a = "abc";
		String s = a;
		String t;
		
		System.out.println(s.length()); 
		// t.length() Error, t no está inicializada.
		System.out.println(1+a);
		System.out.println(a.toUpperCase());
		System.out.println("Libertad".indexOf("r"));
		System.out.println("Universidad".lastIndexOf('i'));
		System.out.println("Quilmes".substring(2,4));
		System.out.println((a.length() + a).startsWith("a"));
		System.out.println(s == a);
		System.out.println(a.substring(1,3).equals("bc"));
	}
}