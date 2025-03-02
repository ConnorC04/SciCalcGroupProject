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

    @Test
    public void test3isRadianMode(){
        boolean actual = Scientific.isRadianMode("anything else");
        assertTrue(actual);
    }
}
