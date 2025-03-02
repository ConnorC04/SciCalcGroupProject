package com.zipcodewilmington.scientificcalculator;
import java.util.Scanner;

public class Calculator {
    public static Scanner CalcScan = new Scanner(System.in);



    //This is #7
    //This is Sine
        public static double sin(double angle){
            return Math.sin(angle);
        }
    //This is Cosine
    public static double cos(double angle) {
        return Math.cos(angle);
    }
    //This is Tangent
    public static double tan(double angle){
        return Math.tan(angle);
        }
    //This is inverse Sine
    public static double aSin(double angle){
        return Math.asin(angle);
    }
    //This is Inverse Cosine
    public static double aCos(double angle) {
        return Math.acos(angle);
    }
    //This is inverse Tangent
    public static double aTan(double angle){
        return Math.atan(angle);
    }
    //This is #9
    //log
    public static double log(double num){
        return Math.log(num);
    }
    //inverse log
    public static double log10(double num){
        return Math.log10(num);
    }
    //natural log
    public static double log1p(double num){
        return Math.log1p(num);
    }
    //inverse natural log
    public static double invLog1p(double num){
        return Math.exp(Math.log1p(num));
    }


}

