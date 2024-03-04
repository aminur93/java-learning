package AnonymousClass;

class A {

    public void show()
    {
        System.out.println(" In A Show");
    }
}

public class Demo {

    public static void main(String args[])
    {
        A obj = new A() {
            public void show()
            {
                System.out.println("In Anonymous class");
            }
        };
        obj.show();
    }
    
}
