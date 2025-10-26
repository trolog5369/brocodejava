
import java.util.Scanner;
public class logicaloperators2 {
    public static void main(String[] args) {
        // Logical operators used the user to check or modify more than on condition

        // &&==AND both condition must be true or code wont gets executed(we can evaluate multiple conditions)
        // ||=OR   any one  condition must be true or code wont gets executed
        // !=NOT  it inverse the statement 

        Scanner scanner=new Scanner(System.in);
        // Username must be in 4-12 characters
        // Username must not contain spaces or underscores

        // OR OPERATORS
        String username;
        System.out.print("Enter your new username: ");
        username=scanner.nextLine();

        if (username.length()<4||username.length()>12) {
            System.out.println("Username must be in between 4-12 characters!");
        }
        else if(username.contains(" ")||username.contains("_")){
            System.out.println("Username must not contains any spaces or underscores!");
        }
        else{
            System.out.println("Welcome "+username);
        }



        scanner.close();
    }
}
