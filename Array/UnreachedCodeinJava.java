public class UnreachedCodeinJava {
    static void UnreachableCode_method(boolean b)
    {
        System.out.println("Reachable Statement");
 
        // while(true)
        // {
        //     return;
        // }
 
        // System.out.println("Unreachable Statement");     //Compile Time Error

        // if(true)
        // {
        //     return;
        // }
 
        // System.out.println("Unreachable Statement");     //Dead Code


        System.out.println("Reachable Statement");
 
        return;
 
     //   System.out.println("Unreachable Statement");     //Compile Time Error
    }
}