package TypeCasting;

public class casting {
    void method(long...arg){
        System.out.println("method a");
    }

    void method(float arg){
        System.out.println("method b");
    }

    void method(Integer arg)
    {
        System.out.println("mehtod c");
    }



    // int getnumber()    //compile error Duplicate method getnumber() in type casting
    // {
    //     return 0;
    // }

    // float getnumber()
    // {
    //     return 1;
    // }
    
    public static void main(String[] args) {
        int number = 'a';
        casting c = new casting();
        c.method(number);


        // long i= c.getnumber();
        // double j = c.getnumber();
        // System.out.println(i+j);
    }
}