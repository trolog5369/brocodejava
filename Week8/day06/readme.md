# ⏰ Java Console Alarm Clock

A **console-based alarm clock application** built in Java using the modern `java.time` API.
This project demonstrates **input validation, time handling, multithreading, and basic audio playback** — without any GUI or unnecessary abstractions.

Built step-by-step from scratch to strengthen **core Java fundamentals**, not to flex frameworks.

---

## 📌 What This Project Does

* Accepts an **alarm time** from the user in `HH:mm:ss` (24-hour format)
* Validates input and rejects incorrect formats
* Confirms the alarm time once set
* Displays **live system time** (updated every second) in the console
* Triggers the alarm when `current time ≥ alarm time`
* Plays a `.wav` sound file
* Allows the user to stop the alarm by pressing **Enter**

This is a **time-polling alarm**, not a countdown timer.

---

## 🧠 Core Concepts Used

* `LocalTime` for accurate time handling
* `DateTimeFormatter` for strict input formatting
* Exception handling (`try-catch`) for invalid user input
* Multithreading using `Runnable` and `Thread`
* Console output manipulation using `\r`
* Java Sound API (`Clip`, `AudioInputStream`) for audio playback

---

## 🗂 Project Structure

```
├── Alarmclockbyme.java   // Entry point, user input & validation
├── Alarm.java            // Alarm logic, time polling, sound trigger
├── uthja.wav             // Alarm sound file
```

---

## ▶️ How It Works (Flow)

1. User enters alarm time in `HH:mm:ss`
2. Input is parsed into a `LocalTime` object
3. A separate thread starts polling system time every second
4. Current time is displayed live in the console
5. When alarm time is reached:

   * Alarm message is printed
   * Sound starts playing
6. Alarm stops when the user presses **Enter**

---

## ▶️ How to Run

1. Make sure `uthja.wav` is in the same directory as the `.java` files
2. Compile:

   ```bash
   javac Alarmclockbyme.java Alarm.java
   ```
3. Run:

   ```bash
   java Alarmclockbyme
   ```
4. Enter time in **HH:mm:ss** format (example: `06:30:00`)

---

## ⚠️ Requirements & Notes

* Works on systems that support Java Sound API
* Audio file **must be `.wav`**
* Uses system time (no timezone manipulation)
* Console-based by design — no GUI

---

## 🎯 Why This Project Exists

This project exists to prove:

* Comfort with **Java core APIs**
* Understanding of **time-based logic**
* Practical use of **threads**
* Ability to build a complete, working program without libraries or frameworks

It’s not meant to be flashy — it’s meant to be **correct**.

---

## 👤 Author

**Pranav Gaikwad**
IT Undergraduate | Java Full Stack Developer in Progress

> Discipline over motivation.
> Fundamentals before frameworks.


