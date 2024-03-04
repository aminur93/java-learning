package finalkeyword;


// final - vaiable, method, class

final class A
{
    public void show()
    {
        System.out.println("In A Show");
    }

    public void add(int a, int b)
    {
        System.out.println(a+b);
    }
}

// class B

class B {

    public final void show1()
    {
        System.out.println("In B Show by aminur");
    }

    public void add1(int a, int b)
    {
        System.out.println(a+b);
    }
    
}


// class c extend b

class C extends B
{

    public void add1(int a, int b)
    {
        System.out.println(a+b);
    }
}

public class Demo {

    public static void main(String args[])
    {
        // final int num = 8;

        // System.out.println(num);

        A obj = new A();

        obj.show();
        obj.add(5, 6);

        C obj1 = new C();
        //obj1.show2();
        obj1.add1(5, 6);
    }

}