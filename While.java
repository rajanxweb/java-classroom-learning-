import java.util.Scanner;

public class While {
    static public void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();

        //while loop
        while(i<=10){
            System.out.println(i);
            i++;
        }
        //for loop
        do{
            System.out.println(i);
            i--;
        }while(i>0);

        //for loop
        for(int x=0; x<i; x++){
            System.out.println(x);
        }

    }
    
}
