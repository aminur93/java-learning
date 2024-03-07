package Thread;

class C extends Thread
{

    public void run()
    {
        for(int i=0;i<50;i++)
        {
            System.out.println("Hello");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class D extends Thread
{

    public void run()
    {
        for(int i=0;i<50;i++)
        {
            System.out.println("Hi");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class Demo1 {
    
    public static void main(String args[])
    {
        C obj1 = new C();
        D obj2 = new D();

        //obj2.setPriority(Thread.MAX_PRIORITY);

        obj1.start();
        try {
            Thread.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        obj2.start();
    }
}
