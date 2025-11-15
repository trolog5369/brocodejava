# Day 07 – Method Overriding in Java

This project demonstrates **Method Overriding**, a core concept of Object-Oriented Programming.  
You define a method in the **parent class**, and the **child class** gives its *own implementation* for that same method.

---

## 📌 What You Learned Today

### ✅ What is Method Overriding?
- A subclass **redefines** a method already defined in its parent.
- The method must have:
  - Same name  
  - Same parameters  
  - Same return type  
- Helps achieve **runtime polymorphism**.
- Allows subclasses to have **specific behavior** without rewriting the whole parent class.

### ✅ Why Override?
Because different animals **move differently**, but all still *move*.  
This allows:
- **Code reusability** from the parent class.
- **Specific implementation** in subclasses.
- **Cleaner and more logical design**.

### 🔥 Key Rule (Precedence)
If a child class has a method with the same name →  
**The child class version is used first**, overriding the parent’s version.

---

## 📂 Files Overview

### **Animal.java**
```java
public class Animal {
    void move() {
        System.out.println("This animal is running");
    }
}

Cat.java
public class Cat extends Animal {

}

Dog.java
public class Dog extends Animal {

}

Fish.java
public class Fish extends Animal {

    @Override
    void move() {
        System.out.println("This animal is swimming");
    }
}

methodoverriding.java (Main File)
public class methodoverriding {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
        Fish fish = new Fish();

        dog.move();
        cat.move();
        fish.move();
    }
}

🖼️ UML Diagram (Simple)
           Animal
             |
     -----------------
     |       |       |
    Dog     Cat     Fish
                     |
                 overrides move()

📝 Output Before Overriding
This animal is running
This animal is running
This animal is running

📝 Output After Overriding
This animal is running
This animal is running
This animal is swimming

🎯 Summary

Reused the move() method from the parent.

customized behavior for the Fish class using method overriding.

This is the foundation of polymorphism.