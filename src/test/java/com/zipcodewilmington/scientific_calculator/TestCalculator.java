package com.zipcodewilmington.scientific_calculator;

import com.zipcodewilmington.scientificcalculator.Calculator;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestCalculator {
    @Test
    public void test1Sin(){
        double actual = Calculator.sin(Math.PI);
        assertEquals(0, actual, 0.001);
    }
}
