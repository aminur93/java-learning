public class MutableImmutableString {
    
    public static void main(String args[])
    {
        String name = "Aminur";

        name = name + " Rashid";

        System.out.println("Hello " + name);

        String s1 = "pavel";

        String s2 = "pavel";

        System.out.println(s1 == s2);
    }
}
