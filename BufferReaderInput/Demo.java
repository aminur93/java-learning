package BufferReaderInput;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Demo {

    public static void main(String args[]) throws NumberFormatException, IOException
    {
        System.out.println("Enter first Number");

        InputStreamReader in = new InputStreamReader(System.in);    // System.in is a standard input stream
        BufferedReader bf = new BufferedReader(in);    // creating object of BufferedReader

        int num = Integer.parseInt(bf.readLine());    // reading the number from the console
        System.out.println("Number is: " + num);

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter second number: ");
        int num2 = scanner.nextInt();

        System.out.println("Second number is: " + num2);

        bf.close();
        scanner.close();
    }
}