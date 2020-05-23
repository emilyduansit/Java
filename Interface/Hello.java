interface A
{
    int x=10;
    void methodOne();
}
interface B
{
    int x=20;
}
class Hello implements A,B
{
    public void methodOne(){
        System.out.println("A");
    }
    public static void main(String[] args) 
    {
       /* reference to x is ambiguous both variables are x
        * so we are using interface name to resolve the 
        * variable
        */
      
       System.out.println(A.x);
       System.out.println(B.x);
       
    }
}