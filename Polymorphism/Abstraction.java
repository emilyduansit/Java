abstract class AbstractClass
{
    abstract void abstractMethod();
    String abstractMethod(int  i){
        return "abstract";
    }
}
 
class ConcreteClass extends AbstractClass
{
    void abstractMethod()
    {
        System.out.println("Abstract Method");
    }
}
 
public class Abstraction
{
    public static void main(String[] args)
    {
        //AbstractClass A = new AbstractClass();  Can't create objects to Abstract class
        ConcreteClass C = new ConcreteClass();
        //ConcreteClass implements abstract method,
        //so we can create object to ConcreteClass
        AbstractClass A1 = C;
        //ConcreteClass object is auto-upcasted to AbsractClass
        C.abstractMethod();
        
    }
}