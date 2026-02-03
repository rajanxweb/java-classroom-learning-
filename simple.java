// You are using Java
class Main{
    static void  callMe(){
        int a =10; //local variable
        System.out.println("You called me..!");
        System.out.println(a);
        
    }
    public static void main(String[] args){
        int  a= 9; // local variable
        System.out.println(a);
        callMe();
    }
}