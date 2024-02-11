import java.util.Scanner;

public class Calculator {

    public static void main (String args[])
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first number: ");
        int firstNumber = scanner.nextInt();

        System.out.println("Enter the second number: ");
        int secondNumber = scanner.nextInt();

        System.out.println("Enter the operator: ");
        char operator = scanner.next().charAt(0);

        double result = 0.0;

        switch (operator) {
            case '+':
                result = firstNumber + secondNumber;
                break;

            case '-':
                result = firstNumber - secondNumber;
                break;

            case '*':
                result = firstNumber * secondNumber;
                break;

            case '/':
                result = firstNumber / secondNumber;
                break;

            default:
                System.out.println("Invalid operator");
                break;
        }

        System.out.println("Result: " + result);

        scanner.close();
    }
    
}
