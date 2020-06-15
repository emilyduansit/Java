interface Foo{
     int number = 0;
     void mymethod();
}

abstract class Bar{

}

public class Test extends Bar implements Foo {
    int number = 1;

  
    public void mymethod()
    {
        System.out.println("test");
        
    }
    public static void main(String[] args) {
        Foo test = new Test();
        test.mymethod();
        System.out.println("Foo.number "+Foo.number);
        System.out.println("test.number"+ test.number);

        Test test1 = new Test();
        Foo test2 = test1;
        System.out.println("test1 "+test1.number);
        System.out.println("test2 "+test2.number);
    }
}