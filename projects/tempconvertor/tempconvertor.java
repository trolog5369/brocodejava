
import java.util.Scanner;
public class tempconvertor {
    public static void main(String[] args) {
        // This simple mini project  will give us the idea for the ternary operator!
        Scanner scanner=new Scanner(System.in);

        double temp;
        double newTemp;
        String unit;

        System.out.print("Enter the temperature: ");
        temp=scanner.nextDouble();

        System.out.print("Convert to celcuis or Fahrenit? (C or F): ");
        // unit=scanner.next();
        // The char can be lowercase if user input C or F in lowercase if we want it to be uppercase always we can do it
        // By following the next method of scanner we will do something called METHOD CHAINING
        unit=scanner.next().toUpperCase();
        // Now the char will always be uppercase even its entered lowercase!

        // Uisng if else
        // if (unit.equals("C")) {
        //     newTemp=(temp-32)*5/9;
        //     System.out.println(newTemp);
        // }
        // else{
        //     newTemp=(temp*9/5)+32;
        //     System.out.println(newTemp);
        // }

        // Now we will use ternary operator 
        // (condition)? true:false;
         newTemp=(unit.equals("C"))? (temp-32)*5/9:(temp*9/5)+32;
        //  (temp-32)*5/9 true block
        // (temp*9/5)+32 flase block

         System.out.println(newTemp+"°"+unit);
        // for degree symbol "°" use formula numlock on alt+0176

        // to limit the amount of digits to display we can use obiously printf
         System.out.printf("%.1f°",newTemp,unit);

        scanner.close();
    }
}

