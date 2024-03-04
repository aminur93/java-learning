package InnerClass;

class A {

    int age;

    public void display()
    {
        System.out.println("In A class");
    }

    class B {

        public void show()
        {
            System.out.println("In B class");
        }
    }

    static class C{

        public void config()
        {
            System.out.println("In C class");
        }
    }
}

public class Demo {
    
    public static void main(String args[])
    {
        A obj = new A();
        obj.display();

        A.B obj1 = obj.new B();
        obj1.show();

        A.C obj2 = new A.C();
        obj2.config();
    }

}
