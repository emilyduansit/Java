class SuperClassOne
{    
    SuperClassOne()
    {       
        System.out.println("First Constructor Super Class");
    }
    void methodOne()
    {
        System.out.println("From Super Class");
    }
}
 
class SubClassOne extends SuperClassOne
{
    int i;
    SubClassOne()
    {
        super();
        System.out.println("constructors Sub Class");
        
        //compile time error
        //super() calling statement must be first statement in constructor
    }
    SubClassOne(int i)
    {
        this();
        this.i = i;
    }

    void methodTwo()
    {
        System.out.println("constructors Sub Class i = "+i);
        //compile time error
        //you should call super() and this()
        //calling statements only in constructors.
    }

    public static void main(String[] args) {
        SubClassOne a = new SubClassOne(10);
        a.methodOne();
        a.methodTwo();
    }
}