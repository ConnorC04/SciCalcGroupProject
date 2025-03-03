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

        // This double will be used to store the answer to memory if the user wishes
        double answer = 0.0;

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
                    "\"S\" for Scientific: ");
            // This String object is used to determine whether the user wants to use Basic or Scientific functions
            String userInput = scan.nextLine();

            if (userInput.equalsIgnoreCase("B")){
                System.out.println("Please select which function you would like to use. \n" +
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
                        answer = calc.addTwoNum(firstNum, secondNum);
                        System.out.println("The result of " + firstNum + " + " + secondNum + " is " + calc.addTwoNum(firstNum, secondNum));
                        break;
                    case "2":
                        System.out.println("Please enter the first number you would like to subtract: ");
                        firstNum = Double.parseDouble(scan.nextLine());
                        System.out.println("Please enter the second number you would like to subtract: ");
                        secondNum = Double.parseDouble(scan.nextLine());
                        answer = calc.subtractTwoNum(firstNum, secondNum);
                        System.out.println("The result of " + firstNum + " - " + secondNum + " is " + calc.subtractTwoNum(firstNum, secondNum));
                        break;
                    case "3":
                        System.out.println("Please enter the first number you would like to multiply: ");
                        firstNum = Double.parseDouble(scan.nextLine());
                        System.out.println("Please enter the second number you would like to multiply: ");
                        secondNum = Double.parseDouble(scan.nextLine());
                        answer = calc.multiplyTwoNum(firstNum, secondNum);
                        System.out.println("The result of " + firstNum + " * " + secondNum + " is " + calc.multiplyTwoNum(firstNum, secondNum));
                        break;
                    case "4":
                        System.out.println("Please enter the dividend (the number you want to divide): ");
                        firstNum = Double.parseDouble(scan.nextLine());
                        System.out.println("Please enter the divisor (the number you want to divide by): ");
                        secondNum = Double.parseDouble(scan.nextLine());
                        if(calc.divisionError(secondNum)) {
                            System.out.println("Oops! Cannot divide by zero. Please try again.");
                            runCalc = false;
                        }
                        answer = calc.divideTwoNum(firstNum, secondNum);
                        System.out.println("The result of " + firstNum + " / " + secondNum + " is " + calc.divideTwoNum(firstNum, secondNum));
                        break;
                    default:
                        System.out.println("Oops! I don't recognize that command. Please try again.");
                        runCalc = false;
                }
                System.out.println("Would you like to store this answer to memory? It can be used for later calculations. " +
                        "Please enter \"y\" to store the answer to memory, or \"n\" if you do not wish to store this answer.");
                userInput = scan.nextLine(); // This is only executed inside this branch, userInput is safe... for now.
                if (userInput.equalsIgnoreCase("y")){
                    science.storeCurrentValue(answer);
                }else{
                    if(userInput.equalsIgnoreCase("n")){
                        System.out.println("Are you done using the calculator? " +
                                "Enter \"y\" if you are done. " +
                                "Enter any other key to continue. " +
                                "Press enter twice to confirm selection. ");
                        userInput = scan.nextLine(); // userInput should still be safe... for now.
                        if (userInput.equalsIgnoreCase("y")){
                            runCalc = false;
                        }
                    }else{
                        System.out.println("Oops! Looks like you can't read. I'm getting sick of error handling."); // breaking the fourth wall
                        runCalc = false;
                    }
                }
            }else{ // Opens scientific functions
                if (userInput.equalsIgnoreCase("S")){
                    System.out.println("Please select which Scientific function you would like to use. \n" +
                            "To select a function, please input the number next to the function in " +
                            "the following list: \n");
                    System.out.println("1: Trig Functions\n" +
                            "2: log(x)\n" +
                            "3: inverse log(x)\n" +
                            "4: ln(x)\n" +
                            "5: inverse ln(x)\n" +
                            "6: (x)!\n" +
                            "7: Display stored value (If no value has been stored, default is 0)\n" +
                            "8: Clear stored value (Defaults to 0)\n");
                    userInput = scan.nextLine(); // we meet again, old friend.
                    switch (userInput){
                        case "1":
                            System.out.println("Which trig function would you like to use? \n" +
                                    "To select a trig function, please enter a number from the following list: \n");
                            System.out.println("1: sin(x)\n" +
                                    "2: cos(x)\n" +
                                    "3: tan(x)\n" +
                                    "4: arcsin(x)\n" +
                                    "5: arccos(x)\n" +
                                    "6: arctan(x)\n");
                            userInput = scan.nextLine();
                            switch (userInput){
                                case "1":
                                    System.out.println("Please enter the mode for the solution\n" +
                                            "For radians, enter \"radians\"\n" +
                                            "For degrees, enter \"degrees\": ");
                                    String modeToGo = science.modeInput(scan.nextLine());
                                    boolean goToMode = science.isRadianMode(modeToGo);
                                    System.out.println("Please enter an angle (hint: keep this in the same type as " +
                                            "the mode you just selected): ");
                                    firstNum = Double.parseDouble(scan.nextLine());
                                    answer = science.switchUnitsMode(goToMode, science.sin(firstNum));
                                    System.out.println("The sin of angle " + firstNum + " in " + modeToGo + " = " + answer);
                            }
                    }

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
