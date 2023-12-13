package teoria.arrays;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Ejemplo3Test {
    static Ejemplo3 ejemplo3, ejemplo3_1;
    @BeforeEach
    void setUp() {
        ejemplo3 = new Ejemplo3(new int[]{5, 6, 1, 9, 0});
        ejemplo3_1 = new Ejemplo3(new int[]{});
    }

    @Test
    void obtenerMayorValor2() {
        assertEquals(9,ejemplo3.obtenerMayorValor2() );
        assertNotEquals(0,ejemplo3.obtenerMayorValor2() );
        assertEquals(Integer.MIN_VALUE,ejemplo3_1.obtenerMayorValor2() );


    }
}