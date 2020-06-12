import java.util.Arrays;
import java.util.List;

class A
{
    int i;
 
    public A(int i)
    {
        this.i = i;
    }
 
    //toString() method is not overrided.
    //So, it will return physical address of the object
}
 
class B
{
    int i;
 
    public B(int i)
    {
        this.i = i;
    }
 
    //Overriding toString() method
 
    @Override
    public String toString()
    {
        return "i = "+i;
    }
}
 
public class StringExample1
{
    public static void main(String[] args)
    {
        A a = new A(50);
 
        String s = "Java";
 
        //Concatenating a string object with A-type
 
        System.out.println(s+a);      //Output : Javastrings.A@42719c
 
        B b = new B(100);
 
        //Concatenating string object with B-type
 
        System.out.println(s+b);     //Output : Javai = 100

        String text = "this is it";
        int index = text.indexOf("is");
        text = text.substring(index+3);
        text = text.substring(1,5);
        System.out.println(text);

        String str ="\t";
        System.out.println(str.isEmpty());

        System.out.println("--------------");

        String s1 = "ja"+"va";
        String s2 = "java";

        System.out.println((s1==s2)+"      " + s1.equals(s2));//true true
        StringBuilder s3 = new StringBuilder("java");
        System.out.println(s3.toString()==s1);//false
        System.out.println(s3.toString().equals(s1));//true
        String s4 = new String("ja")+new String("va");
        String s5 = new String("java");
        System.out.println(s5.toString()==s4.toString());//false


        String string = "hey";
        StringBuilder builder = new StringBuilder(string);
        System.out.println(string.equals(builder)); //false
        System.out.println(string.contentEquals(builder));//true

        String string1 = String.join("-",new String[]{"a","b"});
        System.out.println(string1);
        String string2 = String.join("-","a","b");
        System.out.println(string2);
        String string3 = String.join("-",List.of("a","b"));
        System.out.println(string3);
        String string4 = String.join("-",new StringBuilder("a"),new StringBuilder("b"));
        System.out.println(string4);

        string = "1";
        switch(string)
        {
            case "1":break;
            case "a":
            default:
            System.out.println("default");
        }

        System.out.println("switch");

        int i,j;
        for( i=0,j=0;;++i,j--){
            if(i-j>10)
                break;
        }

        System.out.println("i= "+i+"j= "+j);


        string = Arrays.toString(args);
        System.out.println(string);


        Float i1= 2f;
        System.out.println(i1);


    }
}