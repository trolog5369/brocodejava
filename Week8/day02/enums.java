
public class enums {
    public static void main(String[] args) {
        // Enums= (Enumerations) A Special kind of class that
        //        Represent a fixed set of constants.
        //        They improve code readibility and are easy to maintain
        //        More efficient with switches when comparing Strings. ie more efficient as compared to Strings 
        
        Day day=Day.SUNDAY;

        System.out.println(day);

        // to get the value associated with day use the getDayNumber method we created!
        System.out.println(day.getDayNumber());

        // This is really helpful ie enums when we're working with switches

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
}
// Enums they are safe replacement for strings when the choices are limited
// Use enums when choices are fixed.
// Use Strings only when values are free-form.