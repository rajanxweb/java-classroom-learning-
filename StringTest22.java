public class StringTest22 {
    public static void main(String[] args){
        String t = new String("Computer, Science, Engg..");
        String s[] = t.split(",");
        for(String d:s){
            System.out.println(d);

        }
        System.out.println(t.isEmpty());
    }
}
