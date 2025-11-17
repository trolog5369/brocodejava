# 🌤️ Week 5 — Day 01  
## 🔍 Understanding `toString()` and Object Printing in Java

Today focused on the **`toString()` method**, where you learned why printing objects directly often shows a hashcode — and how overriding `toString()` gives meaningful, human-readable output.  
This is your first real step into object behavior customization.

---

## 🧱 What I Learned Today

### **1. The `Object` Class**
- Every class in Java automatically inherits from `Object`.
- That’s why all classes get:
  - `toString()`
  - `equals()`
  - `hashCode()`
  - and more

### **2. Default `toString()` Behavior**
Printing an object without overriding `toString()` gives something like:
Car@251a69d7


This consists of:
- Class name  
- `@`  
- Hexadecimal hashcode (identity-based)

This output is **not useful** for humans.

### **3. Overriding `toString()`**
You wrote a custom version in `Car2`:

```java
@Override
public String toString() {
    return this.colour + " " + this.year + " " + this.make + " " + this.model;
}
Printing the object
Red 2025 Ford Mustang

Clean. Readable. Exactly what you wanted.

4. Why Override toString()?

Better debugging

Cleaner logs

Better readability

Useful in real applications (API responses, DTOs, models)

5. Object Containment Behavior (Important)

When a toString() uses an inner object, Java automatically calls the inner object’s overridden toString().

No “precedence.”
No “last override wins.”
Each object uses its own method.

📁 Files Practiced Today
File	Purpose
tostring.java	Demonstrated default vs overridden toString() output.
Car.java	Class without toString() override → prints hashcode.
Car2.java	Class with custom toString() override → readable output.
🧠 Key Takeaways

toString() is inherited from Object.

Default toString() returns a hashcode — not useful.

Overriding toString() makes objects human-readable.

Printing objects in Java implicitly calls toString().

Nested object printing always uses each object’s own toString().

🚀 Reflection

Where the hashcode comes from
How toString() works internally
Why overriding it is essential in real projects
This will make upcoming concepts like polymorphism, method overriding, and logging far easier.

