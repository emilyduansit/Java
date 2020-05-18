

class AClass
{
    String s = "Class A";
}
 
class BClass extends AClass
{
    String s = "Class B";
 
    {
        System.out.println(super.s);
    }
}
class CClass extends BClass
{
    String s = "Class C";
    {
        System.out.println(super.s);
    }
}
 

 
public class MainClass
{
    public static void main(String[] args)
    {
        CClass c = new CClass();
 
        System.out.println(c.s);
    }
}
