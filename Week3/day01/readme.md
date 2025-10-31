# 🎲 Day 01 – Dice Rolling Program

### 🧠 Concepts Covered
- **Random Numbers** using `java.util.Random`  
- **User Input** using `Scanner`  
- **Loops & Conditionals** for rolling multiple dice  
- **Multi-line Strings (`"""`)** for ASCII Art display  
- **Method Creation & Modular Code** (`printDie()` for visual output)  

---

### 🧩 Program: `dicerolling.java`

#### 🔹 Overview
This program simulates rolling one or more dice.  
The user enters the number of dice to roll, and the program:
1. Generates a random number (1–6) for each die.  
2. Displays the corresponding **ASCII art** for each roll.  
3. Shows the **value rolled** and the **total sum** of all dice.  
4. Validates input to ensure the number of dice > 0.  

---

### ⚙️ Key Features
- **Randomized Rolling:** Uses `Random.nextInt(1,7)` for realistic dice results.  
- **Dynamic Input:** Rolls any number of dice as specified by the user.  
- **ASCII Art Visualization:** Prints dice faces using **multi-line string literals** (`""" ... """`).  
- **Input Validation:** Prevents invalid or zero dice input.  
- **Modular Structure:** Handles drawing dice through a separate `printDie(int roll)` method.

---

### 🧭 Logic Flow
1. User inputs the number of dice.  
2. Program loops through each die and rolls a random number.  
3. Calls `printDie(roll)` to display visual ASCII representation.  
4. Adds up all results and prints the total.  
5. Exits gracefully after displaying results.

---

### 📘 Example Output
Enter the # of dice to roll: 3

| |
| ● |
| |

You rolled: 1

|● |
| ● |
| ●|

You rolled: 3
Total: 10


---

### 🧩 Concepts Reinforced
- Using **methods** for modular, readable code.  
- Combining **loops + conditionals** for iterative logic.  
- Real-world application of **Random** and **Scanner** classes.  
- Practicing **multi-line strings** for formatted console output.

---

### ✅ Status
☑️ **Day 01 (Week 03) Completed Successfully**

---



