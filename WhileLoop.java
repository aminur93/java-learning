public class WhileLoop {

    public static void main(String args[])
    {
        int rows = 5;

        int space = rows - 1;

        int stars = 1;

        int i = 0;

        while (i < rows)
        {
            int j = 0;

            // print space
            while (j < space)
            {
                System.out.print(" ");
                j++;
            }

            // print stars
            int k = 0;

            while (k < stars)
            {
                System.out.print("*");
                k++;
            }

            // next line
            System.out.println();

            space--;
            stars += 2;

            i++;
        }
    }
    
}
