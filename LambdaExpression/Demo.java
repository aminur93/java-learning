package LambdaExpression;

@FunctionalInterface
interface A{
    void show(int i);
}

public class Demo {

    public static void main(String args[])
    {
        A obj = i -> System.out.println("Hello Lambda expression " + i);
        obj.show(10);
    }
}