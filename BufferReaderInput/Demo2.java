package BufferReaderInput;

import java.util.Scanner;

public class Demo2 {
    
    public static void main(String args[])
    {
        // int i = 2;
        // int j = 0;

        // this example is try with resources
        // int num = 0;
        // try (Scanner scanner = new Scanner(System.in)) {

        //     System.out.println("Enter first number: ");
        //     num = scanner.nextInt();

        //     System.out.println("First number is: " + num);

        // } 

        // this example if try with finally
        int num2 = 0;
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Enter second number: ");
            num2 = scanner.nextInt();
            System.out.println("Second number is: " + num2);
        } finally {
            scanner.close();
        }
    }
}
