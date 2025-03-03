package com.zipcodewilmington.scientificcalculator;
import java.util.Scanner;


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
    }


