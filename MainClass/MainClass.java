class A
{
    int i;
 
    static
    {
        System.out.println("Class A SIB");
    }
 
    {
        System.out.println("Class A IIB");
    }
 
    A(int i)
    {
        System.out.println("Class A Constructor");
    }
}
 
class B extends A
{
    int j;

    public B()
    {
        super(10);     //Explicitly Calling Class A constructor
        System.out.println("Class B Constructor");
    }
}
 
class MainClass
{
    public static void main(String[] args)
    {
        B b = new B();
    }
}