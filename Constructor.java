class Demo{
    int x;
    int y;
    Demo(){}
    Demo(int x, int y){ 
        this.x = x;
        this.y = y;
    }
    void showX(){
        System.out.println(x);
        System.out.println(y);
    }                                       
    
}       

public class Constructor {
    public static void main(String[] args){
        //Demo d = new Demo();
        Demo dd = new Demo(5,6);
        dd.showX();
    }
}
