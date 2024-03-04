package Interface;

// class - class -> extends
// class - interface -> implements
// interface - interface -> extends

interface A{

    int age = 44; // final and static by default
    String name = "John"; // final and static by default

    void show();

    void config();
}

interface X{

    void run();
}

interface Y extends X{

    void walk();
}

class B implements A, Y
{

    @Override
    public void show() {
        System.out.println("Show method of class B");
    }

    @Override
    public void config() {
        System.out.println("Config method of class B");
    }

    @Override
    public void run() {
        System.out.println(name + " is running...");
    }
    

    public void walk() {
        System.out.println(name + " is walking...");
    }
}

public class Demo1 {
    
    public static void main(String args[])
    {
        B obj = new B();
        obj.show();
        obj.config();
        obj.run();
        obj.walk();

        System.out.println("Age: " + A.age);
        System.out.println("Name: " + A.name);
    }
}
