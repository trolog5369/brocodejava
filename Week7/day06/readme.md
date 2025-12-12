# Day 06 — Countdown Timer in Java (Timer + TimerTask)

## 📌 Overview
Today I expanded on the previous timer concepts by building a **Countdown Timer** in Java.
I created **two versions**:

- A countdown with a **hardcoded starting value**
- A countdown that takes **user input** using `Scanner`

Both versions used `Timer` and an **anonymous TimerTask** to print numbers every second and stop automatically when the countdown finishes.

---

## 📚 Concepts Learned

### 1️⃣ Using `scheduleAtFixedRate()`
This method executes a task repeatedly at fixed intervals — perfect for countdown logic.

**Syntax:**
```java
timer.scheduleAtFixedRate(task, delay, period);

delay → when to start

period → interval in milliseconds (1000ms = 1 second)

2️⃣ Anonymous TimerTask for Countdown

Instead of creating a separate class, I used an anonymous class to override run() directly.

Inside run():

Print the current count

Decrease the count

When count goes below 0 → print "Happy New Year!" and cancel the timer

3️⃣ User Input With Scanner

In the second version, instead of hardcoding the countdown, I took input from the user:

Scanner scanner = new Scanner(System.in);
int response = scanner.nextInt();


This value becomes the starting countdown number.

🧩 Code Written Today
countdowntimer.java
import java.util.Timer;
import java.util.TimerTask;

public class countdowntimer {
    public static void main(String[] args) {

        Timer timer = new Timer();
        TimerTask task = new TimerTask() {

            int count = 5;

            @Override
            public void run() {
                System.out.println(count);
                count--;
                if (count < 0) {
                    System.out.println("Happy New Year!");
                    timer.cancel();
                }
            }
        };

        timer.scheduleAtFixedRate(task, 0, 1000);
    }
}

countdowntimer2.java (User Input Version)
import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

public class countdowntimer2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter no of seconds to count down from: ");
        int response = scanner.nextInt();

        Timer timer = new Timer();
        TimerTask task = new TimerTask() {

            int count = response;

            @Override
            public void run() {
                System.out.println(count);
                count--;
                if (count < 0) {
                    System.out.println("Happy New Year!");
                    timer.cancel();
                }
            }
        };

        timer.scheduleAtFixedRate(task, 0, 1000);
    }
}

✅ Day Summary

Practiced repeated execution using scheduleAtFixedRate()

Built two countdown timers (hardcoded + user input)

Reinforced anonymous class usage

Learned how to cancel timers properly

Improved practical understanding of timed background execution in Java