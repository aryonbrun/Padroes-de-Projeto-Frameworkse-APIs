import org.junit.Test;

import java.awt.image.AreaAveragingScaleFilter;

import static org.junit.Assert.*;

public class ArrayUtilTest {

    @Test
    public void soma() {
        int [] valores = {1,5,10,30};
        assertEquals(46, ArrayUtil.soma(valores));
    }

    @Test
    public void menor() {
        int [] valores = {91,5,123,19};
        assertEquals(5, ArrayUtil.menor(valores));
    }

    @Test
    public void maior() {
        int [] valores = {91,5,123,19};
        assertEquals(123, ArrayUtil.maior(valores));
    }

    @Test
    public void negativo() {
        int [] valoresA = {91,5,123,19};
        assertEquals(0, ArrayUtil.negativo(valoresA));

        int [] valoresB = {10,-5,35,42,54};
        assertEquals(1, ArrayUtil.negativo(valoresB));

        int [] valoresC = {1,4,-78,90,-89,99 };
        assertEquals(2, ArrayUtil.negativo(valoresC));

        int [] valoresD = {-2,-7,-10,-20,-40};
        assertEquals(3, ArrayUtil.negativo(valoresD));


    }

    @Test
    public void par() {
        int [] valoresA = {2,4,6,8};
        assertTrue(ArrayUtil.par(valoresA));

        int [] valoresB = {10,15,20,42,54};
        assertFalse(ArrayUtil.par(valoresB));

        int [] valoresC = {1,3,5};
        assertFalse(ArrayUtil.par(valoresC));
    }

    @Test
    public void busca() {
        int [] valoresA = {2,4,6,8};
        assertEquals(3, ArrayUtil.busca(valoresA, 8));
        assertEquals(-1, ArrayUtil.busca(valoresA, 5));

        int [] valoresB = {10,15,20,142,54};
        assertEquals(0, ArrayUtil.busca(valoresB, 10));
        assertEquals(-1, ArrayUtil.busca(valoresB, 25));

        int [] valoresC = {1,-3,5};
        assertEquals(-1, ArrayUtil.busca(valoresC, -1));
        assertEquals(0, ArrayUtil.busca(valoresC, 1));
    }
}