# 🟦 Week 5 — Day 02  
## 🔷 Abstraction in Java (Abstract Classes & Methods)

Today’s session focused entirely on **Abstraction**, one of the four pillars of OOP.  
I practiced how **abstract classes enforce structure**, how **abstract methods must be implemented**, and how **concrete methods are inherited normally**.

---

# 📘 Concepts Covered

## 🔹 What is Abstraction?
Abstraction means **hiding implementation details** and exposing only the **essential features**.

### Key points:
- `abstract` classes **cannot be instantiated**.
- They can contain:
  - **abstract methods** → must be overridden in child classes.
  - **concrete methods** → inherited normally.
- Provide a **template** or **blueprint** for subclasses.
- Helps enforce **consistent implementation** across child classes.

---

# 💻 Files Practiced

| File | Description |
|------|-------------|
| `abstraction.java` | Main driver class demonstrating abstract class behavior. |
| `Shape.java` | Abstract superclass containing `abstract double area()` and concrete `display()`. |
| `Circle.java` | Subclass implementing the `area()` method for circles. |
| `Triangle.java` | Subclass implementing the `area()` method for triangles. |
| `Rectangle.java` | Subclass implementing the `area()` method for rectangles. |

---

# 🧠 What I Learned

### ✔ Why abstract classes exist  
To **prevent** creation of incomplete/general objects (e.g., no one should make a generic “Shape”).

### ✔ Abstract methods  
Force every subclass to implement their own version of `area()`.  
Circle, Triangle, Rectangle → all must define their formula.

### ✔ Concrete methods in abstract class  
`display()` acts as a reusable method inherited by all subclasses.

### ✔ Security & consistency  
Abstract classes ensure **only valid shapes** can be created.

---

# 🧪 Output Example

```text
This is a shape
This is a shape
This is a shape
28.274333882308138
10.0
42.0


🏁 Reflection
I learned how abstraction creates a blueprint for future classes.
This is already building your foundation for interfaces, polymorphism, and design patterns coming later.