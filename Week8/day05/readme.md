# Day 05 — Java Alarm Clock (Final Project)

## 📌 Overview
Today I built a **fully working Alarm Clock application in Java**, combining multiple concepts learned throughout the course.  
The program allows a user to set an alarm using time input, continuously checks the current time on a separate thread, and plays an audio file when the alarm triggers.

This project integrates **date-time handling, multithreading, exception handling, file I/O, and audio playback**.

---

## 🧩 Concepts Covered

### Date & Time Handling
- Used `LocalTime` to represent both current time and alarm time
- Used `DateTimeFormatter` to parse user input in `HH:mm:ss` format
- Handled invalid time input using `DateTimeParseException`

### Multithreading
- Implemented `Runnable` to run the alarm logic on a **separate thread**
- Prevented blocking the main thread while waiting for the alarm
- Used `Thread.sleep()` to check time at 1-second intervals

### Input Validation & Error Handling
- Repeatedly prompted user until valid time format was entered
- Used `try-catch` blocks for:
  - Invalid time input
  - Audio file issues
  - Thread interruptions

### Audio Playback
- Used Java Sound API:
  - `AudioInputStream`
  - `Clip`
- Played alarm sound from a `.wav` file
- Allowed user to stop the alarm by pressing Enter

---

## ⚙️ How the Program Works

1. User enters alarm time in `HH:mm:ss` format
2. Input is validated and parsed into a `LocalTime` object
3. A new thread starts running the alarm logic
4. Current time is displayed every second
5. When current time passes alarm time:
   - Alarm sound plays
   - User presses Enter to stop it

---

## 🧠 Key Takeaways

- `LocalTime` is ideal for time-only logic
- Background tasks should always run on a separate thread
- `Runnable` provides cleaner and more flexible multithreading
- Blocking operations (sleep, I/O, audio) must be handled carefully
- Real applications require defensive coding with proper exception handling

---

## ✅ Day Summary

- Built a real-world Java project from scratch
- Combined time APIs, threads, and audio playback
- Practiced clean separation of logic using classes
- Strengthened confidence in building complete Java applications
- Completed the final project of the BroCode Java tutorial
