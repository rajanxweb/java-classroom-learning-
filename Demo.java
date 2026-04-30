interface A{
    void showA();

}
interface B{
    void showB();
}
class Demo implements A, B{
    public void showA(){
        System.out.println("It is from A interface ");
    }
    public void showB(){
        System.out.println("It is from B interface ");
    }
    public static void main(String[] args){
        Demo d = new Demo();
        d.showA();
        d.showB();
    }
}
