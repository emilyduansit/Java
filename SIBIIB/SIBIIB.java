class A
{
    static int i = init();

    int j = localinit();
 
    static
    {
        System.out.println("Class A SIB");
    }
 
    {
        System.out.println("Class A IIB");
    }
 
    A(int i)
    {
        System.out.println("Class A Constructor i="+i);
    }

    static int init()
    {
        i= 10;
        System.out.println("Class A static init");
        return 11;
    }

    int localinit()
    {
        j = 20;
        System.out.println("Class A local init");
        return j;
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
 
class SIBIIB
{
    public static void main(String[] args)
    {
        B b = new B();
    }
}