package kyu7;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ReverseNumberTest {

    @Test
    public void reversePositiveNumberTest(){
        assertEquals(123, ReverseNumber.reverse(321));
    }

    @Test
    public void reverseNegativeNumberTest(){
        assertEquals(-123, ReverseNumber.reverse(-321));
    }

    @Test
    public void reverseFullThousandTest(){
        assertEquals(1, ReverseNumber.reverse(1000));
    }

    @Test
    public void reverseFullMinusThousandTest(){
        assertEquals(-1, ReverseNumber.reverse(-1000));
    }

    @Test
    public void zeroTest(){
        assertEquals(0, ReverseNumber.reverse(0));
    }
}
