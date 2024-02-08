public class TypeConversion {

    public static void main(String[] args) {
        
        byte b = 127;

        int a = b; // Implicit type conversion

        int c = 257;

        byte k = (byte)c;

        float f = 123.45f;

        int t = (int)f;


        //promote conversion

        byte x = 10;

        byte y = 30;

        int result = x * y;

        System.out.println("b = " + b);

        System.out.println("a = " + a);

        System.out.println("k = " + k);

        System.out.println("t = " + t);

        System.out.println("result = " + result);
    }
    
}
