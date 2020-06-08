import java.util.Arrays;

public class test {

    public static void main(String[] args) {
    int[] a1={1,2,3};
    int[] a2={4,5};
    int[][] mix = new int[3][2];

    for(int i=0;i<a1.length;i++){
        mix[i][0] = a1[i];
    }

    for(int i=0;i<a2.length;i++){
        mix[i][1] =a2[i];
    }

    System.out.println("length"+a1.length);



    for(int[] row:mix){
        for(int element :row){
            System.out.print(element+" ");
        }
        System.out.println();  
    }

    System.out.println();



    int[] array1={1,2,3};
    int[] array2={1,2,3,4};

   // System.out.println(Arrays.compare(array1,array2));
   System.out.println(Arrays.mismatch(array1,array2));
    
}
    
}