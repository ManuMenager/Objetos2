package ar.edu.unq.po2.tp10.strategy;

public class EncriptacionPorNumeros implements IEstrategia {
	
	@Override
	public String encriptar(String texto) {
		StringBuilder resultado = new StringBuilder();

		texto = texto.toLowerCase();
		for (int i = 0; i < texto.length(); i++) {
			char c = texto.charAt(i);
			if (c >= 'a' && c <= 'z') {
				resultado.append((c - 'a' + 1));
			} else if (c == ' ') {
	            resultado.append(0);
	        } else {
	            // dejamos los caracteres no alfabéticos tal cual
	             resultado.append(c);
	        }
	        if (i < texto.length() - 1) {
	             resultado.append(",");
	        }
	    }
	    return resultado.toString();
	}

	@Override
	public String desencriptar(String texto) {
	    StringBuilder resultado = new StringBuilder();

	    String[] partes = texto.split(",");
	    for (String p : partes) {
	    	if (p.equals("0")) {
	    	   resultado.append(" ");
	    	} else {
	    		try {
	    			int num = Integer.parseInt(p);
	    			if (num >= 1 && num <= 26) {
	    				resultado.append((char) ('a' + num - 1));
	    			} else {
	    				resultado.append(p); // por si hay algo no mapeado
	    			}
	    		} catch (NumberFormatException e) {
	    			resultado.append(p);
	    		}
	    	}
	    }
	    return resultado.toString();
	}
}
