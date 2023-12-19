package teoria.conjuntos;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class Ejemplo1 {
    public static void main(String[] args) {
        Set<Integer> numeros = Set.of(1, 2, 3, 4);
       // numeros.add(5); no se puede añadir, con of es inmutable
        for (int numero : numeros)
            System.out.println(numero);
        // conjunto vacío
        Set<String> cadenas = new HashSet<>();
        cadenas.add("pepe");
        cadenas.add("curro");
        cadenas.add("luis");
        System.out.println(cadenas);
        cadenas.add("pepe");
        System.out.println(cadenas);
        cadenas.add("africa");
        System.out.println(cadenas);
        cadenas.add("pepe".toUpperCase());
        System.out.println(cadenas);

    }
}
