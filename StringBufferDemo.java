public class StringBufferDemo {
    public static void main(String[] args)
    {
        // using StringBuffer, checking length , and checking capacity.
        StringBuffer sb = new StringBuffer("java");
        System.out.println(sb);
        System.out.println(sb.length());
        System.out.println(sb.capacity());


        StringBuffer sb2 = new StringBuffer(10);
        System.out.println(sb2);
        System.out.println(sb2.length());
        System.out.println(sb2.capacity());


        StringBuffer sb3 = new StringBuffer("a");
        System.out.println(sb3);
        System.out.println(sb3.length());
        System.out.println(sb3.capacity());  // ASCII - 97


        // append 

        sb.append(" programming ");
        System.out.println(sb);
        System.out.println(sb.capacity());

        sb.insert(0, "CSE");
        System.out.println(sb);
        System.out.println(sb.capacity());

        // replace
        sb.replace(6,10,"TTTT");
        System.out.println(sb);
    }
}