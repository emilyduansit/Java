/**
 * There are two ways to create threads in java language.

1) By extending java.lang.Thread class.

2) By implementing java.lang.Runnable interface.
 */

///////////////////////////////////////block 1/////////////////
//Defining first thread with task
//The task of this thread is to print the numbers from 0 to 1000 times
// class Thread1 extends Thread
// {
//     @Override
//     public void run()
//     {
//         for(int i = 0; i <= 1000; i++)
//         {
//             System.out.println("thread1 "+i);
//         }
//     }
// }
 
// //Defining second thread with task
// //The task of this thread is to print the numbers from 1001 to 2000
// class Thread2 extends Thread
// {
//     @Override
//     public void run()
//     {
//         for(int i = 1001; i<= 2000; i++)
//         {
//             System.out.println("thread2 "+i);
//         }
//     }
// }
 
// public class ThreadsInJava
// {
//     //Main Thread
//     public static void main(String[] args)
//     {
//         //Creating first thread
//         Thread1 t1 = new Thread1();
//         t1.start();
 
//         //Creating second thread
//         Thread2 t2 = new Thread2();
//         t2.start();
//     }
// }



////////////////////////////////////////////block  2///////////
class MyThread implements Runnable
{
    @Override
    public void run()
    {
        //Task of this thread is to print multiplication of successive numbers up to 1000 numbers
        for(int i = 0; i < 1000; i++)
        {
            System.out.println(i+" * "+(i+1)+" = " + i * (i+1));
        }
    }
}
 
public class ThreadsInJava
{
    //Main Thread
    public static void main(String[] args)
    {
        MyThread myThread = new MyThread();    //instantiating your thread class that implements Runnable interface
 
        Thread t = new Thread(myThread);       //Creating an object to Thread class by passing your thread as an argument
 
        t.start();                            //Starting the thread
    }
}