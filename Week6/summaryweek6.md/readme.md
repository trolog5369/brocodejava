![Status](https://img.shields.io/badge/Status-Completed-brightgreen)
![Java](https://img.shields.io/badge/Language-Java-orange?style=for-the-badge&logo=java&logoColor=white)
![GitHub](https://img.shields.io/badge/GitHub-Trolog5369-black?style=for-the-badge&logo=github&logoColor=white)

# 🚀 Week 06 — Advanced Java Concepts & I/O

### 📘 Overview
This week focused on deeper Java OOP techniques, collections, exception handling, and file/audio I/O.  
I learned how to model relationships, manage primitives as objects, handle runtime issues, and interact with files and audio.  
The key shift was from writing standalone code to building robust, real-world Java applications with safe I/O and proper exception handling.

---

# 📂 Daily Breakdown

---

## **Day 01 — Composition (PART-OF Relationship)**
- Composition = strong ownership; child object cannot exist without parent.  
- Example: Car → Engine. Engine dies with Car.  
- Lifecycle dependency ensures realistic modeling: Computer → CPU, Human → Heart.  
- Driver code showed internal object creation and method delegation.  
- **Key mindset:** Think in terms of parts forming a whole, not objects passing objects.

---

## **Day 02 — Java Wrapper Classes, Autoboxing & Unboxing**
- Wrapper classes convert primitives to objects (Integer, Double, Boolean, Character).  
- Needed for collections, utility methods, and object-based APIs.  
- **Autoboxing:** automatic wrapping of primitive → object.  
- **Unboxing:** automatic extraction of object → primitive.  
- Utility methods for conversion and validation: `parseInt()`, `toString()`, `Character.isLetter()`.  
- **Key lesson:** Use wrappers only when necessary; primitives remain more efficient.

---

## **Day 03 — Java ArrayList (Dynamic Collections)**
- ArrayList = resizable collection, stores objects, allows dynamic growth.  
- Built-in methods: `add()`, `remove()`, `set()`, `get()`, `size()`, `Collections.sort()`.  
- Autoboxing allows storing primitives as objects in collections.  
- User input example: dynamically creating lists at runtime.  
- **Key takeaway:** Collections handle resizing and provide powerful utility, unlike fixed-size arrays.

---

## **Day 04 — Exception Handling**
- Exceptions interrupt runtime flow; proper handling ensures program stability.  
- Blocks: `try` (risky code), `catch` (handle error), `finally` (cleanup).  
- Multiple catch blocks for different exception types: `ArithmeticException`, `InputMismatchException`, etc.  
- **Order matters:** specific → general → fallback.  
- **Key insight:** Good exception handling = stable, professional code.

---

## **Day 05 — Writing Files in Java**
- Used `FileWriter` (small text), `BufferedWriter` (large text), `PrintWriter` (formatted), `FileOutputStream` (binary).  
- Always handle `FileNotFoundException` and `IOException`.  
- Try-with-resources ensures automatic closing.  
- Absolute paths useful for logs, reports, organized storage.  
- **Reflection:** Safe file writing requires planning, proper paths, and exception management.

---

## **Day 06 — Reading Files in Java**
- Most common: `BufferedReader + FileReader` for line-by-line reading.  
- Also: `FileInputStream` (binary), `RandomAccessFile` (specific portions).  
- Loop: `while ((line = reader.readLine()) != null)` to iterate over lines.  
- Exception handling critical: `FileNotFoundException`, `IOException`.  
- Try-with-resources automatically closes readers.  
- **Reflection:** Reading files safely builds the foundation for config files, logs, scripts, and reports.

---

## **Day 07 — Java Audio / Music Player**
- Playing audio: `.wav`, `.au`, `.aiff` via `AudioSystem`, `Clip`, `AudioInputStream`.  
- User controls: Play, Stop, Reset, Quit.  
- Exception handling: `FileNotFoundException`, `UnsupportedAudioFileException`, `LineUnavailableException`, `IOException`.  
- Try-with-resources ensures proper cleanup.  
- **Key takeaway:** Java supports interactive applications with safe resource handling.

---

# ⚡ Concepts Covered
- Composition (PART-OF relationships)  
- Wrapper classes, autoboxing & unboxing  
- ArrayList and dynamic collections  
- Exception handling (`try`, `catch`, `finally`, multiple catch blocks)  
- File I/O: reading and writing with proper exception handling  
- Audio playback using standard Java classes  

---

# 🧠 Reflection
This week taught me how Java code interacts with real-world objects, data, and resources safely.  
From modeling parts of a system to managing runtime issues and files/audio, the focus shifted from syntax to practical application.  

**Key mindset change:**  
Code for robustness and real-world applicability — anticipate exceptions, manage lifecycles, and handle resources properly.

---

# ⚙️ Tools
- **Language:** Java  
- **Editor:** VS Code / IntelliJ IDEA  
- **Execution:** Terminal (`javac` + `java`)  

---

# 🎯 Next Week Goals
- Start exploring **Java GUI programming** (Swing/JavaFX).  
- Work on mini-project integrating collections, file I/O, and exception handling.  
- Begin **multi-class applications** combining OOP and I/O operations.

---

## 📫 Connect With Me
<p align="left">
<a href="https://www.linkedin.com/in/pranav-gaikwad-b09247350" target="_blank">
  <img align="center" src="https://raw.githubusercontent.com/rahuldkjain/github-profile-readme-generator/master/src/images/icons/Social/linkedin.svg" height="30" width="40" />
</a>
<a href="https://instagram.com/_pranav.xr" target="_blank">
  <img align="center" src="https://raw.githubusercontent.com/rahuldkjain/github-profile-readme-generator/master/src/images/icons/Social/instagram.svg" height="30" width="40" />
</a>
<a href="mailto:pranavgaikwad847@gmail.com" target="_blank">
  <img align="center" src="https://raw.githubusercontent.com/rahuldkjain/github-profile-readme-generator/master/src/images/icons/Social/gmail.svg" height="30" width="40" />
</a>
</p>

*Week 06 was about applying Java OOP, handling exceptions, managing collections, and interacting safely with files and audio resources.*
