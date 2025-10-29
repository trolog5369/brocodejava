# 📘 Day 07 – Method Overloading & Variable Scope

### 🧠 Concepts Covered
- **Method Overloading** – Multiple methods sharing the same name but with different parameters (signatures).
- **Variable Scope** – Understanding where variables can be accessed (local vs class).

---

### 🧩 Programs

#### 🔹 overloadedmethods.java  
Introduces **method overloading** with multiple `add()` methods — one for two parameters and another for three.  
Shows how Java allows same method names if the *signature* (name + parameter list) is different.

#### 🔹 overloadedmethods2.java  
Demonstrates **invalid overloading** — two methods with the same signature and same name cause a compile-time error.  
Explains why method overloading must have unique parameter lists.

#### 🔹 overloadedmethods3.java  
A **pizza-baking example 🍕** to visualize method overloading with multiple parameter sets (bread, cheese, topping).  
Highlights how Java chooses the method that matches the argument pattern.

#### 🔹 variablescope.java  
Shows **local variable scope**, meaning a variable declared inside one method cannot be accessed by another.

#### 🔹 variablescope2.java  
Introduces **class-level (static) scope** — variables declared at class level can be accessed across all methods.

#### 🔹 variablescope3.java  
Demonstrates **variable shadowing**, where a local variable overrides a class-level variable with the same name.

---

### 🧭 Summary
- Method names can repeat **only** if their parameter lists differ.  
- **Local scope** → variable lives only within its method.  
- **Class scope** → variable is accessible across the class.  
- When names overlap, **local variables take priority** over class ones.  
- Overloading enhances **readability and reusability** of your code.

---

### ✅ Status
☑️ **Day 07 Completed Successfully**

