package teoria.arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Ejemplo2Test {

    @Test
    void invertirArrayChar() {
        assertNull(Ejemplo2.invertirArrayChar(null));
        assertArrayEquals(new char[]{'c', 'b', 'a'},
                Ejemplo2.invertirArrayChar(new char[]{'a', 'b', 'c'}));
        assertArrayEquals(new char[]{'c'},
                Ejemplo2.invertirArrayChar(new char[]{'c'}));
        assertArrayEquals(new char[]{'d', 'c', 'b', 'a'},
                Ejemplo2.invertirArrayChar(new char[]{'a', 'b', 'c', 'd'}));
        assertArrayEquals(new char[]{}, Ejemplo2.invertirArrayChar(new char[]{}));
        char[] original = {'1', '2'};
        char[] noEsperado = {'1', '3'};
        char[] invertido =  Ejemplo2.invertirArrayChar(original);
        assertNotEquals(noEsperado[0], invertido[0]);
    }
}