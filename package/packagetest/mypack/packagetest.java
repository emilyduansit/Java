package mypack;

 public class packagetest{
     static int i;
     {
         i=10;
     }
     public static void add()
    {
        System.out.println("test add");
    }

    public void show()
    {
        System.out.println("package i="+i);
    }

}

// class test {
//     public static void main(String[] args)
//     {
//         packagetest.add();
//         packagetest a = new  packagetest();
//         a.show();

//     }
// }