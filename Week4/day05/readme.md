# 📘 Week 4 - Day 05  

## 🧩 Topics Covered  
- Inheritance in Java  
- Multilevel Inheritance  
- Extending classes using the `extends` keyword  
- Unique attributes and methods in subclasses  

---

## 🧠 Concepts Learned  

### 1. Basic Inheritance  
Inheritance allows one class to inherit attributes and methods from another class using the `extends` keyword.  
A parent class (superclass) can have multiple child classes (subclasses).

Example:  
`Animal` acts as the parent class for `Dog` and `Cat`.

```java
public class Animal extends Organism {
    void eat() {
        System.out.println("The animal is eating");
    }
}
2. Child Classes and Unique Methods

Each child class inherits attributes/methods from its parent but can also have unique properties and behaviors.

public class Dog extends Animal {
    int lives = 1;
    void speak() {
        System.out.println("The dog goes woff!");
    }
}

public class Cat extends Animal {
    int lives = 9;
    void speak() {
        System.out.println("The cat goes meow!");
    }
}
3. Grandparent Class

Organism acts as the grandparent class. It provides base properties that are inherited by all other classes.
public class Organism {
    boolean isAlive;
    Organism() {
        isAlive = true;
    }
}
4. Multilevel Inheritance

A class can inherit from another class, which itself inherits from another class — forming a hierarchy.
This demonstrates multilevel inheritance.
public class inheritance2 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();

        dog.eat();       // From Animal
        cat.eat();       // From Animal
        dog.speak();     // From Dog
        cat.speak();     // From Cat

        System.out.println(dog.isAlive); // From Organism
        System.out.println(cat.isAlive); // From Organism
    }
}
5. Sibling Class Example

Plant is also a child class of Organism, but it has no relation to Animal.
This shows how different subclasses can exist under the same parent class independently.
public class Plant extends Organism {
    void photosyntheisis() {
        System.out.println("The plant absorb sunlight");
    }
}
6. Combined Example: Family Tree
Organism (Parent of Animal & Plant)
│
├── Animal (Parent of Dog & Cat)
│   ├── Dog
│   └── Cat
│
└── Plant
🧩 Code Example
public class inheritance {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();

        System.out.println(dog.isAlive);
        System.out.println(cat.isAlive);

        dog.eat();
        cat.eat();

        System.out.println(dog.lives);
        System.out.println(cat.lives);

        dog.speak();
        cat.speak();
    }
}
🏁 Summary

Today’s focus was on understanding inheritance, the foundation of object-oriented programming.
You learned:

How child classes inherit from parent and grandparent classes.

How unique attributes and methods can exist in subclasses.

How multilevel inheritance creates a class hierarchy.

How unrelated subclasses can still share common traits through a single ancestor.