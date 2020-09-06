 

public class Stringloop {

        public static String search(String[] arr, String val)
        {
            for(String i:arr)
            {
                if(i.equals(val))
                return i;
            }
            return "-1";
        }

        public static void main(String[] args) {

            String[] anArray;

            
            anArray = new String[4];              
           
            anArray[0] = "100";            
            anArray[1] = "200";           
            anArray[2] = "300";
            anArray[3] = "400";

            System.out.println(search(anArray,"500"));
            
        }


        
}