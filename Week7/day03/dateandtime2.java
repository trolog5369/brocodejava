import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class dateandtime2 {
    public static void main(String[] args) {
        // // How to work with DATES and TIMES using JAVA
        // // (Localfate, localtime, localDateTime, UTC timestamp)

        // // This is used for current date
        // LocalDate date= LocalDate.now();
        // System.out.println(date);
        // // 2025-12-08

        // // This is used for current time
        // LocalTime time= LocalTime.now();
        // System.out.println(time);
        // // 22:15:10.995070600

        // // This is used for current date and time
        // LocalDateTime dateTime= LocalDateTime.now();
        // System.out.println(dateTime);
        // // 2025-12-08T22:15:10.995070600

        // // This is used for UTC timestamp
        // Instant instant=Instant.now();
        // System.out.println(instant);
        // // 2025-12-08T16:45:10.996076100Z

        // // But these format is ugly hence we can create a custom format
        
        // CUSTOM FORMAT for date time
        LocalDateTime datetime=LocalDateTime.now();//This is the datetime of now 

        DateTimeFormatter formatter=DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        // For the pattern(String) we can check the offical java documentation

        String newDateTime=datetime.format(formatter);
        System.out.println(newDateTime);

        // What if we want to display a custom dateTime? we absoutely can
        LocalDate date=LocalDate.of(2026, 1, 8);
        System.out.println(date);

        LocalDateTime dateTime=LocalDateTime.of(2026, 1, 8, 12, 0, 0);
        System.out.println(dateTime);

        // We can also compare 
        LocalDateTime dateTime1=LocalDateTime.of(2027, 12, 8, 12, 0, 0);
        LocalDateTime dateTime2=LocalDateTime.of(2027, 12, 8, 12, 0, 0);

        System.out.println(dateTime1);
        System.out.println(dateTime2);

        // No will compare they have a built in methods
        if (dateTime1.isBefore(dateTime2)) {
            System.out.println(dateTime1+"is earlier than "+dateTime2);
        }
        else if (dateTime1.isAfter(dateTime2)) {
            System.out.println(dateTime1+"is later than "+dateTime2);
        }
        else if (dateTime1.isEqual(dateTime2)) {
            System.out.println(dateTime1+"is equal to "+dateTime2);
            
        }

    }
}
