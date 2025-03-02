package com.zipcodewilmington.scientific_calculator;

import com.zipcodewilmington.scientificcalculator.Scientific;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class TestScientific {
    @Test
    public void test1isRadianMode(){
        boolean actual = Scientific.isRadianMode("radians");
        assertTrue(actual);
    }
    @Test
    public void test2isRadianMode(){
        boolean actual = Scientific.isRadianMode("degrees");
        assertFalse(actual);
    }
//Commented out, changed the exception handling block to the input function
//    @Test
//    public void test3isRadianMode(){
//        boolean actual = Scientific.isRadianMode("anything else");
//        assertTrue(actual);
//    }

    @Test
    public void test1Input(){
        String actual = "radians";
        java.lang.String string1 = Scientific.modeInput(actual);
        assertEquals(actual, string1);
    }

    @Test
    public void test2Input(){
        String actual = "degrees";
        java.lang.String string2 = Scientific.modeInput("Degrees");
        assertEquals(actual, string2);
    }

    @Test
    public void test3Input(){
        String actual = "radians";
        java.lang.String string3 = Scientific.modeInput("pickles");
        assertEquals(actual, string3);
    }
}
