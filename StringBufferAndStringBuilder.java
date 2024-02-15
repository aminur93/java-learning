public class StringBufferAndStringBuilder {

    public static void main(String args[])
    {
        StringBuffer sb = new StringBuffer("hello ");

        System.out.println("Length of sb: " + sb.capacity());

        System.out.println("Length of sb: " + sb.length());

        sb.append(" world");

        sb.deleteCharAt(2);

        sb.insert(2, "l");

        sb.setLength(30);

        System.out.println(sb);
    }
}