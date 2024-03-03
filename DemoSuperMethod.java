

class A
{
    public A()
    {
        System.out.println("In A");
    }

    public A(int x)
    {
        System.out.println("In A int");
    }
}

class B extends A
{
    public B()
    {
        super(); // This will call the constructor of the parent class
        System.out.println("In B");
    }

    public B(int x)
    {
        this(); // This will call the constructor of the parent class
        System.out.println("In B int");
    
    }
}


public class DemoSuperMethod {
    
    public static void main(String args[])
    {
        B obj = new B(10);

        //B obj1 = new B();
    }
}
