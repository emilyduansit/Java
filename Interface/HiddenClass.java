/**
 * It is a compile-time error if a static method hides an instance method.
 * if a method is static how to execute is determined by refrence type. left.
 * if a method is non-static by runtime type. right.
 * 
 * 
 */

class Super {
    protected static String myfield = "Super"; 
    static String greeting() { return "Goodnight  ";}//+myfield+" "+new Sub().myfiled; }
      String name() { return "Richard"; }
      String myfield(){ return myfield;      }
}
class Sub extends Super {
    public  String myfield = "Sub";
    static String greeting() { return "Hello ";}//+myfield; }
      String name() { return "Dick "; }
      String myfield(){ return myfield;}
}

public class HiddenClass {
    public static void main(String[] args) {
        Super s = new Sub();
        System.out.println(s.greeting() + ", " + s.name()+" , "+s.myfield());

        Sub s1 = new Sub();
        System.out.println(s1.greeting() + ", " + s1.name()+" , "+s1.myfield());

    }
}