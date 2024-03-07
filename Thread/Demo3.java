package Thread;

class Counter
{
    int count;

    public synchronized void incriment()
    {
        count++;
    }
}

public class Demo3 {
    
    public static void main(String args[])
    {

        Counter co = new Counter();

        Runnable obj1 = () -> {

            for(int i=1; i<=1000; i++)
            {
                co.incriment();
            }
        };

        Runnable obj2 = () -> {

            for(int i=1; i<=1000; i++)
            {
                co.incriment();
            }
        };

        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);

        t1.start();
        t2.start();

        // Wait for threads to finish
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(co.count);
    }
}
