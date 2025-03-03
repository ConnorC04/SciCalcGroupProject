package com.zipcodewilmington.scientific_calculator.scientific_calculator;

import com.zipcodewilmington.scientificcalculator.Scientific;
import org.junit.jupiter.api.Test;
import static java.lang.Float.NaN;
import static org.junit.jupiter.api.Assertions.*;


public class TestScientific {
    @Test
    public void test1isRadianMode() {
        boolean actual = Scientific.isRadianMode("radians");
        assertTrue(actual);
    }

    @Test
    public void test2isRadianMode() {
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
    public void test1Input() {
        String actual = "radians";
        java.lang.String string1 = Scientific.modeInput(actual);
        assertEquals(actual, string1);
    }

    @Test
    public void test2Input() {
        String actual = "degrees";
        java.lang.String string2 = Scientific.modeInput("Degrees");
        assertEquals(actual, string2);
    }

    @Test
    public void test3Input() {
        String actual = "radians";
        java.lang.String string3 = Scientific.modeInput("pickles");
        assertEquals(actual, string3);
    }

    @Test
    public void testStoreMemory(){
        double actual = 10.0;
        double double1 = Scientific.storeCurrentValue(10.0);
        assertEquals(actual, double1);
    }
    @Test
    public void testClearMemory(){
        double actual = 0;
        double double1 = Scientific.clearStoredValue(10.0);
        assertEquals(actual, double1);
    }

    @Test
    public void testsin1() {
        Scientific calculatesine1 = new Scientific();
        double actual = calculatesine1.sin(55);
        assertEquals(-0.9997551733586199, actual);
    }

    @Test
    public void testsin2() {
        Scientific calculatesine2 = new Scientific();
        double actual = calculatesine2.sin(333);
        assertEquals(-0.008821166113885877, actual);
    }

    @Test
    public void testsin3() {
        Scientific calculatesine3 = new Scientific();
        double actual = calculatesine3.sin(-3027);
        assertEquals(0.9971528677168651, actual);
    }

    @Test
    public void testcosine1() {
        Scientific calculatecosine1 = new Scientific();
        double actual = calculatecosine1.cos(63);
        assertEquals(0.9858965815825497, actual);
    }

    @Test
    public void testcosine2() {
        Scientific calculatecosine2 = new Scientific();
        double actual = calculatecosine2.cos(765);
        assertEquals(0.022187030168153377, actual);
    }

    @Test
    public void testcosine3() {
        Scientific calculatecosine3 = new Scientific();
        double actual = calculatecosine3.cos(-20);
        assertEquals(0.40808206181339196, actual);
    }

    @Test
    public void testtangent1() {
        Scientific calculatetangent1 = new Scientific();
        double actual = calculatetangent1.tan(63);
        assertEquals(0.16974975208268753, actual);
    }

    @Test
    public void testtangent2() {
        Scientific calculatetangent2 = new Scientific();
        double actual = calculatetangent2.tan(765);
        assertEquals(-45.06028206439275, actual);
    }

    @Test
    public void testtangent3() {
        Scientific calculatetangent3 = new Scientific();
        double actual = calculatetangent3.tan(-20);
        assertEquals(-2.237160944224742, actual);
    }

    @Test
    public void testinverseSine1() {
        Scientific calculateinverseSine1 = new Scientific();
        double actual = calculateinverseSine1.aSin(0.1);
        assertEquals(0.1001674211615598, actual);
    }

    @Test
    public void testinverseSine2() {
        Scientific calculateinverseSine2 = new Scientific();
        double actual = calculateinverseSine2.aSin(-0.325);
        assertEquals(-0.3310117280892945, actual);
    }

    @Test
    public void testinverseSine3() {
        Scientific calculateinverseSine3 = new Scientific();
        double actual = calculateinverseSine3.aSin(0.4567);
        assertEquals(0.4742822055086542, actual);
    }

    @Test
    public void testinverseCosine1() {
        Scientific calculateinverseCosine1 = new Scientific();
        double actual = calculateinverseCosine1.aCos(0.1);
        assertEquals(1.4706289056333368, actual);
    }

    @Test
    public void testinverseCosine2() {
        Scientific calculateinverseCosine2 = new Scientific();
        double actual = calculateinverseCosine2.aCos(-0.325);
        assertEquals(1.9018080548841911, actual);
    }

    @Test
    public void testinverseCosine3() {
        Scientific calculateinverseCosine3 = new Scientific();
        double actual = calculateinverseCosine3.aCos(0.4567);
        assertEquals(1.0965141212862424, actual);
    }

    @Test
    public void testinverseCotangent1() {
        Scientific calculateinverseCotangent1 = new Scientific();
        double actual = calculateinverseCotangent1.aTan(0.1);
        assertEquals(0.09966865249116204, actual);
    }

    @Test
    public void testinverseCotangent2() {
        Scientific calculateinverseCotangent2 = new Scientific();
        double actual = calculateinverseCotangent2.aTan(-0.325);
        assertEquals(-0.3142318990843383, actual);
    }

    @Test
    public void testinverseCotangent3() {
        Scientific calculateinverseCotangent3 = new Scientific();
        double actual = calculateinverseCotangent3.aTan(0.4567);
        assertEquals(0.4284116595628546, actual);
    }

    //Test Logarithmic Functions
    @Test
    public void testLogarithm1() {
        Scientific calculateLogarithm1 = new Scientific();
        double actual = calculateLogarithm1.log(25);
        assertEquals(3.2188758248682006, actual);
    }

    @Test
    public void testLogarithm2() {
        Scientific calculateLogarithm2 = new Scientific();
        double actual = calculateLogarithm2.log(300);
        assertEquals(5.703782474656201, actual);
    }
//
    @Test
    public void testLogarithm3() {
        Scientific calculateLogarithm3 = new Scientific();
        double actual = calculateLogarithm3.log(-300);
        assertEquals(NaN, actual);
    }

    //Test Logarithm10
    @Test
    public void testLogarithm10a() {
        Scientific calculateLogarithm10a = new Scientific();
        double actual = calculateLogarithm10a.log10(25);
        assertEquals(1.3979400086720377, actual);
    }

    @Test
    public void testLogarithm10b() {
        Scientific calculateLogarithm10b = new Scientific();
        double actual = calculateLogarithm10b.log10(300);
        assertEquals(2.4771212547196626, actual);
    }

    @Test
    public void testLogarithm10c() {
        Scientific calculateLogarithm10c = new Scientific();
        double actual = calculateLogarithm10c.log10(-30);
        assertEquals(NaN, actual);
    }
    //Test Natural Logarithm
    @Test
    public void testNaturalLogarithm1() {
        Scientific calculateNaturalLogarithm1 = new Scientific();
        double actual = calculateNaturalLogarithm1.log1p(20);
        assertEquals(3.044522437723423, actual);
    }

    @Test
    public void testNaturalLogarithm2() {
        Scientific calculateNaturalLogarithm2 = new Scientific();
        double actual = calculateNaturalLogarithm2.log1p(.35);
        assertEquals(0.30010459245033805, actual);
    }

    @Test
    public void testNaturalLogarithm3() {
        Scientific calculateNaturalLogarithm3 = new Scientific();
        double actual = calculateNaturalLogarithm3.log1p(-35);
        assertEquals(NaN, actual);
    }

    //Test Inverse Natural Log
    @Test
    public void testInverseNaturalLogarithm1() {
        Scientific calculateInverseNaturalLogarithm1 = new Scientific();
        double actual = calculateInverseNaturalLogarithm1.log1p(20);
        assertEquals(3.044522437723423, actual);
    }

//    @Test
//    public void testInverseNaturalLogarithm2() {
//        Scientific calculateInverseNaturalLogarithm2 = new Scientific();
//        double actual = calculateInverseNaturalLogarithm2.log1p(.35);
//        assertEquals(0.30010459245033805, actual);
//    }
//
//    @Test
//    public void testInverseNaturalLogarithm3() {
//        Scientific calculateInverseNaturalLogarithm3 = new Scientific();
//        double actual = calculateNaturalLogarithm3.log1p(-35);
//        assertEquals(NaN, actual);
//    }

}


