package pack1;
public class A
{
    protected static int i;

    
 
    public A()
    {
        //Constructor with default modifier
    }
 
    public void methodOfClassA()
    {
        //Method with default access modifier
        System.out.println(i);
        B b = new B();
    }
 
    public class B
    {
      //Inner Class with default access modifier
    }
}