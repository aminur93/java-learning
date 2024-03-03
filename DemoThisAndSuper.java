class C
{
    public C()
    {
        System.out.println("Constructor of C");
    
    }

    public C(int n)
    {
        System.out.println("Constructor of C with parameter");
    }
}

class D extends C
{
    public D()
    {
        super();
        System.out.println("Constructor of B");
    
    }

    public D(int n)
    {
        this();
        System.out.println("Constructor of B with parameter");
    }
}

public class DemoThisAndSuper {
    
    public static void main(String args[])
    {
        D obj = new D(5);
    }
}
