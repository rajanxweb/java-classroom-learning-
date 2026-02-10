//jagged array

public class JaggedArray {
    public static void main(String[] args){
        int x[][] = new int[3][];
        x[0] = new int[2];
        x[1] = new int[5];
        x[2] = new int[7];

        for(int i=0; i<x.length; i++){
            for(int j=0; j<x[i].length; j++){
                System.out.print((int)(Math.random()*100)+1  +  "  ");
            
            }
            System.out.println();

        }
    }
}
