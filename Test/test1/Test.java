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
    static int number;

 


    LocalDate D1 = LocalDate.of(2019, 1, 1);    
    LocalDate D2 = LocalDate.parse("2019-01-01", DateTimeFormatter.ISO_DATE);
    LocalDate D3 = LocalDate.now().withDayOfMonth(1).withMonth(1).withYear(2019);

    LocalTime d = LocalTime.of(1, 15, 30);


  

    public void mthodprint(){
       System.out.println(D1.equals(D2)+" "+D2.equals(D3));
       System.out.println(D1);
    }


    int increase(int number){
        return number++;
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
      

        Test a = new Test();
        System.out.println(a.increase(1));
        System.out.println(1);

        // a = new Test();

        // a = null;

        // a = new Test();

  
        // String string1 =Arrays.toString(args);
        // System.out.println(string1);

        // Object[][] strings = new String[2][2];
        // strings[1][1] = "test";
        // strings[0] = new String[1];
        // strings[1] = new String[3];
        // System.out.println(strings[1][1]);

 
      //  a.mthodprint();

     //   System.out.println(x);
      
    //  int i;
    //     for(i=0;i<5;i++,System.out.println(i+ " ")){
           
    //         i++;
            
    //     }

    // String s1 = "abcd";
    // StringBuilder s2 = new StringBuilder("abcd");    
    // StringBuilder s3 = new StringBuilder("abcd");
    // System.out.println(s2.toString().equals(s3.toString()));
    // System.out.println(s1.equals(s2.toString()));

    // String[] a1 = {"1","2","3"};
    // String[] a2 ={};
    // String[] a3 = null;

    // System.out.println(Arrays.compare(a1, a2));
    // System.out.println(Arrays.compare(a2, a3));
    // System.out.println(Arrays.compare(a3, a1));


   


    }
}

 




    
