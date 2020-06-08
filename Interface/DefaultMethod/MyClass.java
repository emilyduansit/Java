/*
Three Rules To Solve Diamond Problem
In Java, a class can extend only one class but can implement multiple interfaces. With the introduction of default methods,
 it is possible that your class inherit multiple methods with same signature. In such scenarios, to solve the conflict,
  Java 8 specifies 3 rules to follow.

Rule 1 : Select classes over interfaces
If your class inherit multiple methods with same signature then a method from super class is selected
 (Remember a class can inherit only one class).

 Rule 2 : Select most specific interfaces than general interfaces.
 If your class doesn’t extend any class and inherit multiple methods with same signature from multiple 
 interfaces which belong to same hierarchy, then a method from most specific interface is selected
  (If interface X extends Y then X is more specific than Y).

  Rule 3 : InterfaceName.super.methodName()

  If your class doesn’t extend any class and inherit multiple methods with same signature from multiple 
  interfaces which doesn’t belong to same hierarchy, then override that method and from within body explicitly 
  call desired method as InterfaceName.super.methodName().
*/
package DefaultMethod;

interface InterfaceOne
{
    default void anyMethod()
    {
        System.out.println("Hi... From Interface One");
    }
}
 
interface InterfaceTwo 
{
    default void anyMethod() 
    {
        System.out.println("Hi... From Interface Two");
    }
}
 
public class MyClass implements InterfaceOne, InterfaceTwo
{
    @Override
    public void anyMethod()
    {
        InterfaceTwo.super.anyMethod();
    }
     
    public static void main(String[] args) 
    {
        new MyClass().anyMethod();
    }
}