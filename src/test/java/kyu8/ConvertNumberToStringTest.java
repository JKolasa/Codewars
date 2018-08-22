package kyu8;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ConvertNumberToStringTest {

    @Test
    public void positiveNumberTest(){
        assertEquals("123", ConvertNumberToString.numberToString(123));
    }

    @Test
    public void negativeNumberTest(){
        assertEquals("-123", ConvertNumberToString.numberToString(-123));
    }

    @Test
    public void zeroTest(){
        assertEquals("0", ConvertNumberToString.numberToString(0));
    }

}
