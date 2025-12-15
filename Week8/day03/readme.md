![Status](https://img.shields.io/badge/Status-Completed-brightgreen)
![Java](https://img.shields.io/badge/Language-Java-orange?style=for-the-badge&logo=java&logoColor=white)

# 🚀 Week 08 — Day 03: Multithreading in Java

## 📌 Overview
On Day 03, I learned the **fundamentals of multithreading in Java** and understood why running all logic on the main thread can break real-world programs.  
The focus was on **creating threads**, **running tasks in parallel**, and **controlling thread lifecycle** using daemon threads.

This day clarified how Java handles concurrency and why background tasks must be separated from user-interactive logic.

---

## 🎯 Problems Identified
- A single-threaded program **blocks execution**
- Time-based logic (countdown) prevents user input
- Main thread cannot multitask by default

This was demonstrated using a **time-limited input game** scenario.

---

## 📚 Concepts Learned

### 1️⃣ What Is Multithreading?
- Multithreading allows **multiple tasks to run simultaneously**
- Each thread runs independently
- Used for:
  - Timers
  - Background tasks
  - File I/O
  - Network operations
  - Responsive applications

---

### 2️⃣ Creating Threads in Java

#### ❌ Extending `Thread` (Not Preferred)
- Limited by single inheritance
- Less flexible

#### ✅ Implementing `Runnable` (Preferred)
- Allows multiple inheritance via interfaces
- Cleaner separation of task and execution

```java
class MyRunnable implements Runnable {
    @Override
    public void run() {
        // background task
    }
}
3️⃣ Thread Lifecycle

new Thread(runnable) → creates thread

start() → starts execution

run() → executed on a separate thread

sleep() → pauses thread temporarily

4️⃣ Problem: Single Thread Blocking (threading.java)

Countdown runs first

User input is blocked

Timer becomes meaningless

Root Cause:
Everything runs on the main thread

5️⃣ Solution: Multiple Threads (threading2.java)

Countdown runs on a background thread

User input runs on main thread

Both execute simultaneously

Thread thread = new Thread(runnable);
thread.start();

6️⃣ Daemon Threads (threading3.java)

Daemon threads automatically stop when main thread ends

Prevent unnecessary background execution

thread.setDaemon(true);


Use case:

Timers

Background watchers

Cleanup tasks

7️⃣ Thread Termination

System.exit(0) used to force-stop application

Demonstrates controlled shutdown when time expires

🧩 Files Created

threading.java — single-threaded issue demonstration

threading2.java — multithreaded solution

threading3.java — daemon thread handling

MyRunnable.java — Runnable implementation

🧠 Key Takeaways

Single-threaded programs block execution

Threads allow true parallel behavior

Runnable is better than extending Thread

sleep() pauses only the current thread

Daemon threads end automatically with main thread

Multithreading is essential for real-world applications

⚙️ Tools

Language: Java

Editor: VS Code / IntelliJ IDEA

Execution: Terminal (javac + java)

✅ Day Summary

Identified single-thread limitations

Implemented multithreading using Runnable

Ran parallel countdown + user input

Learned daemon thread behavior

Strengthened understanding of concurrency fundamentals in Java