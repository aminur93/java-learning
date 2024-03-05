package Enum;

enum Status{
    PENDING, APPROVED, REJECTED
}

public class Demo {
    
    public static void main(String args[])
    {
        Status s = Status.PENDING;


        switch (s) {
            case PENDING:
                System.out.println("Pending your request");
                break;

            case APPROVED:
                System.out.println("Approved your request");
                break;

            case REJECTED:
                System.out.println("Rejected your request");
                break;
        
            default:
                System.out.println("Invalid Status");
                break;
        }

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
