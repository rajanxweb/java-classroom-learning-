class Demo1{
    int x;
    void showX()
    {
        System.out.println("x="+x);
    }
}

class Demo2 extends Demo1{
    int y=4;
    void showY(){
        x=9;
        System.out.println("y="+y);
        System.out.println();
    }
}





public class Encapulation {
    public static void  main(String[] args){
        Demo2 d= new Demo2();
            d.showX();
        
    }
}
