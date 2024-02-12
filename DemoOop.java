import java.util.Scanner;

class Calculators
{
    public int add(int n1, int n2)
    {
        int r = n1 + n2;

        return r;
    }

    public int sub(int n1, int n2)
    {
        int r = n1 - n2;

        return r;
    }

    public int mul(int n1, int n2)
    {
        int r = n1 * n2;

        return r;
    }

    public int div(int n1, int n2)
    {
        int r = n1 / n2;

        return r;
    }
}


public class DemoOop {

    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first number: ");
        int num1 = scanner.nextInt();

        System.out.println("Enter second number: ");
        int num2 = scanner.nextInt();

        System.out.println("Enter operator: ");
        char operator = scanner.next().charAt(0);

        int result = 0;

        Calculators calculator = new Calculators();

        switch (operator) {
            case '+':
                result = calculator.add(num1, num2);
                break;

            case '-':
                result = calculator.sub(num1, num2);
                break;

            case '*':
                result = calculator.mul(num1, num2);
                break;

            case '/':
                result = calculator.div(num1, num2);
                break;
        
            default:
                System.out.println("Invalid operator");
                break;
        }

        System.out.println(result);

        scanner.close();
    }
    
}
