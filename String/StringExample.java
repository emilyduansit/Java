import java.util.Arrays;

public class StringExample
{
    public static void main(String[] args)
    {
        String s1 = null;
 
        String s2 = null;
 
        // System.out.println(s1+s2);       //Output : nullnull
 
        // System.out.println("null"+"null");    //Output : nullnull
 
        // System.out.println(s1+"JAVA"+s2);     //Output : nullJAVAnull
 
    //  System.out.println(null+null);     //Compile Time Error

        String string = Arrays.toString(args);
        System.out.println(string);



    }
}