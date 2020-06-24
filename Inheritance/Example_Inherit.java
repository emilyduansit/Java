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
        System.out.println("Constructor of Child this.i="+this.i+" super.i="+super.i);
        }
        Example_Inherit(String arg){   
            //super(arg);  
            System.out.println("Constructor of Child arg "+arg);
        }
        void disp(){
            super.disp();
            System.out.println("Child Method");
            //Calling the disp() method of parent class        
        }

        void print()
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

