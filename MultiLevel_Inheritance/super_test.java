class MM
{
    int i;
 
    public MM(int i)
    {
        this.i = i--;
        System.out.println("Class M i = "+i);
    }
}
 
class NN extends MM
{
    public NN(int i)
    {
        super(++i);
 
        System.out.println("Class N i = "+i);
    }
}
 
public class super_test
{
    public static void main(String[] args)
    {
        NN n = new NN(26);
    }
}