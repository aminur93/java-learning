import java.util.Scanner;

public class SwitchStatement {

    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number: ");

        int number = scanner.nextInt();

        String size;

        // switch statement to check size
        switch (number) {

            case 29:
                size = "small";
                break;

            case 42:
                size = "medium";
                break;

            case 44:
                size = "large";
                break;

            case 48:
                size = "extra large";
                break;

            default:
                size = "unknown";
                break;
        }

        System.out.println("Size: " + size);

        scanner.close();
    }
    
}
