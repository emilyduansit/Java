public class StaticVariable2 {
    static int count=0;
   public void increment()
   {
       count++;
       System.out.println("count = "+count);
   }
   public static void main(String args[])
   {
    StaticVariable2 obj1=new StaticVariable2();
    obj1.increment();
    StaticVariable2 obj2=new StaticVariable2();
   
    obj2.increment();
    System.out.println("Obj1: count is="+obj1.count);
    System.out.println("Obj2: count is="+obj2.count);
   }
}