package kyu8;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RemoveNExclamationMarksFromLeftTest {

    @Test
    public void remove3exclamations(){
        assertEquals("Hi!!",RemoveNExclamationMarksFromLeft.remove("!!Hi!!!", 3));
    }
}
