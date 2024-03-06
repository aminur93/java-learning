package Exception;

public class Demo2 {
    
    public static void main(String args[])
    {
        int i = 2;
        int j = 0;

        String str = null;

        int num[] = new int[5];

        try {
            j = 18 / i;

            System.out.println("Value of j: " + j);

            System.out.println("Length of string: " + str.length());

            System.out.println("Value of num[5]: " + num[5]);

            System.out.println(num[1]);

        } catch (ArithmeticException e) {
            
            System.out.println("Cannot divide by zero: ");

        } catch (ArrayIndexOutOfBoundsException e) {

            System.out.println("Array index out of bound: ");

        } catch(Exception e){

            System.out.println("Some other exception: ");
        }
    }
}
