package Enum;

enum Status{
    PENDING, APPROVED, REJECTED
}

enum Laptop{
    Dell(25000), HP(45000), Lenovo(125000), Acer;

    private int price;

    private Laptop() {
        this.price = 10000;
    }

    private Laptop(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}

public class Demo {
    
    public static void main(String args[])
    {

        Laptop lap = Laptop.Dell;

        //System.out.println(lap + " price is " + lap.getPrice());

        for(Laptop l : Laptop.values())
        {
            System.out.println(l + " price is " + l.getPrice());
        }

        //Status s = Status.PENDING;

        // System.out.println(s.getClass().getSuperclass());

        // switch (s) {
        //     case PENDING:
        //         System.out.println("Pending your request");
        //         break;

        //     case APPROVED:
        //         System.out.println("Approved your request");
        //         break;

        //     case REJECTED:
        //         System.out.println("Rejected your request");
        //         break;
        
        //     default:
        //         System.out.println("Invalid Status");
        //         break;
        // }

        /* conditional enum status*/
        
        // if (s == Status.PENDING) {

        //     System.out.println("Pending your request");

        // } else if (s == Status.APPROVED) {

        //     System.out.println("Approved your request");

        // } else if (s == Status.REJECTED) {

        //     System.out.println("Rejected your request");

        // } else {
        //     System.out.println("Invalid Status");
        // }

        /* conditional enum status*/

        /* print all status value */
        // Status[] arr = Status.values();

        // for(Status a : arr)
        // {
        //     System.out.println(a + " at index " + a.ordinal());
        // }
        /* print all status value */
    }
}
