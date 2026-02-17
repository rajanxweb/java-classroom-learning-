public class StringTest {
    public static void main(String[] args){
        String s1 = "LPuu4";
        String s2 = "LPU";
        System.out.println(s1==s2);

        String t1= new String("CSE");
        String t2= new String("CSE");

        System.out.println(t1==t2);
        System.out.println(t1.equals(t2));

        System.out.println(s1.length());
        System.out.println(t1.charAt(1));

        System.out.println(t1.toUpperCase());
        System.out.println(t1.toLowerCase());

        System.out.println(s1);
        System.out.println(t1.substring(1,2));
        System.out.println(s1+s2);

        System.out.println(s1.contains("U"));

        System.out.println(t2.indexOf("C"));
        System.out.println(t2.replace('C','s'));
        System.out.println(t2);

        


    }
}
