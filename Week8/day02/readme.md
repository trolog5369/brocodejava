# Week 08 — Day 02: Enums in Java

## 📌 Overview
Today I learned about **Enums (Enumerations)** in Java.  
Enums are a special type of class used to represent a **fixed set of constants**.  
They improve **code readability**, **type safety**, and are **more efficient than Strings**, especially when used with `switch` statements.

I implemented enums with:
- Custom fields
- Constructors
- Methods
- Switch-case logic
- User input handling with exception safety

---

## 📚 Concepts Learned

### **1️⃣ What Are Enums**
- Enums represent a predefined, fixed collection of constants.
- Enum constants are written in **ALL CAPS** by convention.
- They prevent invalid values at compile time (unlike Strings).

Example:
```java
Day day = Day.SUNDAY;
2️⃣ Enum With Fields & Constructor

Enums can have:

Fields

Constructors

Methods

In this example, each day has an associated day number.

public enum Day {
    SUNDAY(1), MONDAY(2), TUESDAY(3), WEDNESDAY(4),
    THURSDAY(5), FRIDAY(6), SATURDAY(7);

    private final int dayNumber;

    Day(int dayNumber) {
        this.dayNumber = dayNumber;
    }

    public int getDayNumber() {
        return this.dayNumber;
    }
}

3️⃣ Using Enums With switch

Enums work extremely well with switch statements and are more efficient and cleaner than using Strings.

switch(day) {
    case MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY ->
        System.out.println("It is a weekday!");
    case SATURDAY, SUNDAY ->
        System.out.println("It is the weekend!");
}


No quotes, no typos, no invalid values.

4️⃣ Taking User Input With Enums

To convert user input into an enum constant, I used:

Day day = Day.valueOf(input.toUpperCase());


Since invalid input throws an exception, I handled it safely using try-catch.

try {
    Day day = Day.valueOf(response);
} catch (IllegalArgumentException e) {
    System.out.println("Please enter a valid day of the week!");
}

🧩 Code Written Today
enums.java
## 🧩 Code Covered

### enums.java
- Basic enum usage  
- Accessing enum methods  
- `switch`-case with enums  

### enums2.java
- User input with `Scanner`  
- Converting `String` input to enum  
- Exception handling for invalid values  

### Day.java
- Enum with constructor  
- Private fields  
- Getter method  

---

## 🧠 Key Takeaways
- Enums are safer and cleaner than Strings  
- Enums can contain fields, constructors, and methods  
- `switch` with enums is more efficient than `switch` with Strings  
- `valueOf()` converts `String` to enum but must be exception-safe  
- Enums make code more maintainable and error-resistant  

---

## ✅ Day Summary
- Learned enum fundamentals and best practices  
- Implemented enums with custom data  
- Used enums in switch statements  
- Handled user input safely with enums  
- Improved understanding of type-safe design in Java  
- Enums they are safe replacement for strings when the choices are limited
- Use enums when choices are fixed.
- Use Strings only when values are free-form.