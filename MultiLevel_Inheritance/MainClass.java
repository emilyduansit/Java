class X11
{
    static
    {
        Y11.methodOfY();
    }
}
 
class Y11 extends X11
{
    static void methodOfY()
    {
        System.out.println("Hi....");
    }
}
 
public class MainClass
{
    public static void main(String[] args)
    {
        Y11.methodOfY();
    }
}