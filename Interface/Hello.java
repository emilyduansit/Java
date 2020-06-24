import java.util.Arrays;
import java.util.List;

/*
接口里面的方法缺省都是public 和 abstract
如果在已知的接口里加一个方法，那么所有implement 这个接口的subclass都要写这个方法。
这就有了default方法和static方法。
这两个方法在接口里都是concrete，有实体的。subclass自动继承了这个方法。如果subclass并不想要这个方法，可以abstract这个方法，
或者override这个方法。




 */





interface A
{
    int x=10;
    void methodOne();
    
}
interface B
{
    int x=20;
    
}

interface C extends A
{
    int x = 30;
 
   
}
class Hello implements A,B,C
{
    public void methodOne(){
        System.out.println("A");
    }

    
    public static void main(String[] args) 
    {
       /* reference to x is ambiguous both variables are x
        * so we are using interface name to resolve the 
        * variable
        */
      
       System.out.println(A.x);
       System.out.println(B.x);
       System.out.println(C.x);

    //    Integer[] a={1,2,3};
    //    List<Integer> list=Arrays.asList(a);
    //    System.out.println("list :" + list);

    //    list.set(0, 4);
    //    System.out.println("list :"+ list);
    //    System.out.println("array : "+Arrays.toString(a));

    //    list.add((Integer)4);                     compile error
    //    System.out.println("list :"+ list);
    //    System.out.println("array : "+Arrays.toString(a));     

    
      
    }
}