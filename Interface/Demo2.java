package Interface;

@FunctionalInterface
interface D{
    void show();
}


public class Demo2 {
    
    public static void main(String args[])
    {
        D obj = new D(){
            public void show()
            {
                System.out.println("In A show");
            }
        };
        obj.show();
    }
}
