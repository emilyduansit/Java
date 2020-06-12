import java.util.Arrays;
import java.util.List;

public class listtest {
    
    public static void main(String[] args) {
        Integer[] array={1,2};
        List<Integer> list = Arrays.asList(array);
        list.set(0, 2);
        //list.add(4);  compile error 
        array[1]=1;
        System.out.println(Arrays.toString(array));
        System.out.println(list);

       //var a3[]=new int[]{1,2}; compile error 'var' is not allowed as an element type of an array

    }
}