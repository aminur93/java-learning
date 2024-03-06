package Exception;

public class Demo {

    public static void main(String args[])
    {
        int i = 0;
        int j = 0;
    
        try{
    
            j = 10 / i;
    
        }  catch(Exception e){
    
            System.out.println("Exception: " + e.getMessage());

        } finally{
    
            System.out.println("This line will be executed with result " + j);
        }
    }
}
