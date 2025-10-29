package ar.edu.unq.po2.tp10.strategy;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class EncriptacionPorOrdenPalabras implements IEstrategia {

	@Override
    public String encriptar(String texto) {
        List<String> palabras = Arrays.asList(texto.split(" "));
        Collections.reverse(palabras);
        return String.join(" ", palabras);
    }

    @Override
    public String desencriptar(String texto) {
        // La desencriptación es exactamente la misma operación:
        // invertir nuevamente el orden de las palabras.
        return encriptar(texto);
    }

}
