package pack1;
class A
{
    int i;
 
    A()
    {
        //Constructor with default modifier
    }
 
    void methodOfClassA()
    {
        //Method with default access modifier
        System.out.println(i);
        B b = new B();
    }
 
    class B
    {
      //Inner Class with default access modifier
    }
}