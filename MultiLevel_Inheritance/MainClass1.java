class X111
{
    static
    {
        Y111.methodOfY();
    }
}
 
class Y111 extends X111
{
    static void methodOfY()
    {
        System.out.println("Hi....");
    }
}
 
public class MainClass1
{
    public static void main(String[] args)
    {
        Y111.methodOfY();
    }
}