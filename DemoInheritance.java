public class DemoInheritance {
    
    public static void main (String args[])
    {
        VeryAdvCalc obj = new VeryAdvCalc();

        int r1 = obj.add(10, 20);

        int r2 = obj.sub(20, 10);

        int r3 = obj.mul(10, 20);

        double r4 = obj.div(20, 10);

        int r5 = obj.pow(2, 3);

        System.out.println("Addition: " + r1);

        System.out.println("Subtraction: " + r2);

        System.out.println("Multiplication: " + r3);

        System.out.println("Division: " + r4);

        System.out.println("Power: " + r5);
    }
}
