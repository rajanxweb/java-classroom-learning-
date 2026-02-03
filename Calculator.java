// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        char st = s.next().charAt(0);
        double n1 = s.nextDouble();
        double n2 = s.nextDouble();
        switch(st){
            case '+':
                double result = n1+n2;
                System.out.println("Sum of n1 & n2 is : "+ result);
                break;
            case '-':
                result = n1-n2;
                if(result <0){
                    result = -result;
                }
                System.out.println("Subtraction of n1 & n2 is : "+result);
                break;
            case '*':
                result = n1*n2;
                System.out.println("Multiplication of n1 & n2 is : "+ result);
                break;
            case '/':
                
                result = n1/n2;
                
                System.out.println("Division of n1 & n2 : " + result );
                break;
            default:
                System.out.println("Don't be oversmart, just be sitted with silance !");
                break;
            
                
                
        }
    }
}