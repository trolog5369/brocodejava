# 🚀 Week 6 — Day 04 (Java Exception Handling)

## 📌 What I learned today
Exceptions are events that interrupt the normal flow of a program.  
They happen during **runtime — not compile time —** and need to be handled properly.

### Examples:
- Dividing by zero
- Invalid input
- Accessing unavailable resources
- File not found

---

## ⚠️ Exception Handling Blocks

### ✔️ `try { }`
Contains **dangerous code** — the part that may throw an exception.

### ✔️ `catch { }`
Handles the specific error and prevents the program from crashing.

### ✔️ `finally { }`
Always runs — even if exception occurs.  
Used for cleanup like:
- Closing scanner
- Closing file streams
- Releasing resources

---

## 🔥 Basic Example (Division by Zero)

The dangerous code goes in **try**  
The handler (response) goes in **catch**

**Flow:**
1. Try something risky
2. If exception occurs → jump to catch
3. Program continues safely

---

## 🧠 Multiple Catch Blocks
We can handle exceptions separately depending on their type:

- `InputMismatchException` → user enters wrong input
- `ArithmeticException` → illegal math operation
- `Exception` → general fallback (always last)

### Order matters:
**Specific → less specific → broad fallback**
// ORDER OF EXECPTIONS MATTERS WHILE HANDLING THEM GENERALLY GO FROM MOST SPECIFIC-MOST GENERAL
// Think of exceptions like a hierarchy — a family tree.
// Throwable
//  └── Exception
//       ├── RuntimeException
//       │    ├── NullPointerException
//       │    ├── IndexOutOfBoundsException
//       │    └── ...
//       ├── IOException
//       ├── SQLException
//       └── …
// The parent is broader.
// The child is more specific.
// catch order should follow this rule:
// Specific → less specific → final fallback

---

## 🧹 finally Block

Runs no matter what:
- Even if no exceptions
- Even if exceptions
- Even if return is used

### Used for:
- Closing scanners
- Shutting database connections
- Cleaning resources

---

## 💡 Key Lessons

🔹 Exceptions interrupt program flow  
🔹 Use `try` to wrap dangerous code  
🔹 Use `catch` to handle the issue gracefully  
🔹 Use multiple catches for different scenarios  
🔹 Always end with a fallback: `catch(Exception e)`  
🔹 `finally` executes regardless — perfect for cleanup

---

## 🏁 Reflection
Exceptions are unavoidable and ignoring them makes programs fragile.  
Today’s lesson showed that wrapping risky code protects the app and the user.  
**Good error handling = stable, safe, professional software.**
