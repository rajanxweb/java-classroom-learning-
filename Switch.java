import java.util.Scanner; 
public class Switch {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);

        int day = s.nextInt();
        String dayString;
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