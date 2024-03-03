class ABC
{
    public void show()
    {
        System.out.println("In A");
    }

    public void config()
    {
        System.out.println("In A Config");
    }

    public int add(int a, int b)
    {
        return a+b;
    }
}

class BCD extends ABC
{
    public void show()
    {
        System.out.println("In B");
    }

    public int add(int a, int b)
    {
        return a+b+1;
    }

}


public class DemoMethodOverriding {
    
    public static void main(String args[])
    {
        BCD obj  = new BCD();

        obj.show();
        obj.config();

        int r1 = obj.add(5, 6);
        
        System.out.println(r1);
    }
}
