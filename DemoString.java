public class DemoString {
    
    public static void main(String[] args) {

        String name = "Hello World";

        String name2 = new String("Aminur Rashid");

        System.out.println(name);

        System.out.println("Hello " + name2);

        System.out.println(name.hashCode());

        System.out.println(name2.charAt(0));

        System.out.println(name2.concat(" ready"));
    }
}
