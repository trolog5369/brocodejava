![Status](https://img.shields.io/badge/Status-Completed-brightgreen)
![Java](https://img.shields.io/badge/Language-Java-orange?style=for-the-badge&logo=java&logoColor=white)

# 🚀 Week 07 — Core Java Projects, Time API & Advanced Language Features

## 📘 Overview
Week 07 focused on **applying core Java concepts through hands-on mini-projects and advanced language features**.  
The emphasis shifted from learning syntax to **building complete programs**, understanding **execution flow**, and writing **clean, reusable, and type-safe code**.

Key areas included:
- Building a full **Hangman game**
- Working with **Date & Time API**
- Understanding **Anonymous Classes**
- Scheduling tasks using **Timer & TimerTask**
- Implementing **Countdown timers**
- Learning **Generics** for reusable and type-safe code

This week strengthened problem-solving, program structuring, and real-world Java usage.

---

# 📂 Daily Breakdown

---

## **Day 01 — Hangman Game (Console Project)**
- Built a console-based Hangman game in Java.
- Used `ArrayList<Character>` to track guessed letters dynamically.
- Implemented ASCII art to visually represent Hangman stages.
- Handled user input with `Scanner`.
- Controlled game flow with loops and conditionals.
- Extended the game to read words from a `.txt` file.
- Used `BufferedReader`, `Random`, and exception handling.
- **Key insight:** Multiple concepts combined → complete program.

---

## **Day 02 — Hangman (Improved & From Scratch)**
- Rebuilt Hangman completely from scratch.
- Created two versions:
  - Hardcoded word version
  - File-based random word version
- Focused on:
  - Clean logic flow
  - Game state management
  - Win/Lose detection
- Reinforced collections, loops, and file I/O.
- **Key mindset:** Writing logic independently, not copying tutorials.

---

## **Day 03 — Java Date & Time API**
- Learned modern Java time handling using `java.time`.
- Worked with:
  - `LocalDate`
  - `LocalTime`
  - `LocalDateTime`
  - `DateTimeFormatter`
- Used static factory methods like `.now()`.
- Applied custom formatting patterns.
- Understood immutability of date/time objects.
- **Key lesson:** Avoid legacy date APIs; use modern, immutable classes.

---

## **Day 04 — Anonymous Classes**
- Learned how to create classes without names for one-time use.
- Overrode methods directly during object creation.
- Compared:
  - Creating a new subclass
  - Using an anonymous class
- Used examples like `Dog`, `TalkingDog`, and method overriding.
- Common use cases:
  - `Runnable`
  - `TimerTask`
  - Event listeners
- **Key insight:** Use anonymous classes for small, one-time behavior changes.

---

## **Day 05 — Timer & TimerTask**
- Learned how Java schedules delayed and periodic tasks.
- Used:
  - `Timer`
  - `TimerTask`
- Overrode `run()` using anonymous classes.
- Scheduled tasks with:
  - `schedule()`
  - `schedule(delay, period)`
- Implemented task cancellation using `timer.cancel()`.
- **Key takeaway:** Background tasks require proper stopping logic.

---

## **Day 06 — Countdown Timer**
- Built a real-time countdown timer.
- Created two versions:
  - Hardcoded countdown
  - User-input-based countdown
- Used `scheduleAtFixedRate()` for precise timing.
- Integrated `Scanner` for dynamic input.
- Learned importance of cancelling timers to avoid infinite execution.
- **Key lesson:** Timed execution + conditions = controlled automation.

---

## **Day 07 — Generics in Java**
- Learned Generics for writing reusable, type-safe code.
- Understood:
  - Type parameters `<T>`
  - Type arguments `<String>`, `<Integer>`
- Applied generics to:
  - `ArrayList`
  - Custom classes (`Box<T>`)
  - Multiple type parameters (`Product<T, U>`)
- Benefits:
  - Compile-time type checking
  - Reduced code duplication
- **Key mindset:** Write logic once, reuse safely for any data type.

---

# ⚡ Concepts Covered
- Console-based Java projects
- Collections (`ArrayList`)
- File I/O (`BufferedReader`, `FileReader`)
- Randomization
- Java Date & Time API
- Anonymous classes
- Timers and scheduled tasks
- Countdown logic
- Generics and type safety

---

# 🧠 Reflection
Week 07 marked a transition from **learning concepts** to **building complete programs**.  
The Hangman project proved that combining collections, file I/O, loops, and logic is far more demanding than isolated examples.

Anonymous classes, timers, and generics introduced advanced thinking about:
- Code reuse
- Execution control
- Type safety

**Key mindset change:**  
Stop thinking in lines of code — start thinking in **systems and workflows**.

---

# ⚙️ Tools
- **Language:** Java  
- **Editor:** VS Code / IntelliJ IDEA  
- **Execution:** Terminal (`javac` + `java`)  

---

# 🎯 Next Week Goals
- Continue advanced Java topics.
- Start **GUI development (Swing / JavaFX)**.
- Build a mini-project combining:
  - Collections
  - File I/O
  - Timers
  - OOP principles

---

📅 **Week:** 07  
👨‍💻 **Focus:** Practical Java, Mini Projects, Advanced Core Concepts
