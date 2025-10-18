
import java.util.Scanner;
public class Userinput {
    public static void main(String[] args) {
        // User input in java we use Scanner (class)
        // to actually use a Scanner we import it using the package
        // java.util.Scanner;
        Scanner scanner=new Scanner(System.in);
        // scanner is an object of the Scanner class we created

        System.out.print("Enter your name: ");
        String name=scanner.nextLine();
        //  nextLine() method is a method in scanner which reads the string of characters including spaces
        // for without including any spaces we use next() method 

        // for reading an integar use nextint()
        System.out.print("Enter your age ");
        int age=scanner.nextInt(); 

        // for reading a double(decimal)
        System.out.print("Whats your gpa");
        double gpa=scanner.nextDouble();

        // for reading a boolean
        System.out.print("Are you a Student?(true/false): ");
        boolean isStudent=scanner.nextBoolean();

        System.out.println("hello "+name);
        System.out.println("You are "+age+" years old");
        System.out.println("Your gpa is "+gpa);
        // System.out.println("Student: "+isStudent);

        if (isStudent) {
            System.out.println("You're enrolled as a student");
        }
        else{
            System.out.println("You're not enrolled as a student");

        }

      
        scanner.close();//after the logic close scanner object or it will lead to unexpected outputs
        //there are some issues regarding accepting the integar string and double using the scanner class
        // check Userinput2 for this

        // Its a good pratice to close the scanner too hence close it
    }
}
