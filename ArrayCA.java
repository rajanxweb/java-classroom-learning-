public class ArrayCA {
    public static void main(String[] args){
        int[] data = {1,2,3,4,5};
        int[] data2 = new int[5];

        for(int i=0; i<data.length; i++){
            System.out.println(data[i]);
        }

// jagged array
        int[][] jagged = new int[3][];
        jagged[0] = new int[5];
        jagged[1] = new int[3];
        jagged[2] = new int[1];

        for(int[] val : jagged){
            for(int val2 : val){
                System.out.println(val2);
            }
        }

    }
}
