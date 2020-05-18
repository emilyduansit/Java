class A
{
    int i = 10;
    void disp(){
        System.out.println("class A i ="+i );
    }
    
}
 
class B extends A
{

    int i = 20;
    void disp(){
       System.out.println("class B i = "+i);      
    }


 
}
 
public class Test
{
    public static void main(final String[] args) {
        A obj = new B();      
        obj.disp();
        System.out.println("obj.i = "+obj.i);
    }
}