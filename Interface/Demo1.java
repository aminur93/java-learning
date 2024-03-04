package Interface;

interface A{

    int age = 44; // final and static by default
    String name = "John"; // final and static by default

    void show();

    void config();
}

class B implements A
{

    @Override
    public void show() {
        System.out.println("Show method of class B");
    }

    @Override
    public void config() {
        System.out.println("Config method of class B");
    }
    
}

public class Demo1 {
    
    public static void main(String args[])
    {
        B obj = new B();
        obj.show();
        obj.config();

        System.out.println("Age: " + A.age);
        System.out.println("Name: " + A.name);
    }
}
