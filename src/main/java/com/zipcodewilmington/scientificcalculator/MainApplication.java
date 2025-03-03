package com.zipcodewilmington.scientificcalculator;

/**
 * Created by leon on 2/9/18.
 */
import java.util.Scanner;
public class MainApplication {
    public static void main(String[] args) {

        // This boolean will be used to loop the calculator's use until the user has finished.
        boolean runCalc = true;
        // This scanner will be used to take in every user's input
        Scanner scan = new Scanner(System.in);
        // This message is only printed once
        System.out.println("Welcome to the Calculator! You can quit at anytime by typing \"quit\"");

        // While loop begins because boolean runCalc is initially declared true
        // Loop is terminated when the user confirms they are done using the calculator
        // By inputting "quit" into the console
        while (runCalc){
            System.out.println("Would you like to use Basic calculator " +
                    "functions or Scientific calculator functions? Please enter \"B\" for Basic or " +
                    "\"S\" for Scientific");
            //Quits running the calculator
            if (scan.nextLine().equalsIgnoreCase("quit")){
                runCalc = false;
            }

        }

    }
}
