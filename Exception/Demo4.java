package Exception;

class AminurException extends Exception
{
    public AminurException(String s)
    {
        super(s);
    }
}

public class Demo4 {
    
    public static void main(String args[])
    {
        int i = 20;
        int j = 0;

        try
        {
            j = 18/i;

            if (j == 0)
            {
                throw new AminurException(" i do not want print zero");
            }
        }
        catch(AminurException e)
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
