package com.zipcodewilmington.scientificcalculator;
import java.util.Scanner;
public class Scientific {
    // Declare a public Scanner object "scan" for reading user input
    public static Scanner scan = new Scanner(System.in);

    /* Method returns a boolean which will be used in the method switchUnitsMode()
    * Method prompts user to enter a string and checks the string input by the user
    * using .equalsIgnoreCase, and uses if/else logic to determine which mode the user wants
    * the calculator to be in. *If* the user wants to work in radians, method returns true,
    * but *if* the user wants to work in degrees, the method returns false.
    * Finally, *if* the user does not enter a proper mode, method will inform the user of the error and default to
    * radians mode. */
    public static boolean isRadianMode(){
        String userInput = scan.nextLine();
        if (userInput.equalsIgnoreCase("radians")){
            return true;
        }else {
            if (userInput.equalsIgnoreCase("degrees")) {
                return false;
            } else {
                System.out.println("User input not recognized as a valid mode, " +
                        "calculator will operate in Radians.");
                return true;
            }
        }
    }

    /* Method is void and only outputs to the user which mode is currently selected
    * Method is passed a boolean "b" which will be the boolean returned from the method
    * isRadianMode() in order to work through if/else logic to determine which mode the
    * user has selected */
    public static void switchUnitsMode(boolean b){
        if (b){
            System.out.println("Radians mode!");
        }else{
            System.out.println("Degrees mode!");
        }
    }
}
