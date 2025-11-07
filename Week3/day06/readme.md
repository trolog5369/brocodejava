# 🚀 Day 06 - Slot Machine Project 🎰

## 📘 Project Overview
The **Slot Machine** project simulates a simple casino slot game where the player starts with a fixed balance, places bets, and spins to match symbols. Based on the combination of symbols, the player either wins or loses credits. This project combines **loops, arrays, methods, conditional logic, and random number generation** — making it one of the more logic-heavy beginner projects.

---

## 🧠 Concepts Practiced
- `Random` class for generating random outcomes  
- `Scanner` for taking user input  
- Methods for code modularity (`spinRow()`, `printRow()`, `getPayOut()`)  
- `switch` expressions for calculating winnings  
- Basic game loop logic and input validation  
- Arrays and string manipulation (`String.join()`)

---

## ⚙️ How It Works
1. The player starts with `$100`.
2. Each round:
   - The player places a bet.
   - The machine "spins" (randomly selects 3 symbols).
   - If 2 or 3 symbols match, the player wins a payout based on the symbol type.
3. The game continues until the player quits or runs out of money.

---

## 💰 Payouts
| Symbol       | 2 Matches | 3 Matches |
|---------------|------------|------------|
| Cherry 🍒     | x2         | x3         |
| Watermelon 🍉 | x3         | x4         |
| Bell 🔔       | x4         | x5         |
| Star ⭐       | x5         | x10        |
| Lemon 🍋     | x10        | x20        |

---

## 🧩 Files
- `slotmachine.java`

---

## 🧍‍♂️ Personal Notes
This was the **first real challenge** for me in Bro Code’s Java series.  
I had to really focus on understanding how the methods interact and how random generation + condition checks control the flow.  
Felt proud after debugging and seeing the full game run successfully.

---

## ✅ Output Example
Welcome to Java slots:
Symbols: cherry, Watermelon, Bell, Star, lemon

Current balance: $100
Place your bet amount: 20
Spinning.....
cherry | cherry | Star
You won $:40
Do you want to play again?(Y/N) Y
...
Game Over! Your final balance is $120