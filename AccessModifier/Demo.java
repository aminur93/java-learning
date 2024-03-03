package AccessModifier;

import AccessModifier.other.tools.*;

public class Demo {

    public static void main(String args[])
    {
        // A a = new A();
        // System.out.println(a.marks);

        B b = new B();
        System.out.println("Hello Mr. "+ b.getName()+ " your marks is " + b.getMarks());

        C c = new C();
        c.show();
    }
    
}
