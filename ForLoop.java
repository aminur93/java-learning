public class ForLoop {

    public static void main (String args[])
    {
        // simple for nested for loop start here
        for(int i = 1; i <= 4; i++)
        {
            System.out.println("Hi " + i);

            for(int j = 1; j <= 3; j++)
            {
                System.out.println("Hello " + j);
            }
        }
        // simple for nested for loop end here

        // simple for loop start here

        for(int i = 1; i <= 4; i++)
        {
            System.out.println("Hi " + i);
        }
        // simple for loop end here

        //find five days 9 to 6 start here
        for(int i = 1; i <= 5; i++)
        {
            System.out.println("Day " + i);

            for(int j = 1; j <=9; j++)
            {
                System.out.println("    " + (j + 8) + " AM" + " to " + (j + 9) + " PM");
            }
        }
    }
    
}
