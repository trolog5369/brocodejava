
import java.util.Scanner;
public class substringuserinput2 {
        public static void main(String[] args) {
        // Suubstring()=A Method used to extract a portion of a a string
                        // .substring(start,end)

        
        Scanner scanner=new Scanner(System.in);
        String email;
        String username;
        String domain;


        System.out.print("Enter your email: ");
        

        email=scanner.nextLine();
        if (email.contains("@")) {
            
        username=email.substring(0,email.indexOf("@"));
        domain=email.substring(email.indexOf("@")+1); 
     
        System.out.println(username);
        System.out.println(domain);
        }
        else{
            System.out.println("Email must contain @");
        }



       scanner.close();
       
        
    }
}

