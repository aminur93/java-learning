public class LogicalOperator {

    public static void main(String args[])
    {
        int x = 7;
        int y = 5;

        int a = 10;
        int b = 5;

        boolean result = x > y && a > b;

        boolean result2 = x < y || a > b;

        System.out.println(result);

        System.out.println(result2);
    }
    
}
