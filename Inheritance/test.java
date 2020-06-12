class Foo{
    int f;
    Foo(){
        System.out.println("f");
    }
    Foo(int f){
        this.f = f;
        System.out.println("f+i");
    }

}



class Bar extends Foo{
    Bar(){
        System.out.println("bar");
    }

    Bar(int i){
        super(i);
        System.out.println("bar+i");
    }
}

public class test extends Bar{
    public static void main(String[] args) {
        Bar a = new Bar(0);
       // System.out.println("bar ");
    }
}

