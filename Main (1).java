// You are using Java
import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int m1 = s.nextInt();
        int m2  = s.nextInt();
        int m3= s.nextInt();
        
        int sum = m1+m2+m3;
        int avg =sum/3;
        
        if(avg>=90){
            System.out.println("outstanding performance !");
        }
        else if(avg<90 && avg>=80){
            System.out.println("Excellent !");
        }
        else if(avg<80 && avg >=70){
            System.out.println("very Good !");
        }
        else if(avg<70 && avg >=60){
            System.out.println("Good !");
        }
        else if(avg<60 && avg  >=50){
            System.out.println("Average !");
        }
        else{
            System.out.println("Fail !");
        }
    }
}