package AutoCasting;
/*Auto-Up Casting is used to change the type of object from sub class type to super class type. 
i.e an object of sub class type is automatically converted to an object of super class type.  */
class A
{
    int i = 10;
    
    void show(){
        System.out.println("A i = "+ i);
    }
}
 
class B extends A
{
    int j = 20;
    void show(){
        System.out.println("B i = "+ i);
        System.out.println("B j = "+ j);
    }
}
 
class C extends B
{
    int k = 30;
    void show(){
        System.out.println("C i = "+ i);
        System.out.println("C j = "+ j);   
        System.out.println("C k = "+ k);      
    }
}
 
class D extends C
{
    int m = 40;
    void show(){
        System.out.println("D i = "+ i);
        System.out.println("D j = "+ j);   
        System.out.println("D k = "+ k);  
        System.out.println("D m = "+ m);                   
    }
}
 
public class AutoCating
{
    public static void main(String[] args)
    {
    //     D d = new D();
    //     d.show();
    //     C c = d;       // D type object is Auto-Up Casted to C type
    //     c.show();
    //   //  B b = d;      // D type object is Auto-Up Casted to B type
    //   //  C c1 = new C();
    //   //  A a = c1;    // C type object is Auto-Up Casted to A type
    //   //  A a1 = new B(); // B type object is Auto-Up Casted to A type
    A a = new A();
    //B b = (B) a;   //A type is explicitly downcasted to B type
    }
}