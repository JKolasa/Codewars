package kyu7;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class IsogramsTest {

    @Test
    public void dermatoglyphicsTestGivesTrue(){
        assertTrue(Isogram.isIsogram("Dermatoglyphics"));
    }

    @Test
    public void isogramTestGivesTrue(){
        assertTrue(Isogram.isIsogram("isogram"));
    }

    @Test
    public void mooseTestGivesFalse(){
        assertFalse(Isogram.isIsogram("moose"));
    }

    @Test
    public void dermatoglyphicsTestGivesTrue2(){
        assertTrue(Isogram.isIsogram2("Dermatoglyphics"));
    }

    @Test
    public void isogramTestGivesTrue2(){
        assertTrue(Isogram.isIsogram2("isogram"));
    }

    @Test
    public void mooseTestGivesFalse2(){
        assertFalse(Isogram.isIsogram2("moose"));
    }
}
