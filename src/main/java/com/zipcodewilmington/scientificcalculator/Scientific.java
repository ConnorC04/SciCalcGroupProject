package com.zipcodewilmington.scientificcalculator;
import java.util.Scanner;
import java.lang.Math;

public class Scientific {
    // Declare a public Scanner object "scan" for reading user input
    public static Scanner scan = new Scanner(System.in);


    /* Method prompts the user to input a string and returns exactly what the user typed
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
}
