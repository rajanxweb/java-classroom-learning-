//Wrapper-class

public class TestWrapper {
    public static void main(String[] args){
        int a = 10;
        System.out.println(a);
        Integer x = 35;
        System.out.println(x);
        x++;
        System.out.println(x);
        Integer y = x;
        System.out.println(++y);
        Integer b = y;
        System.out.println(++b);
        
// parse type - string to any numeric data type conversion
        String s = "123";
        int c = Integer.parseInt(s);
        double d = Double.parseDouble(s);
        d++;
        System.out.println(d);

        String str = Double.toString(d);
        System.out.println(str);
        
        Integer ii = Integer.valueOf("123");
        Double dd = Double.valueOf("789.456");
        System.out.println(++ii);
        System.out.println(++dd);



    }
}
