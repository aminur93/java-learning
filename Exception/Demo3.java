package Exception;

public class Demo3 {
    
    public static void main(String args[])
    {
        int i = 20;
        int j = 0;

        try
        {
            j = 18/i;

            if (j == 0)
            {
                throw new ArithmeticException(" i do not want print zero");
            }
        }
        catch(ArithmeticException e)
        {
            j = 18/1;

            System.out.println("That is default output : " + e.getLocalizedMessage());
        }
        catch(Exception e)
        {
            System.out.println("Error: " + e);
        }
    }
}
