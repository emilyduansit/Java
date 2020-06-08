class A
{
     int i;
     static int j;
 
     {
          System.out.println("First IIB Block");
     }
 
     {
          System.out.println("Second IIB Block");
     }
 
     A(int j)
     {
         // super();
         this();
          System.out.println("First Constructor");
     }
 
     A()
     {
          System.out.println("Second Constructor");
     }

     void print()
     {
          System.out.println("this j = "+this.j);
     }
}
 
class MainClass
{
     public static void main(String[] args)
     {
          A a = new A(50);
          a.print();
     }
}