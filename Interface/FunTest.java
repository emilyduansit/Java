
// 功能性接口里只能有一个抽象方法

interface MyInterface{
    
    boolean m(Integer i1, Integer i2);
}


public class FunTest {


    public static void main(String[] args) {
        MyInterface fun = (i1,i2)->i1>i2;
        System.out.println(fun.m(2,1));
    }
}