public class StaticVariable{
     static int age;
     static String name;

    // This is a Static Method
    public static void  disp() {
        System.out.println("Age is: " + age);
        System.out.println("Name is: " + name);
    }

    // This is also a static method
    public static void main(String args[]) {
      StaticVariable emp = new StaticVariable();
      emp.age = 30;
	  emp.name = "Steve";
      emp.disp();

      StaticVariable emp1 = new StaticVariable();
      emp1.age = 2;
	  emp1.name = "as";
      emp1.disp();

      System.out.println("emp: "+emp.age ); 
      System.out.println("emp1: "+emp1.age ); 
      
      System.out.println("emp: "+emp.name ); 
      System.out.println("emp1: "+emp1.name ); 
      
      emp.disp();

  
  }
}