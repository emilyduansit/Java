/**
 * default constructor invoke by top-down. 
 * 
 * 
 */

class ParentClass{
    //Parent class constructor
    ParentClass(){
     System.out.println("Constructor of Parent");
    }
    void disp(){
     System.out.println("Parent Method");
    }
 }

 class Example_Inherit extends ParentClass{
    Example_Inherit(){     
     System.out.println("Constructor of Child");
    }
    void disp(){
     System.out.println("Child Method");
         //Calling the disp() method of parent class
     super.disp();
    }
    public static void main(String args[]){
     //Creating the object of child class
     Example_Inherit obj = new Example_Inherit();
     obj.disp();
    }
 }