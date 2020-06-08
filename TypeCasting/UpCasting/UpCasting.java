package UpCasting;

 
public class UpCasting {
    public static void main(String[] args) {
        System.out.println("Program starts");
        System.out.println("Upcasting");
        C c1=new C();
        B b1=(B)c1;
        b1.test1();
        System.out.println("Auto upcasting");
        C cRef=new C();
        Sample3.run(cRef);
        System.out.println("Program ends");
         
    }
}
class A
{
    void test1()
    {
        System.out.println("Running test1()");
    }
}
class B extends A
{
    void test2()
    {
        System.out.println("Running test2()");
    }
}
class C extends B
{
    void test3()
    {
        System.out.println("Running test3()");
    }
}
class Sample3
{
    static void run(A aref)
    {
        System.out.println("Running run()");
        C cref=(C)aref;//downcasting
        cref.test1();
    }
}