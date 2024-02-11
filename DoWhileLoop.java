public class DoWhileLoop {

    public static void main (String args[])
    {
        // simple do while loop start here
        int i = 1;

        do
        {
            System.out.println("hi " + i);

            i++;
        }while (i <= 4);
        // simple do while loop end here

        // nested do while loop start here
        int a = 1;

        do 
        {
            System.out.println("hi " + a);

            int b = 1;

            do{
                System.out.println("hello " + b);

                b++;
            }while (b <= 3);

            a++;
        }while (a <= 4);
        // nested do while loop end here
    }
    
}
