# 📅 Day 04 - Static Keyword in Java

## 📖 Overview
Today’s session focused on the **static keyword** in Java — understanding how it modifies variables and methods so they belong to the **class** rather than any **specific object**.

---

## 🧩 Concepts Covered
1. **Static Variables**
   - Shared across all instances of a class.
   - Useful for tracking values common to all objects.
   - Example: Counting total number of friends created using a static counter variable.

2. **Static Methods**
   - Belong to the class, not individual objects.
   - Invoked using the class name (e.g., `ClassName.methodName()`).
   - Commonly used for utility or helper functions.

3. **Accessing Static Members**
   - Static variables/methods should be accessed via the class, not through objects.
   - Example: `Friend.numOfFriend` and `Friend.showFriend()`.

---

## 💻 Code Files

### **1️⃣ statickeyword.java**
Demonstrates how static variables differ from instance variables using the `Friend` class.  
It shows how all objects share a common `numOfFriend` variable once declared as static.

### **2️⃣ Friend.java**
Defines the `Friend` class with:
- A static variable `numOfFriend` shared across all objects.
- An instance variable `numOfFriends` (non-static).
- A static method `showFriend()` displaying the total number of friends created.

### **3️⃣ statickeyword2.java**
Shows how static methods are used in Java’s built-in `Math` class (e.g., `Math.round()`),  
highlighting how utility methods are commonly implemented as static.

---

## 🧠 Key Takeaways
- `static` members belong to the **class**, not to objects.
- They are shared and retain their value across all instances.
- Useful for global counters, configuration constants, and utility methods.
- Example: `Math`, `Arrays`, and `Collections` classes in Java extensively use static methods.

---

## 🧩 Output Example
Spongebob
1
Patrick
1
Squidward
1
Sandy
1
4
You have 4 Total friends


---

## ✅ Summary
Static variables and methods help in **memory management** and **shared resource handling**.  
They eliminate redundancy when multiple objects need to access or modify common data.
