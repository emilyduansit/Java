class X1
{
    int m = 1111;
 
    {
        m = m++;
 
        System.out.println("class X1 m = "+m);
    }
}
 
class Y1 extends X1
{
    {
        System.out.println("class Y1 m = "+m);
    }
 
    int methodOfY()
    {
        return m-- + --m;
    }

    {
        System.out.println("class Y1 "+ methodOfY());
    }
}
 
public class test1
{
    public static void main(String[] args)
    {
        Y1 y = new Y1();
    }
}