import java.util.Scanner;

public class UpdateSwitchStatement {
    
    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a Alphabet: ");
        String alphabet = scanner.next();

        String result = "";

        switch (alphabet.toLowerCase()) {
            case "a":
            case "e":
            case "i":
            case "o":
            case "u":
                result = "Vowel";
                break;

            default:
                result = "Consonant";
                break;
        }

        System.out.println("The Alphabet is: " + result);

        scanner.close();
    }
}
