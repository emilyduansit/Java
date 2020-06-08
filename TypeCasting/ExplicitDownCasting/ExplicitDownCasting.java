package ExplicitDownCasting;

class A
{
    int i = 10;
    A()
    {
        System.out.println("A ");
    }
}
 
class B extends A
{
    int j = 20;
    B()
    {
        System.out.println("B ");
    }
}
 
class C extends B
{
    C()
    {
        System.out.println("C ");
    }
    int k = 30;
}
 
class D extends C
{
    int m = 40;
    D()
    {
        System.out.println("D ");
    }
}
 
public class ExplicitDownCasting
{
    public static void main(String[] args)
    {
        A a = new A();
        // B b = (B) a;   //A type is explicitly downcasted to B type
        // C c = (C) a;   //A type is explicitly downcasted to C type
        // D d = (D) a;   //A type is explicitly downcasted to D type
        // B b1 = new B();
        // D d1 = (D) b1;  //B type is explicitly downcasted to D type
        // d1 = (D) new C();  //C type is explicitly downcasted to D type
    }
}