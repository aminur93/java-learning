public class AssignmentOperator {

    public static void main(String args[])
    {
        int num1 = 10;

        int num2 = 20;

        int num3 = 30;

        int num4 = 40;

        int Addition = num1 + num2;

        int subtract = num2 - num1;

        int multiply = num1 * num2;

        double divide = (double)num2 / num1;

        num3 += 20;

        num3++; // post - increment

        num3--; // post - decrement

        //++num4; // pre - increment

        int result = num4++; // post - increment

        int result1 = ++num4; // pre - increment

        System.out.println("Addition Result is: " + Addition);

        System.out.println("Subtraction Result is: " + subtract);

        System.out.println("Multiplication Result is: " + multiply);

        System.out.println("Division Result is: " + divide);

        System.out.println("Number 3 Addition Result is: " + num3);

        System.out.println("Number 3 Increment Result is: " + num3);

        System.out.println("Number 3 Decrement Result is: " + num3);

        // System.out.println("Number 4 Increment Result is: " + num4);

        System.out.println("Number 4 Post Increment Result is: " + result);

        System.out.println("Number 4 Pre Increment Result is: " + result1);
    }
    
}
