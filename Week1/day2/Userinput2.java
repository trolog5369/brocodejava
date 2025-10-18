
import java.util.Scanner;;
public class Userinput2 {
    public static void main(String[] args) {
        //there are some issues regarding accepting the integar string and double using the scanner class
        // check Userinput1 for ref ie starting
        // Common issues

        // Scanner scanner=new Scanner(System.in);

        // System.out.print("Enter your age: ");
        // int age=scanner.nextInt();

        // System.out.print("Enter your favourite colour: ");
        // String colour=scanner.nextLine();

        // System.out.println("You are "+age+" Year old");
        // System.out.println("You like the colour "+colour);

//Enter your age: 15
// Enter your favourite colour: You are 15 Year old
// // You like the colour
// why is the output like this and not taking colour as input
// beacuse when we hit enter after enntering age 25 theres a /n(new line) 
// which gets picked as a colour by the compiler hence the output
// This is a common prb in java as we used int,double and string we gotta get rid of this new line char(/n)

// We can do by just calling Scanner.nextline() method before accepting the string ie newline char

   Scanner scanner=new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age=scanner.nextInt();
        scanner.nextLine();//This line solves the prb ie of newline char ie input buffer

        System.out.print("Enter your favourite colour: ");
        String colour=scanner.nextLine();

        System.out.println("You are "+age+" Year old");
        System.out.println("You like the colour "+colour);


// Output now:
// Enter your age: 25
// Enter your favourite colour: red
// You are 25 Year old
// You like the colour red


        scanner.close();
        
    }
}
