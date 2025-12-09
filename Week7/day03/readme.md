# Day 03 — Java Date & Time API

## 📌 Overview
In Day 03, I learned how to work with Java’s modern **Date & Time API** using the `java.time` package.  
This includes handling **dates**, **times**, **combined date-time values**, and **formatting** them using custom patterns.

---

## 📚 Concepts Learned

### 1️⃣ LocalDate
Represents only the **date** (year-month-day).

```java
LocalDate date = LocalDate.now();
System.out.println(date);

2️⃣ LocalTime

Represents only the time (hours-minutes-seconds-nanoseconds).

LocalTime time = LocalTime.now();
System.out.println(time);

3️⃣ LocalDateTime

Represents both date and time together.

LocalDateTime dateTime = LocalDateTime.now();
System.out.println(dateTime);

4️⃣ DateTimeFormatter

Used to format date/time into readable/custom formats.

DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
System.out.println(dateTime.format(dtf));

🧠 Key Learnings

LocalDate, LocalTime, and LocalDateTime cannot be created using new.
They use static factory methods like .now().

These classes are immutable — once created, they cannot be changed.

DateTimeFormatter provides powerful and flexible formatting options.

📂 Code Written Today
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class dateandtime {
    public static void main(String[] args) {

        LocalDate date = LocalDate.now();
        System.out.println(date);

        LocalTime time = LocalTime.now();
        System.out.println(time);

        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println(dateTime);

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        System.out.println(dateTime.format(dtf));
    }
}

✅ Day Summary

Explored Java’s java.time API

Printed current date, time, and date-time

Applied custom formatting

Completed BroCode Day 03