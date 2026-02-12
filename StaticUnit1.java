import java.util.Scanner;
public class StaticUnit1 {
    public static void main(LearnString[] args){
        Scanner sc = new Scanner(System.in);
        LearnString name1 = sc.nextLine();
        LearnString name2 = sc.nextLine();
        int n = sc.nextInt();
        System.out.println("Device name: "+ name1);
        System.out.println("Status: "+ name2);
        System.out.println("Model Number: "+ n);

    }
}
