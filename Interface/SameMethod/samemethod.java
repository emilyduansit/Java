package SameMethod;

interface Foo{
    String field = "Foo";
    void mymethod();
}

interface Bar{
    String field = "Bar";
    void mymethod(String str);
    void mymethod();
}




public class samemethod implements Foo, Bar {
    public void mymethod(){
        System.out.println(Bar.field);
    }

    public void mymethod(String s){
        System.out.println(s);
    }
    public static void main(String[] args) {
        samemethod test = new samemethod();
        test.mymethod();
    }
}