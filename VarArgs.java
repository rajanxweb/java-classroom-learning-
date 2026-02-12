//variable arguments in java

class Calculator{
    public static void printNumbers(int ... numbers){
        for(int var: numbers){
            System.out.println(var+" ");
        }
    }
}


public class VarArgs {
    public static void main(String[] args){
        Calculator ca =new Calculator();
        ca.printNumbers(1,2,3,4,5);
    }
}
