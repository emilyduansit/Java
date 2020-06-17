package package2;



class C extends pack1.A
{
    void methodOfClassC()
    {
        System.out.println(i);        //Default field can be inherited within package 
 
        pack1.A a = new pack1.A();
        System.out.println(a.i);     //Default field can be used within the package
        a.methodOfClassA();          //Default method can be used within the package
        pack1.A.B b = new pack1.A.B();           //Default inner class can be used within the package
    }

    

    public static void main(String[] args) {
       C c = new C();
       c.methodOfClassC();

        pack1.A a1= new pack1.A();
        a1.print();

        pack2.A a2 = new pack2.A();
        a2.print();
    }
}