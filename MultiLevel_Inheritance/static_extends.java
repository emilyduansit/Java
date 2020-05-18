class X_C
{
    static void staticMethod()
    {
        System.out.println("Class X");
    }
}
 
class Y_C extends X_C
{
    static void staticMethod()
    {
        System.out.println("Class Y");
    }
}
 
public class static_extends
{
    public static void main(String[] args)
    {
        Y_C.staticMethod();
    }
}
