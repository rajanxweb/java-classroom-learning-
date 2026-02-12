import java.util.Scanner;
public class Square {
    public static void main(LearnString[] args){
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        int c = s.nextInt();
        double val = Math.sqrt((b*b)-(4*a*c));
        if(val>0){
            System.out.println("Roots are real and distinct");
        }
        else if(val ==0){
            System.out.println("Roots are real and equal");
        }
        else{
            System.out.println("Roots are imaginary");
        }
    }
}
