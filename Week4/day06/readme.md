# 📘 Week 4 - Day 06  

## 🧩 Topics Covered  
- The `super` keyword in Java  
- Calling parent class constructors  
- Accessing parent attributes and methods  
- Using inheritance to extend functionality  
- Understanding superclass → subclass relationships  

---

## 🧠 Concepts Learned  

### 1️⃣ Why `super` is Needed  
When a subclass extends a parent class, the parent class may have its own constructor that requires certain arguments.  
To properly initialize the parent's attributes, the subclass MUST call the parent constructor using:

```java
super(first, last);
```

This ensures the parent is set up **before** the child adds its own features.

---

### 2️⃣ Accessing Parent Constructor  
The `super()` call must be the **first line** inside a subclass constructor:

```java
Student(String first, String last, double gpa) {
    super(first, last);  // Calls Person constructor
    this.gpa = gpa;      // Child class attribute
}
```

Without this, inherited attributes like `first` and `last` cannot be initialized correctly.

---

### 3️⃣ Inheriting Attributes & Methods  
Since `Student` and `Employee` extend `Person`, they inherit:

- `first`
- `last`
- `showName()`

They add their own features:

- **Student** → `gpa`, `showGPA()`  
- **Employee** → `salary`, `showSalary()`  

---

### 4️⃣ Subclass With Unique Behavior  
Each child class keeps the parent’s identity but adds its own identity:

```java
System.out.println(student.gpa);
student.showGPA();

employee.showSalary();
```

---

### 5️⃣ Class Relationship (Diagram)

```
Person (Superclass)
│
├── Student (Subclass)
│     └── gpa + showGPA()
│
└── Employee (Subclass)
      └── salary + showSalary()
```

---

## 🏁 Summary  
Today’s focus was understanding the **super keyword**, a core concept in OOP.

You learned:  
- Why subclasses must call the parent constructor  
- How `super()` initializes inherited attributes  
- How child classes extend parent functionality  
- How OOP hierarchy flows from parent → child  
- How subclass-specific behaviors are added cleanly

---
