package teoria.stream;

import java.util.*;
import java.util.stream.Stream;

public class Ejemplo1 {
    public static void main(String[] args) {
        Random random = new Random();
        List<Integer> listaEnteros  = new ArrayList<>(); //creamos la llista
        //rellene los datos con 10_000 valores aleotorios entre 0 y 100 (exclusive)
        for (int i = 0; i < 100; i++)
            listaEnteros.add(random.nextInt(100));
        System.out.println("Tamaño inicial: " + listaEnteros.size());

        //buscando elementos distintos
        Stream<Integer> stream1 = listaEnteros.stream(); //creamos un stream
        Stream<Integer> streamDistintos = stream1.distinct(); //creamos un strem con elementos distintos
        List<Integer> listaDistinto = streamDistintos.toList(); //mandamos los elementos distintos a una lista
        System.out.println("Tamaño distintos: " + listaDistinto.size());
        listaDistinto.forEach(System.out::println);

        //contar todos los pares distintos, menores que 50 en la lista original
        long numeroParesDistintos = listaEnteros.stream()
                                                .filter(numero -> numero % 2 == 0)
                                                .filter(numero ->  numero < 50)
                                                .distinct()
                                                .count();
        System.out.printf("Cantidad de pares menores que 50: %d%n", numeroParesDistintos);

        //mostrar los impares distintos en consola de la lista inicial, ORDENADOS
        listaEnteros.stream()
                .filter(numero -> numero % 2 != 0 )
                .distinct()
                .sorted()
                .forEach(numero -> System.out.printf("%d ", numero));



        Optional<Integer> suma1 =  listaEnteros.stream()
                .reduce( (x, y) -> x + y);
        



        if (suma1.isPresent())
            System.out.printf("%nLa suma1 vale %d%n", suma1.get());


    }
}
