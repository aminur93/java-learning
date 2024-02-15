class Mobile
{
    String brand;
    int price;
    String network;
    static String name;

    public void show()
    {
        System.out.println("Brand: "+brand+" Price: "+price+" Network: "+network+" Name: "+name);
    }
}


public class StaticVariable {
    
    public static void main(String args[])
    {
        Mobile obj1 = new Mobile();
        obj1.brand = "Samsung";
        obj1.price = 10000;
        obj1.network = "4G";
        Mobile.name = "SmartPhone";

        Mobile obj2 = new Mobile();
        obj2.brand = "Apple";
        obj2.price = 50000;
        obj2.network = "5G";
        Mobile.name = "SmartPhone";

        Mobile.name = "Mobile";

        obj1.show();
        obj2.show();
    }
}
