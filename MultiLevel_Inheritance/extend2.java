class XX
{
    int i = 1000;
 
    public XX()
    {
        i = 2000;
    }
 
    static int staticMethod(int i)
    {
        return --i;
    }
}
 
class YY extends XX
{
    public YY()
    {
        System.out.println(staticMethod(i));
    }
}
 
public class extend2
{
    public static void main(String[] args)
    {
        YY y = new YY();
    }
}
