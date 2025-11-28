![Status](https://img.shields.io/badge/Status-Completed-brightgreen)
![Java](https://img.shields.io/badge/Language-Java-orange?style=for-the-badge&logo=java&logoColor=white)
![GitHub](https://img.shields.io/badge/GitHub-Trolog5369-black?style=for-the-badge&logo=github&logoColor=white)

# 🚀 Week 05 — Object Oriented Programming (Deeper Concepts)

### 📘 Overview
This week focused on understanding the **true structure of Java OOP**, not just writing classes.  
I learned how abstraction, interfaces, encapsulation, and object relationships shape real software design.  
The key shift was from coding random classes to building **systems of cooperating objects**.

---

# 📂 Daily Breakdown

---

## **Day 01 — Custom Object Output (`toString()`)**
- Overrode the default `toString()` so objects print meaningful information.
- Learned that every class implicitly extends `Object`.
- Instead of printing memory addresses, I controlled the output format.
- Nested objects call their own `toString()` which keeps output consistent.

---

## **Day 02 — Abstraction**
- Abstract classes prevent creation of incomplete generic objects.
- Abstract methods force subclasses to implement required behavior.
- Used an abstract base type to define a template for child classes.
- Realized that `Shape`, `Vehicle`, etc. should never exist directly.

---

## **Day 03 — Interfaces**
- Interfaces describe **what an object can do**, not what it is.
- A class can implement multiple interfaces.
- Practical example:
  - Prey → `flee()`
  - Predator → `hunt()`
- One class can play multiple roles without inheritance problems.

---

## **Day 04 — Polymorphism (Parent References)**
- Understood why sibling objects cannot be stored together by their own types.
- Used parent references:
Vehicle[] vehicles

- Called overridden methods using a single reference type.
- Realized how frameworks and APIs handle different implementations.

---

## **Day 05 — Runtime Polymorphism**
- Parent reference → child object → JVM resolves actual implementation.
- Method overriding decides behavior at runtime, not compile-time.
- Used dynamic dispatch in examples where user choice determined objects.

---

## **Day 06 — Encapsulation**
- Exposed no public mutable fields.
- Used `private` attributes with getters/setters.
- Setters allowed controlled updates, avoiding invalid state.
- Understood why properly encapsulated classes are more robust.

---

## **Day 07 — Aggregation (HAS–A Relationship)**
- One object contains references of another, but does not own its lifecycle.
- Library → Books
- Books exist independently of Library.
- A clean way to model relationships without inheritance or composition.

---

# ⚡ Concepts Covered
- `toString()` method
- Abstract classes and abstract methods
- Interfaces (multiple contracts)
- Method overriding
- Runtime polymorphism (dynamic dispatch)
- Encapsulation with access modifiers
- Aggregation (HAS–A relationships)

---

# 🧠 Reflection
This week clarified how real software is structured.  
Instead of cramming everything into one class, I focused on responsibilities, roles, and object interaction.  
These concepts organize code and prevent complexity as projects grow.

The key mindset change:
**Design objects to cooperate, not to depend on each other blindly.**

---

# ⚙️ Tools
- **Language:** Java  
- **Editor:** VS Code / IntelliJ IDEA  
- **Execution:** Terminal (`javac` + `java`)

---

# 🎯 Next Week Goals
- Learn packages and access control in larger codebases.
- Start OOP mini-projects with multiple classes.
- Get comfortable with constructors + abstraction + interfaces combined.
- Begin moving toward clean OOP design patterns.

---

## 📫 Connect With Me
<p align="left">
<a href="https://www.linkedin.com/in/pranav-gaikwad-b09247350" target="_blank">
  <img align="center" src="https://raw.githubusercontent.com/rahuldkjain/github-profile-readme-generator/master/src/images/icons/Social/linkedin.svg" height="30" width="40" />
</a>
<a href="https://instagram.com/_pranav.xr" target="_blank">
  <img align="center" src="https://raw.githubusercontent.com/rahuldkjain/github-profile-readme-generator/master/src/images/icons/Social/instagram.svg" height="30" width="40" />
</a>
<a href="mailto:pranavgaikwad847@gmail.com" target="_blank">
  <img align="center" src="https://raw.githubusercontent.com/rahuldkjain/github-profile-readme-generator/master/src/images/icons/Social/gmail.svg" height="30" width="40" />
</a>
</p>

*Week 05 was not about remembering syntax. It was about understanding how objects collaborate in real-world Java.*
