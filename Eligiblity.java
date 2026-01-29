//taking input
//using ternery operator
import java.util.Scanner;
public class Eligiblity {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int age = s.nextInt();
        System.out.println((age>18)?"Person is eligible for voting" : "person is not eligible for voting");

    }
}
