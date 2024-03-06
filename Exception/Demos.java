package Exception;

class A{

    public void show() throws ClassNotFoundException
    {
        Class.forName("Exception.Demos");    
    }
}

public class Demos {

    public static void main(String args[])
    {
       A obj = new A();

        try {
            obj.show();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
