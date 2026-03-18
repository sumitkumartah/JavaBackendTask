package AdvCalculator;

import java.util.Scanner;

public class calculatorMain {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("---Calculator started---");
        boolean running =true;
        while(running){
            System.out.print("Enter first number: ");
            double num1 = sc.nextDouble();
            System.out.print("Enter second number: ");
            double num2 = sc.nextDouble();


            System.out.print("\nEnter operator (+, -, *, /, or # to exit): ");
            String input=sc.next();

            if(input.equals("#")){
                System.out.println("Exiting calculator. Goodbye!");
                running = false;
                break;
            }

            switch (input) {
                case "+":
                    // Using an anonymous object to call the method once
                    System.out.println("Result: " + new Addition().compute(num1, num2));
                    break;
                case "-":
                    System.out.println("Result: " + new Subtraction().compute(num1, num2));
                    break;
                case "*":
                    System.out.println("Result: " + new Multiplication().compute(num1, num2));
                    break;
                case "/":
                    System.out.println("Result: " + new Division().compute(num1, num2));
                    break;
                default:
                    System.out.println("Invalid operator. Please try again.");
            }

        }

        sc.close();
    }
}
