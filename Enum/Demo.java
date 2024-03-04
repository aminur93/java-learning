package Enum;

enum Status{
    PENDING, APPROVED, REJECTED
}

public class Demo {
    
    public static void main(String args[])
    {
        Status s = Status.REJECTED;
        System.out.println(s);

        Status[] arr = Status.values();

        for(Status a : arr)
        {
            System.out.println(a + " at index " + a.ordinal());
        }
    }
}
