//learning one-dimentional array

public class Array {
    public static void main(String[] args){
        double arr[] = new double[3];
        //Scanner sc= new Scanner(System.in);

        for(int i=0; i<arr.length; i++){
            arr[i] = (Math.random()*100)+1;

        }
        for(int i=0; i<arr.length; i++){
            System.out.printf("%.2f",arr[i]);
            System.out.println();
        }

//learning multi-dimentional array
        int multi[][] = new int[3][4];
        for(int i=0; i<3; i++){
            for(int j=0; j<4; j++){
                multi[i][j]=(int)(Math.random()*100)+1;
                System.out.print(multi[i][j]+" ");
            }
            System.out.println();
        }
// using for each loop(enhanced for loop) on multi-dimentional array block
        for(int[] var:multi){
            for(int one:var){
                System.out.print(one+" ");
            }
            System.out.println();
        }
        


    }
}
