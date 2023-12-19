package teoria.listas;

import java.util.ArrayList;
import java.util.List;

public class Ejemplo1 {
    public static void main(String[] args) {
        //creando una lista vacía
        List<String> listaCiudades = new ArrayList<>();
        listaCiudades.add("Madrid");
        listaCiudades.add("Paris");
        listaCiudades.add("Moscú");
        listaCiudades.add("Bruselas");
        listaCiudades.add("Kiev");
        System.out.println(listaCiudades);
        System.out.println("===MOSTRAR CIUDADES MAYÚSCULA===");
        for (String ciudad : listaCiudades) {
            System.out.printf("%-10S", ciudad);
        }
        System.out.println("\n===MOSTRAR CIUDADES Y POSICIONES===");
        for (int i = 0; i < listaCiudades.size(); i++) {
            System.out.printf("%d: %s%n", i + 1, listaCiudades.get(i));
        }
    }
}
