/*
From Java 8, interfaces can also have static methods. Static methods are also concrete methods but they can’t be implemented.
1.一个子类继承了接口，子类override原来的抽象函数时候不能加static.加了会报编译错误。
2.接口中原有的static方法，不能被重写，default方法可以重写。



 */

package DefaultMethod;

interface InterfaceWithDefaultAndStaticMethod
{
    void abstractMethod();           //Abstract Method
     
    default void defaultMethod()
    {
        System.out.println("It is a default method");
    }
     
    static void staticMethod()
    {
        System.out.println("It is a static method");
    }
}
 
class AnyClass implements InterfaceWithDefaultAndStaticMethod
{
    @Override
    public void abstractMethod() 
    {
        System.out.println("Abstract Method implemented");
    }
     
    //No need to implement defaultMethod()
     
    //Can't implement staticMethod()
    public static void main(String[] args) {
        
    }
}