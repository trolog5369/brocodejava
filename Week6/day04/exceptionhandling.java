
public class exceptionhandling {
    public static void main(String[] args) {
        // Exception=An event that interrupts the normal flow of a program
        //           (Dividing by zero,file not found,mismatch input type)
        //           Surround any dangerous code with a try{} block
        //           try{}, catch{}, finally{}

        // System.out.println(1/0);
        // This cause an exception Exception in thread "main" java.lang.ArithmeticException
        // at exceptionhandling.main(exceptionhandling.java:9)

        // Any block of code which is dangeurous or interrupts the program surround it with try{} block

        // If we have a try{} then we also should have a catch{} block
        try{
            System.out.println(1/0);
        }
        catch(ArithmeticException e){
            System.out.println("YOU CAN'T DIVIDE BY ZERO!");
        }

        // We can have more than one catch{}
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
