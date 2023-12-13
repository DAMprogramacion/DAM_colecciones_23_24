package teoria.arrays;

import java.util.Arrays;

public class Ejemplo1 {
    public static void main(String[] args) {
        //declaramos el array
        String[] cadena1;
        //creamos el array
        cadena1 = new String[3];
        System.out.println("Justo después de crear el array");
        System.out.println(Arrays.toString(cadena1));
        System.out.println("=================");
        //rellenamos el array
        cadena1[0] = "Bienvenido";
        cadena1[1] = " a ";
        cadena1[2] = "Java";
        System.out.println(Arrays.toString(cadena1));
      //cadena1[3] = "lo que sea"; no existe esa posición
        //OTRA FORMA
        String cadena2[] = new String[3];
        cadena2[0] = "Bienvenido".toUpperCase();
        cadena2[1] = " a ".toUpperCase();
        cadena2[2] = "Java".toUpperCase();
        System.out.println(Arrays.toString(cadena2));
        //la forma mas habitual:
        String[] cadena3 = new String[3];
        cadena3[0] = "Bienvenido";
        cadena3[1] = " a ";
        cadena3[2] = "Java";
        System.out.println(Arrays.toString(cadena3));
        System.out.println("======Creamos un arry de enteros======");
        int[] numerosEnteros = new int[5];
        System.out.println(Arrays.toString(numerosEnteros));
        //declarando, creando e inicializando en una sóla línea
        System.out.println("==============");
        float[] numerosFloat = {1, 2, 3.3f};
        System.out.println(Arrays.toString(numerosFloat));
    }

}
