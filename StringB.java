public class StringB {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("System");
        
        sb.append(" Ready");
        sb.insert(0, "All ");
        
        System.out.println(sb);
        
        sb.reverse();
        System.out.println(sb);
        
        String finalResult = sb.toString();
        System.out.println(finalResult);
    }
}
