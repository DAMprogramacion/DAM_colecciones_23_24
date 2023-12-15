package teoria.listas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Ejemplo2 {
    static Random random = new Random();
    public static void main(String[] args) {
        final int TAMANNO = 10;
        List<Integer> enteros = crearListaTamanno(20);
        enteros.add(2);
        System.out.println("===LISTA ORIGINAL===");
        System.out.println(enteros);
        System.out.println("====PARES====");
        System.out.println(obtenerPares(enteros));
        System.out.println("=====ELIMINANDO EL 3====");
        eliminarNumero(enteros, 3);
        System.out.println(enteros);

    }

    private static List<Integer> crearListaTamanno(int tamanno) {
        List<Integer> listaPares = new ArrayList<>();
        for (int i = 0; i < tamanno; i++) {
            listaPares.add(random.nextInt(15));
        }
        return listaPares;
    }

    //metodo que pasamos una colección y nos devuelva
    // otra colección con solo los valores pares.
    private static List<Integer> obtenerPares(List<Integer> enteros) {
        List<Integer> listaPares = new ArrayList<>();
        for ( Integer entero : enteros ) {
            if (entero % 2 == 0)
                listaPares.add(entero);
        }
        return listaPares;
    }

    //método que se le pasa una colección de enteros y un  número
    //y elimina eL primer número
    public static void eliminarNumero(List<Integer> enteros, Integer numero) {
        enteros.remove(numero);
    }

    //método que se le pasa una colección de enteros y un entero
    //y añade este entero a la colección

    //método que se le pasa una colección de enteros, un entero,
    //un índice y añade el entero a esa posición índice
}
