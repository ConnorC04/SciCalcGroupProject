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
        @Test
        public void testMultiplyTwoNum1() {
            Calculator calculateMultiplication1 = new Calculator();
            double actual = calculateMultiplication1.multiplyTwoNum(8, 10);
            assertEquals(80, actual, 0.0001);
        }
        @Test
        public void testMultiplyTwoNum2() {
            Calculator calculateMultiplication2 = new Calculator();
            double actual = calculateMultiplication2.multiplyTwoNum(85, 95.3);
            assertEquals(8100.5, actual, 0.0001);
        }

        @Test
        public void testMultiplyTwoNum3() {
            Calculator calculateMultiplication3 = new Calculator();
            double actual = calculateMultiplication3.multiplyTwoNum(90.543, 1092.7632);
            assertEquals(98942.0584176, actual, 0.0001);
        }

        @Test
        public void testDivideTwoNum1() {
            Calculator calculateDivision1 = new Calculator();
            double actual = calculateDivision1.divideTwoNum(20, 4);
            assertEquals(5, actual, 0.0001);
        }

        @Test
        public void testDivideTwoNum2() {
            Calculator calculateDivision2 = new Calculator();
            double actual = calculateDivision2.divideTwoNum(800, 10);
            assertEquals(80, actual, 0.0001);
        }

        @Test
        public void testDivideTwoNum3() {
            Calculator calculateDivision3 = new Calculator();
            double actual = calculateDivision3.divideTwoNum(18, 2.7);
            assertEquals(6.66666666667, actual, 0.0001);
        }

        @Test
        public void testDivisionError1() {
            Calculator calculateDivisionError1 = new Calculator();
            boolean actual = calculateDivisionError1.divisionError(0);
            assertEquals(true, actual);
        }

    @Test
        public void testDivisionError2() {
            Calculator calculateDivisionError2 = new Calculator();
            boolean actual = calculateDivisionError2.divisionError(2);
            assertEquals(false, actual);
        }

    @Test
        public void testSquare1() {
            Calculator calculateSquare1 = new Calculator();
            double actual = calculateSquare1.square(10);
            assertEquals(100, actual, 0.000001);
    }

    @Test
        public void testSquare2() {
            Calculator calculateSquare2 = new Calculator();
            double actual = calculateSquare2.square(25);
            assertEquals(625, actual, 0.000001);
        }

    @Test
    public void testSquare3() {
        Calculator calculateSquare3 = new Calculator();
        double actual = calculateSquare3.square(-9);
        assertEquals(81, actual, 0.000001);
    }

    @Test
    public void testSquareRoot1() {
        Calculator calculateSquareRoot1 = new Calculator();
        double actual = calculateSquareRoot1.squareRoot(16);
        assertEquals(4, actual, 0.000001);
    }

    @Test
    public void testSquareRoot2() {
        Calculator calculateSquareRoot2 = new Calculator();
        double actual = calculateSquareRoot2.squareRoot(81);
        assertEquals(9, actual, 0.000001);
    }

    @Test
    public void testSquareRoot3() {
        Calculator calculateSquareRoot3 = new Calculator();
        double actual = calculateSquareRoot3.squareRoot(125);
        assertEquals(11.1803398875, actual, 0.000001);
    }

    @Test
    public void testSquareExpoentiation1() {
        Calculator calculatequareExpoentiation1 = new Calculator();
        double actual = calculatequareExpoentiation1.squareExponent(4, 3);
        assertEquals(64, actual, 0.000001);
    }

    @Test
    public void testSquareExpoentiation2() {
        Calculator calculatequareExpoentiation2 = new Calculator();
        double actual = calculatequareExpoentiation2.squareExponent(7, 2);
        assertEquals(49, actual, 0.0001);
    }

    @Test
    public void testSquareExpoentiation3() {
        Calculator calculatequareExpoentiation3 = new Calculator();
        double actual = calculatequareExpoentiation3.squareExponent(-7, 4);
        assertEquals(2401, actual, 0.0001);
    }

    @Test
    public void testSquareExpoentiation4() {
        Calculator calculatequareExpoentiation4 = new Calculator();
        double actual = calculatequareExpoentiation4.squareExponent(7, -4);
        assertEquals(4.1649312786339027E-4, actual, 0.0001);
    }

    @Test
    public void testInverseFunction1() {
        Calculator calculateInverseFunction1 = new Calculator();
        double actual = calculateInverseFunction1.inverseOfInput(3);
        assertEquals(0.3333333333333333, actual, 0.000001);
    }

    @Test
    public void testInverseFunction2() {
        Calculator calculateInverseFunction2 = new Calculator();
        double actual = calculateInverseFunction2.inverseOfInput(-3);
        assertEquals(-0.3333333333333333, actual, 0.000001);
    }

//    @Test
//    public void testInverseFunction3() {
//        Calculator calculateInverseFunction3 = new Calculator();
//        double actual = calculateInverseFunction3.inverseOfInput(0);
//        assertEquals(Infinity, actual, 0.000001);
//    }

    @Test
    public void testInverseFunction4() {
        Calculator calculateInverseFunction4 = new Calculator();
        double actual = calculateInverseFunction4.inverseOfInput(5);
        assertEquals(0.20, actual, 0.000001);
    }
}




