//taking input 
import java.util.Scanner;
class Main{
    public static void main(String[] args){
        Scanner s= new Scanner(System.in);

        boolean a = s.nextBoolean();
        boolean b = s.nextBoolean();
        String st = s.nextLine();
        
        System.out.println("My name is : "+st);

        //logical operator
        System.out.println("the result of logical and operator is : "+(a && b));
        System.out.println("the result of logical or operator is : "+(a || b));
        }
}