public class ConditionalStatement {

    public static void main(String args[])
    {

        // int x = 28;

        // if(x > 10 && x <= 20)
        // {
        //     System.out.println("hello");
        // }else{
        //     System.out.println("bye");
        // }

        // int a = 8;
        // int b = 7;
        // int c = 9;

        // if(a > b && a > c)
        // {
        //     System.out.println(a);
        // }else if(b > a && b > c)
        // {
        //     System.out.println(b);
        // }else{
        //     System.out.println(c);
        // }

        int n = 4;

        int result = 0;

        int result1 = (n % 2 == 0) ? n*n : 20;

        if(n % 2 == 0)
        {
            result = 10;
        }else{
            result = 20;
        }

        System.out.println(result);

        System.out.println(result1);
    }
    
}
