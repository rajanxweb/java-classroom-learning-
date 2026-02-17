public class InitializerDemo {
    int a;
    {
        a=5;
        System.out.println("It is Initializer block");
        System.out.println("a = "+ a);

    }
    InitializerDemo(){
        System.out.println("Constructor block called...");
    }
    public static void main(String[] args){
        InitializerDemo d = new InitializerDemo();
    }
}
