
import java.util.Scanner;
public class whileloops {
    public static void main(String[] args) {
        // While loops =repeat some code forever
        //              while some condition remains true

        Scanner scanner=new Scanner(System.in);
        String name="";

        // if (name.isEmpty()) {
        //     System.out.print("Enter your name:");
        //     name=scanner.nextLine();
        // }
        // System.out.print("Hello "+name);

        // Output  if user enters its name
        //Enter your name:pranav
        // Hello pranav

        // output if user dosent enters his name?
        // Enter your name:
        //Hello
        // To prevent user from preventing skipping the prompts
        // We use while loops

        while (name.isEmpty()) {
            System.out.print("Enter your name:");
            name=scanner.nextLine();
        }
        System.out.print("Hello "+name);
        // Run this code forever until the codition is not true(false)
        //This is useful but we should be cautious about one thing infinite loop!
        // for eg:

        while (1==1) {
            System.out.print("Help I'm stuck in a loop forever!");
        }
    }
}
