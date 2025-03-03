package com.zipcodewilmington.scientificcalculator;

/**
 * Created by leon on 2/9/18.
 */
import java.util.Scanner;
public class MainApplication {
    public static void main(String[] args) {

        // This boolean will be used to loop the calculator's use until the user has finished.
        boolean runCalc = true;

        // This Calculator object will be used if the user selects the Basic Calculator functions
        Calculator calc = new Calculator();

        // This Scientific object will be used if the user selects the Scientific functions
        Scientific science = new Scientific();

        // This double will be used to take in the user's first number in mathematics functions
        double firstNum = 0;

        // This double will be used to take in the user's second number in mathematics functions if necessary
        double secondNum = 0;

        // This scanner will be used to take in the user's input
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
            // This String object is used to determine whether the user wants to use Basic or Scientific functions
            String userInput = scan.nextLine();

            if (userInput.equalsIgnoreCase("B")){
                System.out.println("Please select which function you would like to use. " +
                        "To select a function, please input the number next to the function in " +
                        "the following list: \n");
                System.out.println("1: Addition\n" +
                        "2: Subtraction\n" +
                        "3: Multiplication\n" +
                        "4: Division\n");
                switch (userInput){
                    case "1":
                        System.out.println("Please enter the first number you would like to add: ");
                        firstNum = Double.parseDouble(scan.nextLine());
                        System.out.println("Please enter the second number you would like to add :");
                        secondNum = Double.parseDouble(scan.nextLine());
                        System.out.println("The result of " + firstNum + " + " + secondNum + " is " + calc.addTwoNum(firstNum, secondNum));
                }
            }else{ // Opens scientific functions
                if (userInput.equalsIgnoreCase("S")){

                }else{
                    if (userInput.equalsIgnoreCase("quit")){
                        runCalc = false;
                    }else{
                        System.out.println("Oops! I don't recognize that command. Please try again.");
                    }
                }

            }
            //Quits running the calculator
            if (scan.nextLine().equalsIgnoreCase("quit")){
                runCalc = false;
            }

        }

    }
}
