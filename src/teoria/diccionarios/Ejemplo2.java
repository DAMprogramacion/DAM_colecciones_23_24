package teoria.diccionarios;

import java.util.*;

public class Ejemplo2 {
    public static void main(String[] args) {
        List<Integer> listaEnteros = new ArrayList<>();
        listaEnteros.add(1); listaEnteros.add(2); listaEnteros.add(15);
        listaEnteros.add(15);
        System.out.println(listaEnteros.get(2));
        for (int entero : listaEnteros) {
            System.out.printf("Valor: %d%n", entero);
        }
        List<String> listaCadenas = List.of("uno", "dos", "tres");
        for (String cadena : listaCadenas){
            System.out.println(cadena);
        }

        Map<Integer, String> mapa = new HashMap<>();
        mapa.put(1, "uno"); mapa.put(2, "dos"); mapa.put(55, "tres");
        mapa.put(1, "otro valor");
        Set<Integer> claves = mapa.keySet();
        for (Integer clave : claves){
            System.out.printf("Clave: %d - Valor: %s%n", clave, mapa.get(clave));
        }
        Map<Integer, Double> mapa2 = Map.of(1, 1.0,2, 2.0 );

        Set<Float> set = Set.of(1.2f, 3.3f); //no duplicados
        //aquí no ha y get
        for (float valor : set)
            System.out.println(valor);
    }
}
