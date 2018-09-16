package kyu6;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EqualSidesOfAnArrayTest {

    @Test
    public void emptyArrayReturnsMinusOne(){
        assertEquals(-1, EqualSidesOfAnArray.findEvenIndex(new int[] {}));
    }

    @Test
    public void testReturnsThirdArrayPosition(){
        assertEquals(3, EqualSidesOfAnArray.findEvenIndex(new int[] {1, 2, 3, 4, 3, 2, 1}));
    }

    @Test
    public void testReturnsFirstArrayPosition(){
        assertEquals(1, EqualSidesOfAnArray.findEvenIndex(new int[] {1,100,50,-51,1,1}));
    }

    @Test
    public void testReturnsMinusOneArrayPosition(){
        assertEquals(-1,EqualSidesOfAnArray.findEvenIndex(new int[] {1,2,3,4,5,6}));
    }

    @Test
    public void testReturnNumberThreeArrayPosition(){
        assertEquals(3,EqualSidesOfAnArray.findEvenIndex(new int[] {20,10,30,10,10,15,35}));
    }

    @Test
    public void testReturnMinusOneArrayPosition(){
        assertEquals(-1,EqualSidesOfAnArray.findEvenIndex(new int[] {-8505, -5130, 1926, -9026}));
    }

    @Test
    public void testReturnOneArrayPosition(){
        assertEquals(1,EqualSidesOfAnArray.findEvenIndex(new int[] {2824, 1774, -1490, -9084, -9696, 23094}));
    }

    @Test
    public void testReturnsSixthArrayPosition(){
        assertEquals(6,EqualSidesOfAnArray.findEvenIndex(new int[] {4, 5, 6, 7, 8, 9, 10, 9, 8, 7, 6, 5, 4}));
    }
}
