import java.util.List;

// In Abstract class the static method can be invoked by an instance, better to use classname
// In Interface the static method can be invoked only by interface name.
//
//////////////////block 1//////////////////////////////////////
// interface Fooo {
//     String text = "text";
//     static void print(){
//         System.out.println(text);
//     }
// }
// public class staticinterface implements Fooo{
//     String text  = "staticinter";

//     public static void main(String[] args) {
//         Fooo f = new staticinterface();
//         f.print();              //compile err This static method of interface Fooo can only be accessed as Fooo.print
//         System.out.println(f.text);
//     }
// }



////////////////////////block 2 /////////////////////////////////////

class Fooo{
    static String text = "text";   //这里要加static
    static void print(){
        System.out.println(text);
    }  
}
public class staticinterface extends Fooo{
    
    String text = "staticinter";

    public static void main(String[] args) {
        Fooo f = new staticinterface();
        //f.print();              //这里可以用 
        Fooo.print();
        //System.out.println(f.text);
        System.out.println(Fooo.text);

       
        List<String> list = List.of();
        for(Object element : list)
            System.out.println(element);
        
    }
}