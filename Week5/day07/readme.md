# 🟦 Week 5 — Day 07
## 🔷 Aggregation in Java (HAS-A Relationship)

Aggregation represents a **HAS-A relationship** where one object contains another object, but the contained object can exist independently.

Example:  
A **Library has Books**, but **Books still exist even if the Library is deleted**.

---

## 📘 What is Aggregation?

**Aggregation = One class contains objects of another class, without owning them.**

✔ The container stores references  
✔ The contained objects live independently  
✔ Breaking the container does NOT delete the objects  
❌ Not inheritance  
❌ Not composition (no lifecycle binding)

---

## 🧱 Classes Used

### 🟢 Book (Independent class)

- Holds its own attributes: title, pages  
- Can exist without Library  
- Provides its own method to display information

### 🟢 Library (Container class)

- Contains an array of Book objects  
- Only references them, does not control their lifecycle  
- Displays library info + all books

### 🟢 Driver (aggregation.java)

- Creates Book objects first  
- Then groups them in an array  
- Passes them to Library  
- Demonstrates HAS-A relationship

---

## 📦 Example Output
The Fellow of the Ring (423 pages)
The Two Towers (352 pages)
The Return of the King (416 pages)

The 1897 NYC Public Library
Books avaliable:
The Fellow of the Ring (423 pages)
The Two Towers (352 pages)
The Return of the King (416 pages)


---

## 🧠 Key Takeaways

✔ Aggregation = HAS-A  
✔ Objects can survive without the container  
✔ Great for modular & reusable design  
✔ Reduces coupling between classes  
✔ Matches real-world relationships

> Books exist without Library.  
> Library simply references Books.

---

## 🏁 Reflection

Aggregation moves you away from “god classes” and toward clean OOP:

- Each object has responsibility over itself  
- Classes interact without owning each other  
- You can reuse objects in multiple structures  
- Your architecture becomes scalable and realistic

This is a critical OOP skill — modeling real relationships where objects cooperate without controlling one another.
