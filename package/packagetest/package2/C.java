package package2;
import pack1.A;

class C extends A
{
    void methodOfClassC()
    {
        System.out.println(i);        //Default field can be inherited within package 
 
        A a = new A();
        System.out.println(a.i);     //Default field can be used within the package
        a.methodOfClassA();          //Default method can be used within the package
        A.B b = new A.B();           //Default inner class can be used within the package
    }

    public static void main(String[] args) {
        C c = new C();
        c.methodOfClassC();
    }
}