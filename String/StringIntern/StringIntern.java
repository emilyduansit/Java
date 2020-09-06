package StringIntern;
public class StringIntern{
    public static void main(String[] args) {          
        String s1 = "Javapoint";  
        String s2 = s1.intern();  
        String s3 = new String("Javapoint");  
        String s4 = s3.intern();  
        String s5 = new String("Javapoint");       
        System.out.println(s1==s2); // True  
        System.out.println(s1==s3); // False  
        System.out.println(s1==s4); // True       
        System.out.println(s2==s3); // False  
        System.out.println(s2==s4); // True        
        System.out.println(s3==s4); // False 
        System.out.println(s3==s5); // False   

 
        
        
        String s = "";
        char[] array1={'J','a','v','a','p','o','i','n','t'};
        for(char element : array1){
            s+=element;
        }

        System.out.println(s);
        System.out.println(s.equals(s3));  //true
        System.out.println(s.toString().equals(s3));//true
        System.out.println(s.equals(s1));//true
        System.out.println(s==s1); //false
        System.out.println(s==s3); //false


        s = null;
        String[] array2={"J","a","v","a","p","o","i","n","t"};
        for(String element : array2){
            s += element;
        }

        System.out.println(s);

        System.out.println(s==s1); //false
        System.out.println(s.equals(s1));//false



    }  
  
}