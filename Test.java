public class Test {
    public static void main(String[] args) {
        int x = 5;
        int y = 7;
        int result = mysteryFunction(x, y);
        System.out.println(result);
      }
    
      private static int mysteryFunction(int a, int b) {
        //return (a & b) + (a | b) - (a ^ b);

        return a ^ b;
      }
}
