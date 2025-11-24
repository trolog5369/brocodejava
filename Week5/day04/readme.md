# 🟦 Week 5 — Day 04  
## 🔷 Polymorphism in Java (Dynamic Method Dispatch)

Today’s session was focused on **Polymorphism**, one of the core principles of OOP.  
I learned how different subclasses can be referenced using a **common superclass**, and how the overridden methods get called **dynamically at runtime**.

---

# 📘 Concepts Covered

## 🔹 What is Polymorphism?
Polymorphism literally means **“many forms.”**  
It allows a reference of the **parent class** to point to **multiple subclass objects**, while calling their own overridden implementations.

---

### ✔ Core Understanding
- Same method name → **different behavior** depending on object type.
- Subclasses extend a base class and override shared methods.
- Parent reference can store child objects:
  ```java
  Vechile v = new Car();
  ```
- When `v.go()` is called → the version from **Car** executes.

---

# 💻 Files Practiced

| File | Description |
|------|-------------|
| `Polymorphism.java` | Main driver demonstrating polymorphism with a `Vechile[]` array. |
| `Vechile.java` | Abstract superclass containing abstract `go()` method. |
| `Car.java` | Implements `go()` → `"You drive the car"`. |
| `Bike.java` | Implements `go()` → `"You ride the bike"`. |
| `Boat.java` | Implements `go()` → `"You sail the boat"`. |

---

# 🧠 What I Learned

### 🔸 Why the subclass arrays failed
Arrays of type `Car[]`, `Bike[]`, `Boat[]` failed because:
- A `Bike` is not a `Car`, and vice-versa.
- These types are **sibling subclasses**, not interchangeable.

### 🔸 The solution
Use a **common superclass reference**:
```java
Vechile[] vechiles = { car, bike, boat };
```
Since all of them extend `Vechile`, they are **valid instances of it.**

### 🔸 Runtime method binding
Even though the array stores them as `Vechile`,  
calling `vechile.go()` runs the **subclass version**:
- Car → drive  
- Bike → ride  
- Boat → sail

This is **dynamic method dispatch**, the real power of polymorphism.

---

# 🧪 Output Example

```text
You drive the car
You ride the bike
You sail the boat
```

---

# 🏁 Reflection
Polymorphism makes code extensible and scalable.  
Instead of writing separate code paths for Car/Bike/Boat,  
a single parent type handles them polymorphically.

This idea is the foundation for **interfaces, frameworks, collections, and real-world architecture.**  
It forces you to stop thinking about objects individually and start thinking in **abstractions**.

