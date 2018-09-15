package kyu7;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FindDivisorsOfANumberTest {

    @Test
    public void return0DividorsTest(){
        assertEquals(0, FindDivisorsOfANumber.numberOfDivisors(-10));
    }

    @Test
    public void oneDividorsTest(){
        assertEquals(1, FindDivisorsOfANumber.numberOfDivisors(1));
    }

    @Test
    public void threeDividorsTest(){
        assertEquals(3, FindDivisorsOfANumber.numberOfDivisors(4));
    }

    @Test
    public void twoDividorsTest(){
        assertEquals(2, FindDivisorsOfANumber.numberOfDivisors(5));
    }

    @Test
    public void sixDividorsTest(){
        assertEquals(6, FindDivisorsOfANumber.numberOfDivisors(12));
    }

    @Test
    public void eightDividorsTest(){
        assertEquals(8, FindDivisorsOfANumber.numberOfDivisors(30));
    }
}
