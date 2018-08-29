package kyu8;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TwiceAsOldTest {

    @Test
    public void sonsAgeZeroTest(){
        assertEquals(30, TwiceAsOld.twiceAsOld(30,0));
    }

    @Test
    public void bothMoreThanZeroTest(){
        assertEquals(16, TwiceAsOld.twiceAsOld(30,7));
    }

    @Test
    public void fourtyFiveandThirtyTest(){
        assertEquals(15, TwiceAsOld.twiceAsOld(45,30));
    }

    @Test
    public void bothZeroAge(){
        assertEquals(0, TwiceAsOld.twiceAsOld(0,0));
    }

    @Test
    public void oneIsLessThanZero(){
        assertEquals(0, TwiceAsOld.twiceAsOld(-2,0));
    }
}
