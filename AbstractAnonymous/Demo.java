package AbstractAnonymous;

abstract class A
{
    public abstract void display();

    public abstract void config();
}


public class Demo {

    public static void main(String args[])
    {
        A obj = new A(){

            public void display()
            {
                System.out.println("In Abstract Anonymous class");
            }

            public void config()
            {
                System.out.println("In Config method");
            }
        };
        obj.display();
        obj.config();
    }
    
}
