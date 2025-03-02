package com.zipcodewilmington.scientific_calculator.scientific_calculator;

import com.zipcodewilmington.scientificcalculator.Calculator;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestCalculator {

        @Test
        public void testAddTwoNum1() {
            Calculator calculateAddition1 = new Calculator();
            double actual = calculateAddition1.addTwoNum(3, 5);
            assertEquals(8, actual, 0.0001);
        }
        @Test
        public void testAddTwoNum2() {
            Calculator calculateAddition2 = new Calculator();
            double actual = calculateAddition2.addTwoNum(65, 130);
            assertEquals(195, actual, 0.0001);
        }

        @Test
        public void testAddTwoNum3() {
        Calculator calculateAddition3 = new Calculator();
        double actual = calculateAddition3.addTwoNum(14.3565, 359.432819);
        assertEquals(373.789319, actual, 0.0001);
        }

        @Test
        public void testSubtractTwoNum1() {
        Calculator calculateSubtraction1 = new Calculator();
        double actual = calculateSubtraction1.subtractTwoNum(9, 5);
        assertEquals(4, actual, 0.0001);
        }

        @Test
        public void testSubtractTwoNum2() {
        Calculator calculateSubtraction2 = new Calculator();
        double actual = calculateSubtraction2.subtractTwoNum(45.305, 16.89543);
        assertEquals(28.40957, actual, 0.0001);
        }

        @Test
        public void testSubtractTwoNum3() {
        Calculator calculateSubtraction3 = new Calculator();
        double actual = calculateSubtraction3.subtractTwoNum(794.47839210, 432.47832910);
        assertEquals(362.000063, actual, 0.0001);
    }
    }



