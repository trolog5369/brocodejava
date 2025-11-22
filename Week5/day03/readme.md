# 🟦 Week 5 — Day 03  
## 🔷 Interfaces in Java (Multiple Inheritance Behavior)

Today’s focus was on **Interfaces** — how they define behaviors, enforce contracts, and allow Java to simulate **multiple inheritance**.  
Kept the streak alive despite time pressure.

---

# 📘 Concepts Covered

## 🔹 What is an Interface?
An interface is a **blueprint of abstract methods** that a class must implement.

### Key points:
- All methods in an interface are **abstract by default**.
- A class can **implement multiple interfaces** → key difference from abstract classes.
- Interfaces help define **behavior-based roles** like:  
  - *Prey* → `flee()`  
  - *Predator* → `hunt()`
- Classes must provide the **actual implementation** of every interface method.

---

# 💻 Files Practiced

| File | Description |
|------|-------------|
| `interfaces.java` | Main driver class demonstrating interface behavior. |
| `Prey.java` | Interface defining the `flee()` behavior. |
| `Predator.java` | Interface defining the `hunt()` behavior. |
| `Rabbit.java` | Implements `Prey`, overrides `flee()`. |
| `Hawk.java` | Implements `Predator`, overrides `hunt()`. |
| `Fish.java` | Implements **both** `Prey` and `Predator` — showcasing multiple inheritance. |

---

# 🧠 What I Learned

### ✔ Interfaces vs Abstract Classes  
Interfaces allow a class to take **multiple roles**, unlike abstract classes which support only single inheritance.

### ✔ Implementation is mandatory  
If a class implements an interface, it must **override all its methods** — no skipping.

### ✔ Behavior modeling  
The same class can behave differently in different contexts  
(e.g., `Fish` can both flee *and* hunt).

### ✔ Clean separation  
Interfaces help separate **what something does** from **how it does it**.

---

# 🧪 Output Example

```text
the rabbit is running away
The hawk is hunting
The fish is swimming away!
The fish is hunting

🏁 Reflection
Even on a heavy day, stayed accountable and pushed progress.
Tomorrow’s workload doubles — and that’s fine.
Consistency isn’t about perfection — it's about showing up. Always.