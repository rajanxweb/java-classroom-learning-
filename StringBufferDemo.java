public class StringBufferDemo {
    public static void main(String[] args)
    {
        // using StringBuffer, checking length , and checking capacity.
        StringBuffer sb = new StringBuffer("amma");
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

        // delete
        sb.delete(6,10);
        System.out.println(sb);

        // delete charAt

        sb.deleteCharAt(0);
        sb.deleteCharAt(0);
        System.out.println(sb);

        // reverse

        System.out.println(sb.reverse());
        sb.setCharAt(1,'u');
        System.out.println(sb);

        // charAt

        System.out.println(sb.charAt(0));

        // substring

        sb.append("Programming");
        System.out.println(sb.substring(3,9));

        // isEmpty

        System.out.println(sb.isEmpty());



        


    }
}