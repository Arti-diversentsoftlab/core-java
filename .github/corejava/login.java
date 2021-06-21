  
import java.io.Console;

public class login {

    public void passwordExample() {    
String em="aaru@gmail.com"    ;
String pass="123456";
        Console console = System.console();
        if (console == null) {
            System.out.println("console not found");
            System.exit(0);
        }
        String email=console.readLine("Enter your email:");
               char[] passArray = console.readPassword("Enter your password: ");
        String s = String. valueOf(passArray);
         if(s.equals(pass)&&email.equals(em)){
System.out.println("login successfully..");
               }else{
       System.out.println("invalid user...");
        }
    }

    public static void main(String[] args) {
        new login().passwordExample();
    }
}
