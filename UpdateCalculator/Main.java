package UpdateCalculator;

import java.util.Scanner;

import UpdateCalculator.tools.Operation;

public class Main  {
    
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Operation operation = new Operation();

        System.out.println("Enter the first number: ");
        int firstNumber = scanner.nextInt();
        operation.setFirstNumber(firstNumber);

        System.out.println("Enter the second number: ");
        int secondNumber = scanner.nextInt();
        operation.setSecondNumber(secondNumber);

        System.out.println("Enter the operator: ");
        char operator = scanner.next().charAt(0);

        int result = 0;

        switch (operator) {
            case '+':
                result = operation.add(firstNumber, secondNumber);
                break;

            case '-':
                result = operation.subtract(firstNumber, secondNumber);
                break;

            case '*':
                result = operation.multiply(firstNumber, secondNumber);
                break;

            case '/':
                result = operation.divide(firstNumber, secondNumber);
                break;
            default:
                System.out.println("Invalid operator");
                break;
        }

        System.out.println("Result: " + result);

        scanner.close();
    }
}
