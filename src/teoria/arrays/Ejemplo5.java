package teoria.arrays;

public class Ejemplo5 {
    public static void main(String[] args) {
        int[][][] array = {
                        {{0, 1, 2}, {1, 2}},
                        {{2, 1},{3, 3},{4, 1, 2, 1}},
                        {{5, 0}}
                    };
        int contador = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                for (int k = 0; k < array[i][j].length; k++) {
                    System.out.printf("%3d", array[i][j][k]);
                    contador++;
                }
            }
        }
        System.out.printf("%n%nTOTAL DATOS: %d%n", contador);
    }
}
