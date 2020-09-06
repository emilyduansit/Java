import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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


   List list = new ArrayList<>(List.of("A"));
   String[]  array3={"B","C"};
   String[]  array4= (String[]) list.toArray(array3);
   System.out.println(list);
   System.out.println(Arrays.toString(array3));
   System.out.println(Arrays.toString(array4));

   Object[]  array5 =list.toArray();
   System.out.println(Arrays.toString(array5));

   String[] array6 = new String[2];
   String[] array7 = (String[]) list.toArray(array6);
   System.out.println(Arrays.toString(array7));

   int i =070;
   System.out.println(i);



    
}
    
}