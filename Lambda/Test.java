import java.util.Arrays;
import java.util.List;

interface Foo{
    boolean mymethod(String arg1, Integer arg2);
}
public class Test {
    public static void main(String[] args) {
        
        String[] a1={"a","b"};
        String[] a2={"a"};

        System.out.println(Arrays.mismatch(a2, a1));

 

        Foo foo = (arg1, arg2) ->{return arg2.toString().equals(arg1);};
        boolean result =foo.mymethod("123",100);
        System.out.println(result); 
    } 
}