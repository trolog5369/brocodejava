
import java.util.Scanner;
public class enhanceswitch {
    public static void main(String[] args) {
        // Enhance switch=A replacement to many if else statements
        //                (Java14 feature)
        // it is recommended to use enhance switch over  standard switch

        Scanner scanner=new Scanner(System.in);

        String day;

        System.out.print("Enter the day of the week: ");
        day=scanner.nextLine();

        // Using if else ladder
        if (day.equals("Monday")) {
            System.out.println("It is a weekday");
        }
        else if (day.equals("Tuesday")) {
            System.out.println("It is a weekday");
        }
        else if (day.equals("Wednesday")) {
            System.out.println("It is a weekday");
        }
        else if (day.equals("Thursday")) {
            System.out.println("It is a weekday");
        }
        else if (day.equals("Friday")) {
            System.out.println("It is a weekday");
        }
        else if (day.equals("Saturday")) {
            System.out.println("It is a weekend");
        }
        else if (day.equals("Sunday")) {
            System.out.println("It is a weekend");
        }
        else{
            System.out.println(day+" is not a day");
        }
        // This code works but it has a lot of redundancy were using lot of if else statements
        // They all basically use the same thing
        // an efficient way to write this same is use enhance switch

        switch(day){
            // -> this opertor points to the code which we wanna execute
            case "Monday" -> System.out.println("It is a weekday"); 
            case "Tuesday" -> System.out.println("It is a weekday");
            case "Wednesday" -> System.out.println("It is a weekday");
            case "Thursday" -> System.out.println("It is a weekday");
            case "Friday" -> System.out.println("It is a weekday");
            case "Saturday" -> System.out.println("It is a weekend");
            case "Sunday" -> System.out.println("It is a weekend");
            default -> System.out.println(day+" it is not a day");
            // deafult statement act as an else statement
        }

        //As when using the switch case we are printing the same statements for Monday till friday and saturdat to sunday
        // we can considilate them together
        // Like this
           switch(day){
            case "Monday","Tuesday","Wednesday","Thursday","Friday"->System.out.println("It is a weekday");
            case "Saturday","Sunday" -> System.out.println("It is a weekend");
            default -> System.out.println(day+" it is not a day");
        }

    }
}

