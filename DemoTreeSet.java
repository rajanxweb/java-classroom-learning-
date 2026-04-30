import java.util.TreeSet;
public class DemoTreeSet {
    public static void main(String[] args){
        TreeSet<Integer> ts = new TreeSet<>();
        ts.add(10);
        ts.add(40);
        ts.add(30);
        ts.add(20);
        ts.add(50);
        // ts.add(null);
        ts.add(50);

        System.out.println(ts);
        System.out.println("First: "+ ts.first());
        System.out.println("getFirst: "+ ts.getFirst());
        System.out.println("Last: "+ ts.last());
        System.out.println("getLast: "+ ts.getLast());
        System.out.println("higher: "+ ts.higher(15));
        System.out.println("lower: "+ ts.lower(25));
    }

}