/**
 * InnerStaticMethod
 */
class Mobiles {

    String brand;
    int price;
    static String name;

    public void show()
    {
        System.out.println("Brand: "+brand+" Price: "+price+" Name: "+name);
    }

    public static void show1(Mobiles obj)
    {
        System.out.println("Brand: "+obj.brand+" Price: "+obj.price+" Name: "+name);
    }
}

public class StaticMethod {
    
    public static void main(String args[])
    {
        Mobiles obj1 = new Mobiles();
        obj1.brand = "Samsung";
        obj1.price = 10000;
        Mobiles.name = "SmartPhone";

        Mobiles obj2 = new Mobiles();
        obj2.brand = "Apple";
        obj2.price = 50000;
        Mobiles.name = "SmartPhone";

        Mobiles.name = "Mobile";

        obj1.show();
        obj2.show();
        Mobiles.show1(obj2);
    }
}
