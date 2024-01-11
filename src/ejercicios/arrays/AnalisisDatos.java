package ejercicios.arrays;

import java.util.Random;

public class AnalisisDatos {
    public static double calcularValorMedio(int[] array) {
        int suma = 0;
        for (int entero : array)
            suma += entero;
        return 1.0 * suma / array.length;
    }
    public static int obtenerValorAlAzar(int[] array) {
        if (array.length == 0)
            return -1;
        /*Random random = new Random();
        int posicion = random.nextInt(array.length);
        return array[posicion];*/
        return array[new Random().nextInt(array.length)];
    }
    public static double calcularDesviacionTipica( int[] array) {
        double suma = 0.0;
        double valorMedio = calcularValorMedio(array);
        for (int entero : array) {
            suma += Math.pow(entero - valorMedio , 2);
        }
        return Math.sqrt( suma / (array.length - 1));
    }

}
