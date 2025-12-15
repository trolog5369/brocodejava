import java.util.Scanner;

public class enums2 {
    public static void main(String[] args) {
        // Enums= (Enumerations) A Special kind of class that
        //        Represent a fixed set of constants.
        //        They improve code readibility and are easy to maintain
        //        More efficient with switches when comparing Strings.
        


        try{
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter a day of the week: ");
        String response=scanner.nextLine().toUpperCase();
        Day day=Day.valueOf(response);
        switch(day){
            case MONDAY,
            TUESDAY,
            WEDNESDAY,
            THURSDAY,
            FRIDAY -> System.out.println("It is a weekday!");
            case SATURDAY,SUNDAY -> System.out.println("It is the weekend!");
        }
        // if we were using String then all the cases will be enclosed in  a set of "" ie ("MONDAY","TUESDAY",.. and so on)
        // hence by using enums it's efficient! as compared to Strings!
        }
        catch(IllegalArgumentException e){
            System.out.println("Please enter a valid day of the week!");//if we entered an invalid input
        }
    }
}
// Enums they are safe replacement for strings when the choices are limited
// Use enums when choices are fixed.
// Use Strings only when values are free-form.