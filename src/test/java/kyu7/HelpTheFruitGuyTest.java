package kyu7;

import org.junit.Test;

import static org.junit.Assert.*;

public class HelpTheFruitGuyTest {

    @Test
    public void emptyArrayTest(){
       assertTrue(HelpTheFruitGuy.removeRottenFruits(new String[0]).length == 0);
    }

    @Test
    public void nullArrayTest(){
        assertSame(0, HelpTheFruitGuy.removeRottenFruits(null).length);
    }


    @Test
    public void arrayWithRottenFruitsTest(){
        String[] rotten = new String []{"rottenApple","rottenBanana","rottenApple","rottenPineapple","rottenKiwi"};
        String [] expected = new String []{"apple","banana","apple","pineapple","kiwi"};
        assertArrayEquals(expected, HelpTheFruitGuy.removeRottenFruits(rotten));
    }
}
