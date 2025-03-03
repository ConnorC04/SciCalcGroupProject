package com.zipcodewilmington.scientific_calculator.scientific_calculator;

import com.zipcodewilmington.scientificcalculator.Scientific;
import org.junit.jupiter.api.Test;
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


}


