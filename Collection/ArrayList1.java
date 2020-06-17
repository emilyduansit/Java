import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayList1 {
   public static void main(String[] args) {
       List<String> list = new ArrayList<>(List.of("A"));
       String[] array1={"B","C"};
       String[] array2=list.toArray(array1);

       System.out.println(Arrays.toString(array2));//[A,null]
       array1[1]="D";

       System.out.println(Arrays.toString(array2));//[A,D]
       array2=list.toArray(new String[0]);

       System.out.println(Arrays.toString(array2));//[A]
       Object[] objects = list.toArray();

       System.out.println(Arrays.toString(objects));//[A]
       

   } 
}