class Foo{
    int f;

    static String str1= "Foo static field";
    String str2 = "Foo field";

    Foo(){
        System.out.println("f");
    }
    Foo(int f){
        this.f = f;
        System.out.println("f+i");
    }

    static void  staticprint()
    {
        System.out.println("Foo staitc print");
    }

    void  print()
    {
        System.out.println("Foo print");
    }

}



class Bar extends Foo{
    Bar(){
        System.out.println("bar");
    }

    Bar(int i){
        super(i);
        System.out.println("bar+i");
    }

    static int str1 = 1;
    boolean str2 = true;

    static void  staticprint()
    {
        System.out.println("Bar static print");
    }

    void print()
    {
        System.out.println("Bar print");
    }
}

public class test extends Bar{
    public static void main(String[] args) {
        Bar bar = new Bar(0);
       // System.out.println("bar ");
       bar.staticprint();
       bar.print();
       Foo foo = (Bar) bar;
       foo.staticprint();
       foo.print();


       Foo foo1 = new Bar();
       foo1.staticprint();
       foo1.print();

       Bar bar1= (Bar) foo1;
       bar1.staticprint();
       bar1.print();


       System.out.println(foo1.str1);
       System.out.println(foo1.str2);

       System.out.println(bar1.str1);
       System.out.println(bar1.str2);
    }
}

