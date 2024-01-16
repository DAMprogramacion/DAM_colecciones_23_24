package teoria.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Stream;

public class Ejemplo1 {
    public static void main(String[] args) {
        Random random = new Random();
        List<Integer> listaEnteros  = new ArrayList<>(); //creamos la llista
        //rellene los datos con 10_000 valores aleotorios entre 0 y 100 (exclusive)
        for (int i = 0; i < 100_000; i++)
            listaEnteros.add(random.nextInt(100));
        System.out.println("Tamaño inicial: " + listaEnteros.size());
        Stream<Integer> stream1 = listaEnteros.stream();
        Stream<Integer> streamDistintos = stream1.distinct();
        List<Integer> listaDistinto = streamDistintos.toList();
        System.out.println("Tamaño distintos: " + listaDistinto.size());

    }
}
