package kyu7;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FromTheMinimumTest {

    @Test
    public void withoutDuplicatesTest(){
        assertEquals(1234, FormTheMinimum.minValue(new int[] {1, 3, 2, 4}));
    }

    @Test
    public void withDuplicatesTest(){
        assertEquals(1234, FormTheMinimum.minValue(new int[] {1, 3, 2, 2, 1, 4}));
    }

}
