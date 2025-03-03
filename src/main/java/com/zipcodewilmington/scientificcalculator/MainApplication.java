package com.zipcodewilmington.scientificcalculator;

 /*
 * Created by leon on 2/9/18.
 */
import java.util.Scanner;
import java.util.function.DoublePredicate;

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
                userInput = scan.nextLine();
                switch (userInput){
                    case "1":
                        System.out.println("Please enter the first number you would like to add: ");
                        firstNum = Double.parseDouble(scan.nextLine());
                        System.out.println("Please enter the second number you would like to add :");
                        secondNum = Double.parseDouble(scan.nextLine());
                        System.out.println("The result of " + firstNum + " + " + secondNum + " is " + calc.addTwoNum(firstNum, secondNum));
                        break;
                    case "2":
                        System.out.println("Please enter the first number you would like to subtract: ");
                        firstNum = Double.parseDouble(scan.nextLine());
                        System.out.println("Please enter the second number you would like to subtract: ");
                        secondNum = Double.parseDouble(scan.nextLine());
                        System.out.println("The result of " + firstNum + " - " + secondNum + " is " + calc.subtractTwoNum(firstNum, secondNum));
                        break;
                    case "3":
                        System.out.println("Please enter the first number you would like to multiply: ");
                        firstNum = Double.parseDouble(scan.nextLine());
                        System.out.println("Please enter the second number you would like to multiply: ");
                        secondNum = Double.parseDouble(scan.nextLine());
                        System.out.println("The result of " + firstNum + " * " + secondNum + " is " + calc.multiplyTwoNum(firstNum, secondNum));
                        break;
                    case "4":
                        System.out.println("Please enter the dividend (the number you want to divide): ");
                        firstNum = Double.parseDouble(scan.nextLine());
                        System.out.println("Please enter the divisor (the number you want to divide by): ");
                        secondNum = Double.parseDouble(scan.nextLine());
//                        if(divisionError(secondNum)) {
//                            System.out.println("Oops! Cannot divide by zero. Please try again.");
//                            runCalc = false;
//                        }
                        System.out.println("The result of " + firstNum + " / " + secondNum + " is " + calc.divideTwoNum(firstNum, secondNum));
                        break;
                    default:
                        System.out.println("Oops! I don't recognize that command. Please try again.");
                        runCalc = false;
                }
            }else{ // Opens scientific functions
                if (userInput.equalsIgnoreCase("S")){
                    System.out.println("Please select which Scientific function you would like to use. " +
                            "To select a function, please input the number next to the function in " +
                            "the following list: \n");
                }else{
                    if (userInput.equalsIgnoreCase("quit")){
                        runCalc = false;
                    }else{
                        System.out.println("Oops! I don't recognize that command. Please try again.");
                        runCalc = false;
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
