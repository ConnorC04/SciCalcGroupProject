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

        public static String divideTwoNum(double x, double y){
            if (y == 0){
                return ("Error: Cannot Divide by 0");
            }
            else {
                double answer = x / y;
                return ("" + answer);
            }
        }
    }


