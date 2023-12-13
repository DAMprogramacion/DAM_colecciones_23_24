package teoria.arrays;

import java.util.Arrays;

public class Ejemplo3 {
    private int[] enteros;

    public Ejemplo3(int[] enteros) {
        this.enteros = enteros;
    }

    public int[] getEnteros() {
        return enteros;
    }

    public void setEnteros(int[] enteros) {
        this.enteros = enteros;
    }

    @Override
    public String toString() {
        return Arrays.toString(enteros);
    }
    public int obtenerMayorValor1() {
        int numeroMasGrande = Integer.MIN_VALUE;
        for( int entero :  enteros ) {
            if (entero > numeroMasGrande)
                numeroMasGrande = entero;
        }
        return numeroMasGrande;
    }
    public int obtenerMayorValor2() {
        int numeroMasGrande = enteros[0];
        for(int i = 1; i < enteros.length; i++  ) {
            if (enteros[i] > numeroMasGrande)
                numeroMasGrande = enteros[i];
        }
        return numeroMasGrande;
    }
}
