# Day 07 — Generics in Java (Week 7)

## 📌 Overview
Today I learned **Generics in Java**, a core concept that allows writing **reusable, type-safe code** that works with different data types.  
Generics are commonly used in Java collections (like `ArrayList`) and can also be applied to **custom classes** with one or more type parameters.

---

## 📚 Concepts Learned

### **1️⃣ What Are Generics?**
Generics allow defining **classes, interfaces, or methods** that can work with **any data type**.

- `<T>` → **Type Parameter** (placeholder)
- `<String>`, `<Integer>` → **Type Arguments** (actual data types)

This improves:
- Type safety
- Code reusability
- Compile-time error checking

---

### **2️⃣ Generics in ArrayList**
Java collections already use generics internally.

Example:
```java
ArrayList<String> fruits = new ArrayList<>();
fruits.add("Apple");
fruits.add("Orange");
fruits.add("Banana");

String is the type argument

ArrayList<T> internally uses a type parameter

This ensures the list stores only one specific data type.

3️⃣ Creating a Generic Class (Single Type Parameter)

A reusable class that works with any data type.

public class Box<T> {

    T item;

    public void setItem(T item) {
        this.item = item;
    }

    public T getItem() {
        return this.item;
    }
}


Usage:

Box<String> box = new Box<>();
box.setItem("Banana");
System.out.println(box.getItem());


<T> is replaced with String

Only String values are allowed

4️⃣ Generic Class With Multiple Type Parameters

Java supports multiple type parameters like <T, U>.

public class Product<T, U> {

    T item;
    U price;

    Product(T item, U price) {
        this.item = item;
        this.price = price;
    }

    public T getItem() {
        return item;
    }

    public U getPrice() {
        return price;
    }
}


Usage:

Product<String, Double> product1 = new Product<>("Apple", 0.50);
System.out.println(product1.getItem() + " " + product1.getPrice());

Product<String, Integer> product2 = new Product<>("Ticket", 15);
System.out.println(product2.getItem() + " " + product2.getPrice());

🧠 Key Learnings

Generics make code type-safe and reusable

<T> is a placeholder replaced at compile time

Collections like ArrayList already use generics

Custom generic classes reduce duplication

Multiple type parameters are supported (<T, U, V>)

🧩 Code Written Today

generics.java — Generic usage with ArrayList

generics2.java — Generic classes in action

Box<T> — Single type parameter class

Product<T, U> — Multiple type parameter class

✅ Day Summary

Understood Java generics clearly

Used generics with collections

Created reusable generic classes

Worked with single and multiple type parameters

Strengthened understanding of type safety in Java