package calculator;

import java.util.Scanner;
import calculator.tools.Division;

public class Calculator {

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first numbers: ");
        int firstNumber = sc.nextInt();

        System.out.println("Enter second numbers: ");
        int secondNumber = sc.nextInt();


        System.out.println("Enter the operator: ");
        char operator = sc.next().charAt(0);

        double result = 0.0;

        Division calculator = new Division();

        switch (operator) {
            case '+':
                result = calculator.add(firstNumber, secondNumber);
                break;

            case '-':
                result = calculator.subtract(firstNumber, secondNumber);
                break;

            case '*':
                result = calculator.multiply(firstNumber, secondNumber);
                break;

            case '/':
                result = calculator.divide(firstNumber, secondNumber);
                break;

            default:
                System.out.println("Invalid operator");
                break;
        }

        System.out.println("The result is: " + result);
    }
    
}
