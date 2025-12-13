# Week 7 — Day 02: Hangman Game in Java

## 📌 Overview
On this day, I built a **fully functional Hangman game from scratch in Java**.  
The project focuses on applying core Java concepts like loops, conditionals, collections, file handling, and user input to create a complete console-based game.

Two versions were implemented:
1. A **basic Hangman** with a hardcoded word  
2. An **enhanced Hangman** that randomly selects words from a file

---

## 🎯 Features Implemented
- Console-based Hangman gameplay
- ASCII art representation of the hanging man
- Letter-by-letter guessing system
- Win and lose conditions
- Limited number of wrong guesses (7)
- Case-insensitive input handling

---

## 📚 Concepts Used

### Core Java
- `while` and `for` loops
- Conditional logic (`if / else`)
- Methods and method calls
- Switch expressions
- String manipulation

### Collections
- `ArrayList<Character>` for tracking guessed letters
- `ArrayList<String>` for storing words from file

### Input Handling
- `Scanner` for user input

### File Handling (Version 2)
- `BufferedReader`
- `FileReader`
- Exception handling (`try-catch`)
- Random word selection using `Random`

---

## 🧩 Version 1 — Basic Hangman (Hardcoded Word)

### Description
- The word is predefined inside the program.
- Underscores (`_`) are displayed for unguessed letters.
- Each wrong guess adds a part to the ASCII hangman.
- Game ends when:
  - All letters are guessed → **Win**
  - Wrong guesses reach 7 → **Lose**

### Key Logic
- `ArrayList<Character>` tracks guessed letters
- `word.indexOf(guess)` checks correctness
- `AsciiArt(int wrongGuesses)` renders hangman stages

---

## 🧩 Version 2 — File-Based Hangman (Random Word)

### Description
- Words are read from a text file (`hehe.txt`)
- One word is randomly selected at runtime
- Gameplay logic remains the same as Version 1
- Demonstrates real-world file input handling

### Additional Concepts
- Reading files line-by-line
- Handling missing files safely
- Using `Random` for unpredictability

---

## 🧠 Key Learnings
- How to build a complete program instead of isolated examples
- Managing game state using collections
- Applying file I/O in a real use case
- Structuring logic cleanly inside loops and methods
- Importance of terminating background loops correctly

---

## ✅ Day Summary
- Built Hangman game fully from scratch
- Implemented ASCII art rendering
- Practiced collections and control flow
- Applied file handling and randomness
- Strengthened problem-solving and program structure skills

---

🛠 **Project Type:** Console Game  
📅 **Week:** 7  
📆 **Day:** 02  
👨‍💻 **Language:** Java
