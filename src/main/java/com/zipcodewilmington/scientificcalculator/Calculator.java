package com.zipcodewilmington.scientificcalculator;
import java.util.Scanner;
import static java.lang.Math.sqrt;


public class Calculator {
        public static Scanner CalcScan = new Scanner(System.in);

        public double addTwoNum(double x, double y) {
            return x + y;
        }

        public double subtractTwoNum(double x, double y) {
            return x - y;
        }

        public double multiplyTwoNum(double x, double y) {
            return (x * y);
        }

        public static double divideTwoNum(double x, double y){
            return x / y;
        }

        public static boolean divisionError(double y){
             if (y == 0) {
                 return true;
             }
             else {
                 return false;
             }
        }

        public static double square(double x){
            return Math.pow(x, 2);
        }

        public static double squareRoot(double x){
            return sqrt(x);
        }

        public static double squareExponent(double x, double y){
            return Math.pow(x, y);
        }

        public static double inverseOfInput(double x){
            return (1/x);
        }
    }


