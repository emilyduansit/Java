class M1
{
    int i = 51;
 
    public M1(int j)
    {
        System.out.println(i);
 
        this.i = j * 10;
    }
}
 
class N1 extends M1
{
    public N1(int j)
    {
        super(j);
 
        System.out.println(i);
 
        this.i = j * 20;
    }
}
 
public class extend
{
    public static void main(String[] args)
    {
        N1 n = new N1(26);
 
        System.out.println(n.i);
    }
}