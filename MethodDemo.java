//Learning method & method overloading

import java.util.Scanner;
class Test{
    int r;
    final double PI = 3.14;
    Scanner s = new Scanner(System.in);
    void readRad(){
        System.out.println("Enter radius: ");
        r = s.nextInt();

    }
    void area(){
        double area = PI* r*r;
        System.out.println("Area of circle : "+area);
    }
}


public class MethodDemo {
    public static void main(String[] args){
        Test t = new Test();
        t.readRad();
        t.area();

    }
}
