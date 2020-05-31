package test1;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;

public  class Test {

    static String text2 = "b";
    String text1 = "a" + text2;

    String text3;

 //   float f = 1.23f;

 


    LocalDate D1 = LocalDate.of(2019, 1, 1);    
    LocalDate D2 = LocalDate.parse("2019-01-01", DateTimeFormatter.ISO_DATE);
    LocalDate D3 = LocalDate.now().withDayOfMonth(1).withMonth(1).withYear(2019);

    LocalTime d = LocalTime.of(1, 15, 30);


  

    public void mthodprint(){
       System.out.println(D1.equals(D2)+" "+D2.equals(D3));
       System.out.println(D1);
    }
}

class boo extends Test{
    static String text;

    String text2 = "b1boo";

    

    public static void mthod(){
   //     super.mthodprint();
    }

    static boolean x;


    public static void main(String[] args) {
      

        // Test a = new Test();

        // a = new Test();

        // a = null;

        // a = new Test();

  
        String string1 =Arrays.toString(args);
        System.out.println(string1);



 
      //  a.mthodprint();

     //   System.out.println(x);
      



    }
}

 




    
