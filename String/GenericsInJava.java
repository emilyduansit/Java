import java.util.ArrayList;

public class GenericsInJava
{
    public static void main(String[] args)
    {
        ArrayList list = new ArrayList();
 
        list.add("JAVA");
 
        list.add(123);
 
        for (Object object : list)
        {
            //Below statement throws ClassCastException at run time
 
            String str = (String) object;       //Type casting
 
            System.out.println(str);
        }
    }
}


// public class GenericsInJava
// {
//     public static void main(String[] args)
//     {
//         ArrayList<String> list = new ArrayList<String>();
 
//         list.add("JAVA");
 
//     //  list.add(123);       Compile time error
 
//         for (String str : list)
//         {
//             //No type casting needed. ClasscastException Never occurs
 
//             System.out.println(str);
//         }
//     }
// }