class SmartPhone
{
    String brand;
    int price;
    static String name;

    static
    {
        name = "phone";

        System.out.println("Static block is called");
    }

    public SmartPhone()
    {
        brand = "";
        price = 20000;

        System.out.println("Constructor is called");
    }

    public void show()
    {
        System.out.println("Brand: "+brand+" Price: "+price+" Name: "+name);
    }
}

public class StaticBlock {

    /**
     * @param args
     * @throws ClassNotFoundException 
     */
    public static void main(String args[]) throws ClassNotFoundException
    {

        Class.forName("SmartPhone");

        // SmartPhone obj1 = new SmartPhone();
        // obj1.brand = "Samsung";

        // SmartPhone obj2 = new SmartPhone();
        // obj2.brand = "Apple";

        // obj1.show();
        // obj2.show();
    }
    
}
