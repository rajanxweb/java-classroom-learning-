public class Student {
    String name;
    int age;
    Student(String name, int a){
        this.name = name;
        age = a;
    }
    @Override 
    public String toString(){
        return name+ " is " + age + " years old";   
    }
}
class Me{
    public static void main(String [] args){
        Student s1= new Student("Rahul", 19);
        Student s2 = new Student("Karan", 19);
        Student s3 = new Student("Krishna", 29);
        System.out.println(s1);
        System.out.println(s2.toString());
    }
}