import java.io.InputStream;
import java.util.Scanner;

public class ConsiderReturnValueOfMethod {
    
    public static void main(String[] args) {}
    public String getMessage(){
        Scanner input = new Scanner(System.in);
        //InputStream is = System.in;
        
        String message;
        System.out.println("Birthday:");
        message = input.next();
        // is.read();
        is.close();
        input.close();
        return message;
    }
    
}
