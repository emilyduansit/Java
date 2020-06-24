package UpCasting;



public class UpCasting {

   
    public static void main(String[] args) {
   


        System.out.println("Program starts");
        System.out.println("Upcasting");
        C c1=new C();
        c1.test();//test C
        System.out.println(c1.myfield);
        B b1=(B)c1;
        b1.test();//test C
        System.out.println(b1.myfield);
        A a1=(A)b1;
        a1.test();
        System.out.println(a1.myfield);
        System.out.println("Auto upcasting");
        C cRef=new C();
        Sample3.run(cRef);
        System.out.println("Program ends");
         
    }
}
class A
{
    String myfield = "Class A";
    void test()
    {
        System.out.println("Running test A()");
    }
}
class B extends A
{
    String myfield = "Class B";
    void test()
    {
        System.out.println("Running test B()");
    }
}
class C extends B
{
    String myfield = "Class C";
    void test()
    {
        System.out.println("Running test C()");
    }
}
class Sample3
{
    static void run(A aref)
    {
        System.out.println("Running run()");
        C cref=(C)aref;//downcasting
        cref.test();
    }
}