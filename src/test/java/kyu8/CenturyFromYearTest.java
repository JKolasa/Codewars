package kyu8;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class CenturyFromYearTest {

    @Test
    public void minusYearTest(){
        assertEquals(-1,CenturyFromYear.century(-100));
    }

    @Test
    public void lessThan100Test(){
        assertEquals(1, CenturyFromYear.century(89));
    }

    @Test
    public void fullHundredCentury(){
        assertEquals(18, CenturyFromYear.century(1800));
    }

    @Test
    public void hunderdAndSomethingTest(){
        assertEquals(19, CenturyFromYear.century(1801));
    }
}
