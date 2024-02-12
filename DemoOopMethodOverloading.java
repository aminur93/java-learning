class Calculat
{
    public int add(int n1, int n2, int n3)
    {
        return n1 + n2 + n3;
    }

    public int add(int n1, int n2)
    {
        return n1 + n2;
    }

    public double add(double n1, int n2)
    {
        return n1 + n2;
    }
}


public class DemoOopMethodOverloading {

    public static void main(String args[])
    {
        Calculat obj = new Calculat();

        int result = obj.add(10, 20);

        System.out.println(result);
    }
    
}
