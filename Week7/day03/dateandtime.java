
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
public class dateandtime {
    public static void main(String[] args) {
        // How to work with DATES and TIMES using JAVA
        // (Localfate, localtime, localDateTime, UTC timestamp)

        // This is used for current date
        LocalDate date= LocalDate.now();
        System.out.println(date);
        // 2025-12-08

        // This is used for current time
        LocalTime time= LocalTime.now();
        System.out.println(time);
        // 22:15:10.995070600

        // This is used for current date and time
        LocalDateTime dateTime= LocalDateTime.now();
        System.out.println(dateTime);
        // 2025-12-08T22:15:10.995070600

        // This is used for UTC timestamp
        Instant instant=Instant.now();
        System.out.println(instant);
        // 2025-12-08T16:45:10.996076100Z

        // But these format is ugly hence we can create a custom format
        // Check dateandtime2.java
    }
}
