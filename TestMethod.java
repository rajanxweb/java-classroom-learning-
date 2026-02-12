// let's learn methods 
class Test{
    int a,b;
    void input(){
        a = 10;
        b = 20;

    }
    void showMe(){
        System.out.println("a = "+ a);
        System.out.println("b = "+ b);
    }
    int sum(){
        return a+b;
    }
    double result_div(int a , int b){
        return a/b;
    }

}

public class TestMethod {
    public static void main(String[] args){
        Test test = new Test();
    
        test.input();
        test.showMe();
        test.a = 5;
        test.b = 10;
        test.showMe();

        System.out.println("sum of a & b is " +test.sum());

        System.out.println("the division result of these two is : "+  test.result_div(6, 1));
       
        


    }
}
