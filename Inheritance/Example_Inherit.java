/**
 * default constructor invoke by top-down. 
 * 1.子类的构造函数会触发父类的构造函数。
 * 2.子类的有参数和无参数构造函数触发的都是父类的无参数构造函数。
 * 3.在构造函数里面，super，this必须用在第一句话。
 * 4.在非构造函数里，super,this 可以用在和人位置。
 * 5.如果父类有一个函数被子类继承，override， 这两个函数都是non-static可以，都是static也可以（这种不是override,是hide），不能一个是一个不是。
 * 6.两个都是static,子类对象运行的还是子类的方法。
 * 7.static 对于父类和所有的子类用的都是用一份copy,无论是用class.staticvariable 还是object.variabale 都可以access,对static的改变影响父类和所有的子类。
 * 
 * 
 * Hiding Fields
 Within a class, a field that has the same name as a field in the superclass hides the superclass's field, even if their types are 
 different. Within the subclass, the field in the superclass cannot be referenced by its simple name. Instead, the field must be
  accessed through super, which is covered in the next section. Generally speaking, we don't recommend hiding fields as it makes 
  code difficult to read.
 
 
 
 
 
 
 */

class ParentClass{
    // Parent class constructor
    static int i = 1;
    ParentClass(){
     System.out.println("Constructor of Parent");
    }
    ParentClass(String arg){
        System.out.println("Constructor of Parent arg "+arg);
       }
    void disp(){
     System.out.println("Parent Method");
    }

    void  print()
    {
        System.out.println("parent class print");
    }
 
}
 class Example_Inherit extends ParentClass{
     static int i =2;
    Example_Inherit(){  
    //super();      
    System.out.println("Constructor of Child");
    }
    Example_Inherit(String arg){   
        //super(arg);  
        System.out.println("Constructor of Child arg "+arg);
       }
    void disp(){
     System.out.println("Child Method");
         //Calling the disp() method of parent class
     super.disp();
    }

    void  print()
    {
        System.out.println("children print");
    }
    public static void main(String args[]){
     //Creating the object of child class
    //  Example_Inherit obj = new Example_Inherit();
    //  Example_Inherit obj1 = new Example_Inherit("avc");

     ParentClass obj1 = new Example_Inherit();     
     //obj1.print();
     System.out.println(obj1.i);
     //obj.disp();
     //obj1.disp();
    }
 }
