package test2;



import java.util.ArrayList;
import java.util.List;

import javax.lang.model.util.Elements.Origin;

import java.util.Iterator;

import test1.Test;
//import test1.Test;

interface Foointerface{
    void mymethod();
}

class Foo implements Foointerface{

    public void mymethod(){
        System.out.println("adfadf");
    }

    protected int i = 0;

    Foo(){
        System.out.println("Foo");
    }

    protected static Number getValue(Number number) {
        System.out.println("Fooo getValue");
        return number;
    }
}

class Foo1 extends Foo {
    int i = 1;
    // public static Integer getValue(Integer number) {
    //     System.out.println("Foo1 getValue");
    //     return number;
    // }

    // Foo1(){
       
    //     System.out.println("Foo1");
    //     super();
        
    // }

    public  Number getValue(Number number){
    System.out.println("Foo1 getValue");
    return number;
    }
}

public class Bar extends Test {
    // Bar(String a){
    // System.out.println("bar"+a);

    // }
    static String text = "adf";

    public static void main(String[] args) {

        // Test a = new Bar();
        // System.out.println("Bar");

        // List string = new ArrayList<>(List.of("a","b"));
        // System.out.println(string);

        // Iterator it = string.listIterator(0);
        // string.set(1,"c");

        // System.out.println(string);
        // while(it.hasNext()){
        // System.out.println(it.next());
        // }

        // String string = String.join("-",new String[] {"a","b"});
        // System.out.println(string);

        Foo a = new Foo1();
        a.getValue(10);
        // Foo1 b = (Foo1)a;
        // System.out.println(b.getValue(9).toString());
        // System.out.println(b.i);

        // List original = new ArrayList<>();
        // original.addAll(List.of("A"));
        // original.add(1,"c");
        // original.add(2,"B");

        // System.out.println(original);
    //    original.add(null);

      //  List copy = List.copyOf(original);
      //  System.out.println(copy.get(0));

        /****************************************************** */
        // String text = "zxv";
        // if(text.equals("adf")){
        //      text = "123";
        // }
        // else{
        //      text = "456";
        // }

        // System.out.println(text);

        // System.out.println((long)1.8);

        //int result = 1.2f;

    //     String[] arrayexample = new String[2];
    //     arrayexample[1] = "zxcv";
    //  //   System.out.println(arrayexample[0].concat(arrayexample[1]));
    //     System.out.println(arrayexample[0]+arrayexample[1]);


    }
    
}