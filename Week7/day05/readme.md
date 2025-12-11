# Day 05 — Timer & TimerTask in Java

## 📌 Overview
Today I learned how to schedule tasks in Java using the `Timer` and `TimerTask` classes. These allow a program to execute code **after a delay** or **repeatedly at fixed intervals**.  
I also applied **anonymous classes** to override the `run()` method without creating a separate file.

---

## 📚 Concepts Learned

### **1️⃣ Timer**
A class used to schedule tasks on a background thread.

It can schedule:
- One-time delayed tasks  
- Periodic / repeating tasks  

**Key methods:**
```java
timer.schedule(task, delay);
timer.schedule(task, delay, period);
2️⃣ TimerTask

Represents the task that Timer will execute.

It is an abstract class, so you must override the run() method.

The run() method contains the action that gets executed repeatedly.

🔍 Important:
TimerTask does NOT extend Timer.
They are separate classes that work together.

3️⃣ Anonymous Class Use

Instead of creating a separate class (MyTask extends TimerTask), I used an anonymous class because:

The behavior is only needed once

I can override run() directly during object creation

Syntax:

TimerTask task = new TimerTask() {
    @Override
    public void run() {
        // custom logic
    }
};

🧠 Key Learnings (Simplified)

Timer schedules tasks

TimerTask defines the task behavior

run() executes each time the task triggers

Anonymous classes simplify one-time custom logic

timer.cancel() stops all scheduled tasks

🧩 Code Written Today
import java.util.Timer;
import java.util.TimerTask;

public class timertasks {
    public static void main(String[] args) {

        Timer timer = new Timer();

        TimerTask task = new TimerTask() { // anonymous class

            int count = 3;

            @Override
            public void run() {
                System.out.println("Hello!");
                count--;
                if (count <= 0) {
                    System.out.println("Task complete!");
                    timer.cancel();
                }
            }
        };

        // Run after 3 seconds, then repeat every 1 second
        timer.schedule(task, 3000, 1000);
    }
}

✅ Day Summary

Learned how Java schedules delayed and periodic tasks

Overrode run() using anonymous classes

Implemented a timer that stops after a set number of iterations

Strengthened understanding of background task execution in Java