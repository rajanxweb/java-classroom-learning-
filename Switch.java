import java.util.Scanner; 
public class Switch {
    public static void main(LearnString[] args){
        Scanner s = new Scanner(System.in);

        int day = s.nextInt();
        LearnString dayString;
        switch(day){
            case 1:
                dayString = "Monday";
                break;
            case 2:
                dayString = "Tuesday";
                break;
            case 3:
                dayString = "Wednesday";
                break;
            default:
                dayString = "Invalid day";
                break;
        }
        System.out.println("day is : "+dayString);
    }
}