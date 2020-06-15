import java.io.FileNotFoundException;
import java.io.IOException;

public class throwexample {
    public static void main(String[] args) {       
       
        try {
            throw new FileNotFoundException();
        }catch(IOException e){
           throw new RuntimeException(e);
        } 
        catch (Exception e) {
            System.out.println("Exception");
        }
    }
}