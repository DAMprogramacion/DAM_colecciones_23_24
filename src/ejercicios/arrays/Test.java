package ejercicios.arrays;

import java.util.Arrays;
import java.util.Random;

public class Test {
    public static void main(String[] args) {
        Random random = new Random();
        int[] arrayEnteros = new int[25];  //se rellena de 25 ceros
        System.out.println(Arrays.toString(arrayEnteros));
        for (int i = 0; i < arrayEnteros.length; i++) {
            arrayEnteros[i] = random.nextInt(100);
        }
        System.out.println(Arrays.toString(arrayEnteros));
        System.out.printf("Valor medio: %.3f%n",
                AnalisisDatos.calcularValorMedio(arrayEnteros));
        System.out.printf("Valor medio: %.3f%n",
                AnalisisDatos.calcularValorMedio(new int[]{}));
        System.out.println("=========================");
        System.out.printf("Valor obtenido al azar: %d%n",
                AnalisisDatos.obtenerValorAlAzar(arrayEnteros));
        System.out.printf("Valor obtenido al azar: %d%n",
                AnalisisDatos.obtenerValorAlAzar(new int[]{}));
        System.out.println("==========================");
        System.out.printf("Desviciación típica: %.2f%n",
                AnalisisDatos.calcularDesviacionTipica(arrayEnteros));
        System.out.printf("Desviciación típica: %.2f%n",
                AnalisisDatos.calcularDesviacionTipica(new int[]{}));

    }
}
