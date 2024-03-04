package WrapperClass;

public class Demo {
    
    public static void main(String args[])
    {
        int num = 5;

        Integer num1 = num; // auto boxting

        int num2 = num1; // auto unboxing

        String str = "12";

        int num3 = Integer.parseInt(str); // parsing

        System.out.println(num3 * 2);

        System.out.println(num1);
    }
}
