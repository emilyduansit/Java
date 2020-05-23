package mypack;

class multiple{
    public  static int i;
    public  static int j;

}
public class myclass extends multiple{

    public static void seti(int a){
        i = a ;
    }
    public void add(){
        System.out.println("this is pack add = "+(i+j));
    }

    public void show(){
        System.out.println("this is package show");
    }

    public static void main(String[] args) {
        System.out.println("this is my package!");

        System.out.println("in package i ="+ i);

        System.out.println("in package i ="+ j);
    }
}

