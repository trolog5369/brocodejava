![Status](https://img.shields.io/badge/Status-Completed-brightgreen)
![Java](https://img.shields.io/badge/Language-Java-orange?style=for-the-badge&logo=java&logoColor=white)

# 🚀 Week 07 — Day 01 (Java Hangman Game)

## 🎯 Topics Covered
- Building a console-based Hangman game in Java
- Using `ArrayList` to track word state dynamically
- ASCII art for visual representation of Hangman stages
- Handling user input with `Scanner`
- Control flow for correct/incorrect guesses
- Reading words from a `.txt` file to make the game dynamic
- Random selection of words from a list
- Basic exception handling for file I/O

---

## 🧠 Core Concepts

### ✔️ Game Logic
- The game selects a word (hardcoded or from `words.txt`)  
- Player guesses letters; correct guesses fill blanks, wrong guesses increment counter  
- Maximum 6 wrong guesses before game over

### ✔️ Word State Tracking
- `ArrayList<Character>` used to store current word state
- Underscores `_` represent unguessed letters
- Updated dynamically as correct letters are guessed

### ✔️ ASCII Hangman Art
- Visual feedback for wrong guesses
- Different stages for 0 → 6 wrong guesses
- Improves user engagement and game clarity

### ✔️ User Input
- `Scanner` reads input from console
- Only the first character of input is used
- Converted to lowercase for consistency

### ✔️ File I/O (Dynamic Word List)
- `BufferedReader` reads words from `words.txt`
- Words stored in an `ArrayList<String>`
- `Random` selects a word at random for each game session
- `try-with-resources` ensures safe file handling
- Handles `FileNotFoundException` and `IOException`

---

## 💡 Takeaways
- Learned how to structure a simple interactive game using OOP and collections
- Practiced dynamic updates of data structures (`ArrayList`) in real time
- Realized importance of proper exception handling for file operations
- ASCII art adds a simple but effective user interface
- Handling user input robustly is critical for smooth gameplay
- Combining file I/O, randomness, loops, and conditionals creates a complete program

---

## ⚙️ Tools
- **Language:** Java  
- **Editor:** VS Code / IntelliJ IDEA  
- **Execution:** Terminal (`javac` + `java`)  

---

## 🏁 Reflection
This project was overwhelming at first but helped me understand how multiple concepts (collections, loops, input, file I/O) work together to create a full program.  
It strengthened my confidence in building interactive console applications and handling real-world scenarios like dynamic input and exceptions.

---
