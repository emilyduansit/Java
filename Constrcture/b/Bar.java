package b;

import java.util.List;
import java.lang.String;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import f.Foo;

public  class Bar extends Foo {
   // Bar(){}

    @Override
    public void printMessage(){
        System.out.println("Bar");
    }
    //public abstract  void printMessage();

    @Override
    public Integer getValue(Number number){
        return (Integer)number;
    }

    String appendChar(String[] array){
        StringBuilder builder  = new StringBuilder();
      
        for(String element : array){
            System.out.println(element);
            for(int i =0;i<element.length();i++){
                char c = element.charAt(i);
                if(c>='A'&&c<='Z') builder.append(c);
            }
        }
        return builder.toString();
    }


    int select (short s){
        return  s * 10;
    }

    int i,j = 0, k;
    public static void main(String[] args) {

        // Foo foo = new Bar();
        // foo.printMessage();


        // List<Object> list = List.of("A","B");
        // for(Object element : list){
        //     System.out.println(element);
        //     continue;
        // }


        // Bar test = new Bar();
        // String[] array = {"Abc","aBc","abC"};
        // String string = test.appendChar(array);
        // System.out.println(string);

            // Bar test = new Bar();
            // short s = 10;
            // switch(test.select(s)){
            //     default:
            //     System.out.println("switch");
            // }

            // List<String> list= List.of("a","b");
            // for(String element : list){
            //     switch(element){
            //         case "b":break;
            //         default:
            //         continue;
            //     }
            //     System.out.println(element);
            // }
                // Bar b = new Bar();
                // b.k = b.i + b.j;
                // System.out.println(b.k);

            //
            //String format = datetime.format(DateTimeFormatter.ISO_DATE_TIME);

           // DateTimeFormatter formatter = DateTimeFormatter.ISO_LOCAL_DATE_TIME; 
  
            // create an LocalDateTime object and 
            // LocalDateTime lt = LocalDateTime.parse("2018-12-30t19:34:50"); 
            // LocalDate date = LocalDate.parse("2019-01-01");
            // LocalDate datenull = LocalDate.parse("adfa");
            // // print result 
            // System.out.println("LocalDateTime : "+ lt); 
            // System.out.println("LocalDate : "+ date); 
            // System.out.println(datenull);

         
            // boolean b = new StringBuilder("he").append("llo").equals(new StringBuilder("hello"));
            // System.out.println(b);

            // b=( new StringBuilder("hello"))==(new StringBuilder("hello"));
            // System.out.println(b);

            


       
    }
}