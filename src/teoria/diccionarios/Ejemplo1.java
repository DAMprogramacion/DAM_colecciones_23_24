package teoria.diccionarios;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Ejemplo1 {
    public static void main(String[] args) {
        Map<Integer, String> map1 = new HashMap<>(); //diccionario vacío
        map1.put(1, "manuel"); map1.put(2, "javier");
        map1.put(3, "gabriel"); map1.put(4, "elisa");
        System.out.printf("Tamaño del diccionario %d%n", map1.size());
        System.out.println("========================");
        mostrarValoresDiccionario(map1);
        Map<Integer, String> map2 = Map.of(0, "felisa" ,1, "bernardo" ,3, "luisa" );
        //map2.put(4, "emilia"); no se puede es inmutable
        System.out.println("========================");
        mostrarValoresDiccionario(map2);
    }

    private static void mostrarValoresDiccionario(Map<Integer, String> map1) {
        for (int claves : map1.keySet()) {
            System.out.printf("%d -> %s%n", claves, map1.get(claves));
        }
    }
}
