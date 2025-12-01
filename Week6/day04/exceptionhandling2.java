
import java.util.InputMismatchException;
import java.util.Scanner;
public class exceptionhandling2 {
    public static void main(String[] args) {
        // Exception=An event that interrupts the normal flow of a program
        //           (Dividing by zero,file not found,mismatch input type)
        //           Surround any dangerous code with a try{} block
        //           try{}, catch{}, finally{}

        Scanner scanner=new Scanner(System.in);
        // We can have more than one catch{}

        try{
            System.out.print("Enter a number: ");
            int number=scanner.nextInt();
            System.out.println(number);
        }
        // This is a try{} block which is used to determine the exception

        catch(InputMismatchException e){
            System.out.println("That wasn't a number");
        }
        // This is  a catch{} block which catches the execption and address it for InputMismatchException

        catch(ArithmeticException e){
            System.out.println("YOU CAN'T DIVIDE BY ZERO!");
        }
        // This is  a catch{} block which catches the execption and address it for ArithmeticException

        catch(Exception e){
            // SAFETY NET
            System.out.println("Something went wrong!");
        }
        // This is a else catch{}
        // it catch-all for ANY exception type that you didn’t handle earlier.

        finally{
            scanner.close();
            System.out.println("This always executes!");
        }
        // Finally{} is optional it's always gets executed and is used to close unwanted resources
        // if we enecountered an exception and we wanna close the file at the end but prrogram stops at exception,
        // in here we haven't close are scanner
        // if we encountered any error hence we put everything in finally{} but its optional

        // Finally{} is often use for CLEANUP cleaning up the program when we are done with it!
    }
}
// The code which is dangerous or interrupts the program just use the try{} block and hence catch{} block to address the execption
// catch(Type of Exception var_name){}

// ORDER OF EXECPTIONS MATTERS WHILE HANDLING THEM GENERALLY GO FROM MOST SPECIFIC-MOST GENERAL
// Think of exceptions like a hierarchy — a family tree.
// Throwable
//  └── Exception
//       ├── RuntimeException
//       │    ├── NullPointerException
//       │    ├── IndexOutOfBoundsException
//       │    └── ...
//       ├── IOException
//       ├── SQLException
//       └── …
// The parent is broader.
// The child is more specific.
// catch order should follow this rule:
// Specific → less specific → final fallback