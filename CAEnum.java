enum Color {red, green, blue}

public class CAEnum {
    public static void main(String[] args){
        Color check = Color.green;
        switch(check){
            case green:
                System.out.println("go");
                break;
            case red:
                System.out.println("stop");
                break;
            case blue:
                System.out.println("blue");
                break;

        }
    }
}
