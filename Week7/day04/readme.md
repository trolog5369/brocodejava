# Day 04 — Anonymous Classes in Java

## 📌 Overview
Today I learned about **Anonymous Classes** in Java — a powerful way to customize behavior without creating a new class file. They’re mainly used when you need a small modification to an existing class only once.

---

## 📚 Concepts Learned

### **1️⃣ What Are Anonymous Classes?**
- A class **without a name**  
- Defined and instantiated **at the same time**  
- **Cannot be reused**  
- Allow quick custom behavior with minimal code  
- Common in:
  - `Runnable`
  - `TimerTask`
  - Event listeners
  - Callbacks

---

### **2️⃣ Why Use Anonymous Classes?**
Creating a whole new class just to override *one method* is overkill.

Example:
- A `Dog` class has a `speak()` method.
- Scooby Doo speaks differently.
- Instead of creating `TalkingDog.java`, we override behavior in one place using an anonymous class.

Anonymous classes solve this instantly and cleanly.

---

## 🧠 Key Learnings
- You can override methods directly inside object creation.
- Syntax:
  ```java
  ClassName ref = new ClassName() {
      @Override
      void method() {
          // custom behavior
      }
  };
  
Ideal for one-time customized behavior.

Improves readability when used properly.

🧩 Code Written Today
Dog.java
🧩 Code Written Today
Dog.java
public class Dog {
    void speak() {
        System.out.println("The dog goes woff!");
    }
}

TalkingDog.java
public class TalkingDog extends Dog {
    @Override
    void speak() {
        System.out.println("Scooby Doo says Ruh Roh!");
    }
}

anonymousclasses.java
public class anonymousclasses {
    public static void main(String[] args) {

        System.out.println("Before anonymous classes: ");
        Dog dog1 = new Dog();
        dog1.speak();

        TalkingDog talkingDog = new TalkingDog();
        talkingDog.speak();

        System.out.println("After anonymous classes: ");
        Dog dog2 = new Dog() {
            @Override
            void speak() {
                System.out.println("Scooby Do goes Ruh Roh");
            }
        };
        dog2.speak();
    }
}

✅ Day Summary

Understood what anonymous classes are

Learned when (and when not) to use them

Applied method overriding inside object creation

Reduced boilerplate by customizing behavior without creating a new class