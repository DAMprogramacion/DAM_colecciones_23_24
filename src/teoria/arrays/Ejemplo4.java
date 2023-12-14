package teoria.arrays;

import java.util.Arrays;
import java.util.Random;

public class Ejemplo4 {
    public static void main(String[] args) {
        Random random = new Random();
        int[][] arrayBid1 = new int[2][3];
        System.out.println("====antes de rellenar====");
        mostrarDatos(arrayBid1);

        for (int i = 0; i < arrayBid1.length; i++) {
            for (int j = 0; j < arrayBid1[i].length; j++) {
                arrayBid1[i][j] = random.nextInt(10);
            }
        }
        System.out.println("====antes de rellenar====");
        mostrarDatos(arrayBid1);
        //usando literales
        int[][] arrayBid2 = {
                                {1,2},
                                {3,4,5},
                                {5,5,5,5,5,5,5,5}
                            };
        System.out.println("====mostrando array literales===");
        mostrarDatos(arrayBid2);
    }

    private static void mostrarDatos(int[][] arrayBid1) {
        for (int i = 0; i < arrayBid1.length; i++) {
            for (int j = 0; j < arrayBid1[i].length; j++) {
                System.out.printf("Posición %d,%d valor %d%n",
                        i, j, arrayBid1[i][j]);
            }
        }
    }
}
