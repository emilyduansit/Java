/**
 * static block only run once even there are many instances created.
 */

public class test {
    String base = "a";

    public test(){
        base = appendString(base,"b");
    }

    static{
        System.out.println("static");
    }

 
    {
        base = appendString(base, "c");
    }

    String text = appendString(base, "d");

    private String appendString(String base2, String string) {
        return base2+string;
    }

    public static void main(String[] args) {
       test test = new test();
       System.out.println(test.text);

       test test1 = new test();
       System.out.println(test1.text);
       test test2 = new test();
       System.out.println(test2.text);
   } 
}