class AA
{
    static String s = "AAA";
 
    static
    {
        s = s + "BBB";
        System.out.println("class AA static s="+s);
    }
 
    {
        s = "AAABBB";
        System.out.println("class AA non-static s="+s);
    }
}
 
class BB extends AA
{
    static
    {
        s = s + "BBBAAA";
        System.out.println("class BB static s="+s);
    }
 
    {
        System.out.println(s);
        System.out.println("class BB non-static s="+s);
    }
}
 
public class extend1
{
    public static void main(String[] args)
    {
        BB b = new BB();
    }
}