import java.util.Scanner;

public class whileloops2 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        // String response="";

        // // Run the loop forever until the response is Q
        // while (!response.equals("Q")) {
        //     System.out.print("You are playing a game ");
        //     System.out.print("Press Q to quit: ");
        //     response=scanner.next().toUpperCase();
        // }
        // System.out.println("You have quit the game!");

        int age=0;

        System.out.print("Enter your age: ");
        age=scanner.nextInt();

        // What is someone enters a negative age? 
        while (age<0) {
            System.out.println("Your age can't be negative! ");
            System.out.print("Enter your age: ");
            age=scanner.nextInt();
        }
        // We will skip thr this while loop if the user enters invalid age ie in negative

        System.out.println("You are "+age+" Years old");

        // Theres also a avariation of while loop known as do while 
        scanner.close();
    }
}
