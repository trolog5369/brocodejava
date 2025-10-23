
import java.util.Scanner;
public class substringuserinput {
        public static void main(String[] args) {
        // Suubstring()=A Method used to extract a portion of a a string
                        // .substring(start,end)
        // As we are determining the domain and username by manually we can do it automatically 
        // using the string method we are going to use the indexOf()
        // see substring.java for the previous
        
        Scanner scanner=new Scanner(System.in);
        String email;
        String username;
        String domain;


        System.out.print("Enter your email: ");
        

        email=scanner.nextLine();
        username=email.substring(0,email.indexOf("@"));
        domain=email.substring(email.indexOf("@")+1); 
     
        
        System.out.println(username);
        System.out.println(domain);
 
       scanner.close();

    //   If we want to check if the email is valid then we just have to introduce a if else block
    //  see substringuserinput2.java
       
        
    }
}
