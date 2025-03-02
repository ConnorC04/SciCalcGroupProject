package com.zipcodewilmington.scientificcalculator;
import java.util.Scanner;
import java.lang.Math;

public class Scientific {
    // Declare a public Scanner object "scan" for reading user input
    public static Scanner scan = new Scanner(System.in);

    /* Method is passed the user's input as a string and returns a new string with either a value of "radians" or
     "degrees". If the user enters a string NOT accepted by the computer they are informed that the default mode is
     radians
    * */
    public static String modeInput(String userInput) {
        switch (userInput) {
                case "radians":
                case "degrees":
                    return userInput;
                default:
                    System.out.println("Invalid selection made, calculator is defaulting to radians mode.");
                    return "radians";
            }
    }

    public static boolean isRadianMode(String userInput){
        return userInput.equalsIgnoreCase("radians");
    }

    /* Method is a double that is passed a boolean "b" and a double "angle"
    * If the boolean value is true, method returns the value of the angle in radians
    * If the boolean value is false, method returns the value of the angle in degrees */

    public static double switchUnitsMode(boolean b, double angle){
        if (b){
            Math.toRadians(angle);
        }else{
            Math.toDegrees(angle);
        }
        return angle;
    }

    // Methods needed for Memory storage, clearing, and displaying.
    public static double clearStoredValue(double d){
        d = 0;
        return d;
    }
    public static void displayStoredValue(double d){
        System.out.println(storeCurrentValue(d));
    }
    public static double storeCurrentValue(double d){
        return d;
    }

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

    //Factorial
    public static int fact(double num){
        if (num < 0){
            System.out.println("Error: Number must be positive");
        }
        int r = 1;
        for(int i = 1; i <= num; i++){
            r *= i;
        }
        return r;
    }

}
