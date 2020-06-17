import java.io.FileNotFoundException;
import java.io.IOException;

/*
1.runtime exception打印错误信息要在程序结束的最后。见block1
2.if catch 有几个从上往下找到一个就跳出循环了，不会继续找，见block2
3.IOException是checked exception，如果被抛出就要有catch 或者 throws。 method B和main
都是。见block3

*/

public class Test {
    String convertToUpperCase(String input){
        return input.toUpperCase();
    }

    void methodA() throws FileNotFoundException{
        throw new RuntimeException();
    }

    void methodB() throws NullPointerException{
        try{
        throw new IOException();
        }catch(IOException e){
            System.out.println("adf");
        }
    }

    void methodC() throws IOException{
        methodA();
        methodB();
    }
    public static void main(String[] args) throws IOException{
        //block 1
        // try{
        //     Test test = new Test();
        //     String text = test.convertToUpperCase(null);
        //     System.out.println(text);
        // }catch(Exception e){
        //     try{
        //         if(e instanceof RuntimeException)
        //         throw e;
        //     }
        //     finally{
        //         System.out.println("inner");
        //     }            
        // }
        // finally{
        //     System.out.println("outer");
        // }

        //block2
    //   try{
    //     Test test = new Test();
    //     String text = test.convertToUpperCase(null);
    //     System.out.println(text);
    //   }catch(NullPointerException e){
    //       System.out.println("NULLPONITER");
    //   }catch(Exception e){
    //       System.out.println("exception");
    //   }finally{
    //       System.out.println("finally");
    //   }

    //    block 3

        Test test = new Test();
        test.methodC();


 

                
            


    }


    
}