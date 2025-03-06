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

        // This boolean will be used for changing from radians to degrees mode
        boolean goToMode = true;

        // This string will also be used for changing modes
        String modeToGo = "";

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
                        "the following list: ");
                System.out.println("1: Addition, " +
                        "2: Subtraction, " +
                        "3: Multiplication, " +
                        "4: Division, " +
                        "5: Square, " +
                        "6: Square Root, " +
                        "7: Exponential, " +
                        "8: Inverse. ");
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
                    case "5":
                        System.out.println("Please enter the the number you want to square: ");
                        firstNum = Double.parseDouble(scan.nextLine());
                        System.out.println("The result of " + firstNum + " squared is " + calc.square(firstNum));
                        break;
                    case "6":
                        System.out.println("Please enter the the number you want the square root of: ");
                        firstNum = Double.parseDouble(scan.nextLine());
                        System.out.println("The result of the square root of " + firstNum + " is " + calc.squareRoot(firstNum));
                        break;
                    case "7":
                        System.out.println("Please enter the first number as your base: ");
                        firstNum = Double.parseDouble(scan.nextLine());
                        System.out.println("Please enter the second number as your exponent: ");
                        secondNum = Double.parseDouble(scan.nextLine());
                        answer = calc.squareExponent(firstNum, secondNum);
                        System.out.println("The result of " + firstNum + " to the power of " + secondNum + " is " + calc.squareExponent(firstNum, secondNum));
                        break;
                    case "8":
                        System.out.println("Please enter the the number you want the inverse of: ");
                        firstNum = Double.parseDouble(scan.nextLine());
                        System.out.println("The result of the inverse of " + firstNum + " is " + calc.inverseOfInput(firstNum));
                        break;
                    default:
                        System.out.println("Oops! I don't recognize that command. Please try again.");
                        runCalc = false;
                }
                System.out.println("Would you like to store this answer to memory? It can be used for later calculations. " +
                        "Please enter \"y\" to store the answer to memory, or \"n\" if you do not wish to store this answer.");
                userInput = scan.next(); // This is only executed inside this branch, userInput is safe... for now.
                if (userInput.equalsIgnoreCase("y")){
                    science.storeCurrentValue(answer);
                }else{
                    if(userInput.equalsIgnoreCase("n")){
                        System.out.println("Are you done using the calculator? " +
                                "Enter \"y\" if you are done. " +
                                "Enter any other key to continue. " +
                                "Press enter twice to confirm selection. ");
                        userInput = scan.next(); // userInput should still be safe... for now.
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
                            "the following list: ");
                    System.out.println("1: Trig Functions, " +
                            "2: log(x), " +
                            "3: inverse log(x), " +
                            "4: ln(x), " +
                            "5: inverse ln(x), " +
                            "6: (x)!, " +
                            "7: Display stored value (If no value has been stored, default is 0), " +
                            "8: Clear stored value (Defaults to 0): ");
                    userInput = scan.nextLine(); // we meet again, old friend.
                    switch (userInput){
                        case "1": // Enters the trig function menu
                            System.out.println("Which trig function would you like to use? \n" +
                                    "To select a trig function, please enter a number from the following list: \n");
                            System.out.println("1: sin(x), " +
                                    "2: cos(x), " +
                                    "3: tan(x), " +
                                    "4: arcsin(x), " +
                                    "5: arccos(x), " +
                                    "6: arctan(x): ");
                            userInput = scan.nextLine();
                            switch (userInput){
                                case "1": // sin(x)
                                    System.out.println("Please enter the mode for the solution\n" +
                                            "For radians, enter \"radians\"\n" +
                                            "For degrees, enter \"degrees\": ");
                                    modeToGo = science.modeInput(scan.nextLine());
                                    goToMode = science.isRadianMode(modeToGo);
                                    System.out.println("Please enter an angle (hint: keep this in the same type as " +
                                            "the mode you just selected): ");
                                    firstNum = Double.parseDouble(scan.nextLine());
                                    answer = science.switchUnitsMode(goToMode, science.sin(firstNum));
                                    System.out.println("The sin of angle " + firstNum + " in " + modeToGo + " = " + answer);
                                    break;
                                case "2": // cos(x)
                                    System.out.println("Please enter the mode for the solution\n" +
                                            "For radians, enter \"radians\"\n" +
                                            "For degrees, enter \"degrees\": ");
                                    modeToGo = science.modeInput(scan.nextLine());
                                    goToMode = science.isRadianMode(modeToGo);
                                    System.out.println("Please enter an angle (hint: keep this in the same type as " +
                                            "the mode you just selected): ");
                                    firstNum = Double.parseDouble(scan.nextLine());
                                    answer = science.switchUnitsMode(goToMode, science.cos(firstNum));
                                    System.out.println("The sin of angle " + firstNum + " in " + modeToGo + " = " + answer);
                                    break;
                                case "3": // tan(x)
                                    System.out.println("Please enter the mode for the solution\n" +
                                            "For radians, enter \"radians\"\n" +
                                            "For degrees, enter \"degrees\": ");
                                    modeToGo = science.modeInput(scan.nextLine());
                                    goToMode = science.isRadianMode(modeToGo);
                                    System.out.println("Please enter an angle (hint: keep this in the same type as " +
                                            "the mode you just selected): ");
                                    firstNum = Double.parseDouble(scan.nextLine());
                                    answer = science.switchUnitsMode(goToMode, science.tan(firstNum));
                                    System.out.println("The sin of angle " + firstNum + " in " + modeToGo + " = " + answer);
                                    break;
                                case "4": // arcSin(x)
                                    System.out.println("Please enter the mode for the solution\n" +
                                            "For radians, enter \"radians\"\n" +
                                            "For degrees, enter \"degrees\": ");
                                    modeToGo = science.modeInput(scan.nextLine());
                                    goToMode = science.isRadianMode(modeToGo);
                                    System.out.println("Please enter an angle (hint: keep this in the same type as " +
                                            "the mode you just selected): ");
                                    firstNum = Double.parseDouble(scan.nextLine());
                                    answer = science.switchUnitsMode(goToMode, science.aSin(firstNum));
                                    System.out.println("The sin of angle " + firstNum + " in " + modeToGo + " = " + answer);
                                    break;
                                case "5": // arcCos(x)
                                    System.out.println("Please enter the mode for the solution\n" +
                                            "For radians, enter \"radians\"\n" +
                                            "For degrees, enter \"degrees\": ");
                                    modeToGo = science.modeInput(scan.nextLine());
                                    goToMode = science.isRadianMode(modeToGo);
                                    System.out.println("Please enter an angle (hint: keep this in the same type as " +
                                            "the mode you just selected): ");
                                    firstNum = Double.parseDouble(scan.nextLine());
                                    answer = science.switchUnitsMode(goToMode, science.aCos(firstNum));
                                    System.out.println("The sin of angle " + firstNum + " in " + modeToGo + " = " + answer);
                                    break;
                                case "6": // arcTan(x)
                                    System.out.println("Please enter the mode for the solution\n" +
                                            "For radians, enter \"radians\"\n" +
                                            "For degrees, enter \"degrees\": ");
                                    modeToGo = science.modeInput(scan.nextLine());
                                    goToMode = science.isRadianMode(modeToGo);
                                    System.out.println("Please enter an angle (hint: keep this in the same type as " +
                                            "the mode you just selected): ");
                                    firstNum = Double.parseDouble(scan.nextLine());
                                    answer = science.switchUnitsMode(goToMode, science.aTan(firstNum));
                                    System.out.println("The sin of angle " + firstNum + " in " + modeToGo + " = " + answer);
                                    break;
                                default: // Dummy user inputs wrong thing
                                    System.out.println("Invalid selection. Smell ya later nerd");
                                    runCalc = false;
                            }
                        case "2": // log(x)
                            System.out.println("Enter the number: ");
                            firstNum = Double.parseDouble(scan.nextLine());
                            answer = science.log(firstNum);
                            System.out.println("log" + firstNum + " = " + answer + ".");
                            break;
                        case "3": // Inverse log(x)
                            System.out.println("Enter the number: ");
                            firstNum = Double.parseDouble(scan.nextLine());
                            answer = science.log10(firstNum);
                            System.out.println("Inverse log" + firstNum + " = " + answer + ".");
                            break;
                        case "4": // ln(x)
                            System.out.println("Enter the number: ");
                            firstNum = Double.parseDouble(scan.nextLine());
                            answer = science.log1p(firstNum);
                            System.out.println("ln" + firstNum + " = " + answer + ".");
                            break;
                        case "5": // Inverse ln(x)
                            System.out.println("Enter the number: ");
                            firstNum = Double.parseDouble(scan.nextLine());
                            answer = science.invLog1p(firstNum);
                            System.out.println("Inverse ln" + firstNum + " = " + answer + ".");
                            break;
                        case "6": // (x)!
                            System.out.println("Enter the number: ");
                            firstNum = Double.parseDouble(scan.nextLine());
                            answer = science.factorial(firstNum);
                            System.out.println(firstNum + "! = " + answer + ".");
                            break;
                        case "7":
                            science.displayStoredValue(answer);
                            break;
                        case "8":
                            science.clearStoredValue(answer);
                            break;
                        default:
                            System.out.println("Stop trying to break this it's getting annoying.");
                            runCalc = false;
                    }
                    System.out.println("Would you like to store this answer to memory? It can be used for later calculations. " +
                            "Please enter \"y\" to store the answer to memory, or \"n\" if you do not wish to store this answer.");
                    userInput = scan.next(); // This is only executed inside this branch, userInput is safe... for now.
                    if (userInput.equalsIgnoreCase("y")){
                        science.storeCurrentValue(answer);
                    }else{
                        if(userInput.equalsIgnoreCase("n")){
                            System.out.println("Are you done using the calculator? " +
                                    "Enter \"y\" if you are done. " +
                                    "Enter any other key to continue. " +
                                    "Press enter twice to confirm selection. ");
                            userInput = scan.next(); // userInput should still be safe... for now.
                            if (userInput.equalsIgnoreCase("y")){
                                runCalc = false;
                            }
                        }else{
                            System.out.println("Oops! Looks like you can't read. I'm getting sick of error handling."); // breaking the fourth wall
                            runCalc = false;
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
