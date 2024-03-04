package Abstract;

abstract class Car // parent abstract class
{
    public abstract void drive();

    public abstract void playMovie();

    public abstract void fly();

    public void music()
    {
        System.out.println("Playing music");
    }
}

abstract class Bmw extends Car // child abstract class extends another abstract class
{
    public void drive()
    {
        System.out.println("Driving BMW");
    }

    public void playMovie()
    {
        System.out.println("Playing movie in BMW");
    }
}

class UpdateBmw extends Bmw // concreate class
{
    public void fly()
    {
        System.out.println("Flying BMW");
    }
}

public class Demo {
    
    public static void main(String args[])
    {
        Bmw obj = new UpdateBmw();
        obj.drive();
        obj.fly();
        obj.playMovie();
        obj.music();

    }
}
