package test5;
// import test3.*;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;

//  import test4.greeting;
// import java.lang.StringBuilder;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Arrays;
import java.util.Iterator;

// class StringBuilder{
//     String content;
//     StringBuilder(String content){
//         this.content = content;
//     }
// }
public class mytest {
    static int i = 1_00;

    void print(short argu){
        System.out.println("argument is short");
    }

    void print(Integer argu){
        System.out.println("argument is Integer");
    }

    void print(long argu){
        System.out.println("argument is long");
    }



    public static void main(String[] args) {
        // greeting g = new greeting();

        // System.out.println(g.say());
        // int i =1;

        // mytest test = new mytest();
        // // test.print(1);
        
        // System.out.println(i);

        //int i = (i=1);
        // Integer i ;
         //System.out.println(i++);

        //  List<String> strings = Arrays.asList("A","B");
        
        //  System.out.println(strings);
        //  strings.remove("A");
        //  System.out.println(strings);
        //  strings.remove("A");
        //  System.out.println(strings);
     
        // ArrayList<Integer> arrL = new ArrayList<Integer>(2); 
  
        // // Add elements to ArrayList 
        // arrL.add(1); 
        // arrL.add(2);
        // arrL.add(3);

        // System.out.println(arrL);
        // List<Integer> al = new ArrayList<Integer>(); 
        // al.add(10); 
        // al.add(20); 
        // al.add(30); 
        // al.add(40);
        
        // boolean same = true;
        
        // ListIterator it = al.listIterator();
        // for(Integer element : al){
        //     // if(!(element == it.next())) {
        //     //     same = false;
                
        //     // }
        //     // else
        //     // {
        //     //     System.out.println("element"+element.toString());
        //     //     System.out.println("it.next"+it.next().toString());
        //     // }
        //     //System.out.println("element: "+element);
        //     //System.out.println("it.next"+it.next().toString());
        // }

        // System.out.println("same = "+same);


        // String[] array1 = {"a","b","c","d","e"};
        // String[] array2 =Arrays.copyOfRange(array1, 1, 3);
        // System.out.println(Arrays.toString(array2));

        LocalDate localdate = LocalDate.now()
        .withMonth(11)
        .with(TemporalAdjusters.firstDayOfMonth())
        .with(TemporalAdjusters.next(DayOfWeek.MONDAY))
        .plusDays(1);
        System.out.println(localdate);

    }
}