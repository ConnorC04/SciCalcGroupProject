package com.zipcodewilmington.scientificcalculator;
import java.util.Scanner;

import static com.zipcodewilmington.scientificcalculator.Scientific.scan;

public class Calculator {
    public static Scanner CalcScan = new Scanner(System.in);

        //This is #4
        //1. A state, representing the value currently displayed on the calculator (default 0)

        //2. Get the current number on the display *

        //3. Clear the display *

        //4. Change the number on the display *

        //5. Add, subtract, multiply, and divide the value on the display by a given number

        //6. Calculate the square (x2) and square root (√x) of the number on the display *

        //7. Calculate variable exponentiation (xy)

        //8. Calculate the inverse of the number on the display (1/x) *

        //9. Invert the sign of the number on the display (switch between positive and negative)

        //10. Update the display to Err if an error occurs (eg: Division by zero) *

        //11. Errors must be cleared before any other operation can take place *

        public static void defaultValue(){
            System.out.println("0");
        }

        public static void number1(){
            double number1 = scan.nextDouble();
        }

        public static void number2(){
        double number2 = scan.nextDouble();
    }
        public static double main(String[] args){
            Scanner scan = new Scanner(System.in);
            defaultValue();
            System.out.println("Hello! Please enter the first number: ");
            number1();
            System.out.println("Please enter the second number: ");
            number2();



        }


}

