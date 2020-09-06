//static fields and static methods are not polimorphic.
//that means we can hide but not override.
//when hiding happened the memebers of objects are accessed by the refrence type of compling time.
//see staticmethod()

class StaticComponents
{
      static int staticVariable;
 
     static
     {
          System.out.println("StaticComponents SIB");
          staticVariable = 10;
     }
 
     public static  void staticMethod()
     {
          System.out.println("From StaticMethod");
          System.out.println(staticVariable);
     }
}

class SubStaticComponents extends StaticComponents
{
     int  staticVariable;
     public static void staticMethod()
     {
          System.out.println("SubStaticComponents");
     }
}
 


class MainClass
{
     static
     {
          System.out.println("MainClass SIB");
     }
 
     public static void main(String[] args)
     {
         //Static Members directly accessed with Class Name
          StaticComponents.staticVariable = 20;
          StaticComponents.staticMethod();

          StaticComponents s = new SubStaticComponents();
          s.staticMethod();
          s.staticVariable =10;
  
     }
}
