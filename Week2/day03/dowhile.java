
import java.util.Scanner;
public class dowhile {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);


        int age=0;

        // while loop 
        // What is someone enters a negative age? 
        // while (age<0) {
        //     System.out.println("Your age can't be negative! ");
        //     System.out.print("Enter your age: ");
        //     age=scanner.nextInt();
        // }
        // // We will skip thr this while loop if the user enters invalid age ie in negative
        // System.out.println("You are "+age+" Years old");

        // Theres is a variation of while loop ie do while loop!
          do {
            System.out.println("Your age can't be negative! ");
            System.out.print("Enter your age: ");
            age=scanner.nextInt();
        }while(age<0);

        // Output
        // Your age can't be negative! 
        // Enter your age: 

        // Standard while loop= you may not enter the condition if condition is false!
        // do while loop= you will enter the condition atleast once isnt if its false!


        scanner.close();
    }
}
  

