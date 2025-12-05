# 🚀 Java Hangman Game

## 🎯 Overview
This project is a continuation of a basic Hangman game in Java, now enhanced to read words from a text file and pick them randomly. The game challenges the player to guess letters of a hidden word, and completes the Hangman if too many wrong guesses are made.  

It focuses on:  
- File I/O (`BufferedReader`, `FileReader`)  
- Random selection of words  
- ArrayList usage to manage dynamic word states  
- Exception handling (`FileNotFoundException`, `IOException`)  
- ASCII-based Hangman display  

---

## 🧠 Core Concepts

### ✔️ Random Word Selection
```java
String word = words.get(random.nextInt(words.size()));
random.nextInt(words.size()) generates a random integer between 0 and words.size() - 1.

words.get(...) picks the word at that random index, ensuring a different word each game.

✔️ Word State Tracking

ArrayList<Character> wordState holds underscores (_) for unguessed letters.

Each correct guess replaces the underscore with the actual letter using set().

✔️ Checking Guesses
if (word.indexOf(guess) >= 0) { ... }


Checks if the guessed letter exists in the word.

Returns the index of the first occurrence of the guess; >= 0 means the letter is present.

Correct guesses update wordState; incorrect ones increment wrongGuesses.

✔️ ASCII Hangman Art

Displays Hangman progress visually as wrong guesses increase.

Uses a switch statement with cases from 0 to 6.

✔️ File I/O & Exception Handling

Reads words from words.txt using BufferedReader.

Handles missing file (FileNotFoundException) and general I/O issues (IOException).

Ensures safe reading of the file without crashing the program.

✔️ User Input

Takes a single lowercase character per guess (scanner.next().toLowerCase().charAt(0)).

Maintains consistent comparison with lowercase words.

💡 Takeaways

Java can dynamically handle word lists from external files.

ArrayLists allow flexible tracking of game state.

Proper exception handling prevents crashes due to missing files or other I/O errors.

Incremental ASCII visualization enhances user experience.

⚙️ Tools

Language: Java

IDE: VS Code / IntelliJ IDEA

Execution: Terminal (javac + java)

🎯 Next Steps

Try building this game from scratch without referencing the tutorial.

Add enhancements like checking repeated guesses, score tracking, or difficulty levels.

Experiment with more file-based word lists or different input/output methods.