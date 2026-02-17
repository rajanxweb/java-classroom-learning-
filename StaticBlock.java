public class StaticBlock {
    static int x;
    int y;
    static{
        x=8;
        System.out.println("Static block");
        System.out.println("x = "+x);

    }
    public static void main(String[] args){
        System.out.println("Main Block");
        System.out.println("in main x = "+x);
    }




}
