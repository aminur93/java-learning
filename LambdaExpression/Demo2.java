package LambdaExpression;

@FunctionalInterface
interface B{
    int add(int i, int j);
}

public class Demo2 {
    
    public static void main(String args[])
    {
        // The above code can be written using anonymous class as:
        B obj = new B() {
            
            @Override
            public int add(int i, int j) {
                return i+j;
            }
        };
        int result1 = obj.add(10, 20);
        System.out.println("Result is: " + result1);

        // The above code can be written using lambda expression as:
        B obj2 = (i, j) -> i + j;
        int result2 = obj2.add(10, 20);
        System.out.println("Result is lamda expression: " + result2);
    }
}
