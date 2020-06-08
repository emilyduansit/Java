//Foo() 要么不写，写了就一定要加public,因为Foo有子类，生成子类对象的
//时候会nvoke Foo


package f;

public class Foo{
    //Foo(){}

    public void printMessage(){
        System.out.println("Foo");
    }

    protected Number getValue(Number number){
        return number;
    }
}