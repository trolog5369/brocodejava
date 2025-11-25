# 🟦 Week 5 — Day 05  
## 🔷 Runtime Polymorphism in Java (Abstract Classes + Method Overriding)

Today’s focus was **dynamic polymorphism** — where the method executed is determined **at runtime** based on the **actual object**, not the reference type.  
This was implemented using an **abstract superclass (`Animal`)** and subclasses (`Dog`, `Cat`) overriding the `speak()` method.

---

## 📘 Concepts Covered

### 🔹 What is Runtime Polymorphism?
Runtime polymorphism (a.k.a. dynamic method dispatch) means:

> The JVM decides which overridden method to run **during execution**, not during compilation.

Example:
```java
Animal a = new Dog();
a.speak();  
Even though the reference is Animal, the JVM checks the real object (Dog) and uses its version of speak().

🔹 Abstract Classes

Cannot be instantiated.

Used to define a template or base behavior.

Can have:

abstract methods → must be overridden

concrete methods → inherited normally

In this program:
abstract class Animal {
    abstract void speak();
}
Any class extending Animal is forced to define its own speak().

.

🧱 Why This Matters

Without abstraction and polymorphism, the program would become a mess of if/else blocks and duplicated code.

Polymorphism solves this by:

Using one reference type (Animal)

Handling multiple behaviors (Dog, Cat)

💻 Files Practiced
File	Description
runtimepolymorphism.java	Main driver — user chooses animal type at runtime.
Animal.java	Abstract superclass defining speak().
Dog.java	Subclass overriding speak() → "The dog goes woff!".
Cat.java	Subclass overriding speak() → "The cat goes meow!".
🧠 What I Learned
✔ The reference type ≠ the object type

A parent reference:
Animal a;
can point to multiple child types:

a = new Dog();
a = new Cat();
This flexibility is the core of polymorphism.

✔ Why abstract classes exist

To prevent this nonsense:

Animal a = new Animal(); // Invalid


You don’t want to create “generic animals.”
You want real behavior — Dog, Cat, etc.

Abstract classes enforce that.

✔ Runtime decision-making

The program does not know the chosen class at compile time.
It only knows when the user inputs something:

1 → create Dog

2 → create Cat

Then .speak() executes the overridden version.

🧪 Output Example

When user picks 1
Would you like a dog or cat (1=dog,2=cat): 1
The dog goes woff!
When user picks 2

bash
Copy code
Would you like a dog or cat (1=dog,2=cat): 2
The cat goes meow!


🔥 Key Takeaways
Runtime polymorphism works through method overriding, not overloading.

The parent reference points to child objects.

JVM selects the method implementation based on the actual instance.

Abstract classes prevent incomplete or meaningless object creation.

You can extend this system easily without editing main logic:

Add Bird, Horse, etc.

Just implement speak().

🏁 Reflection
Today was the moment polymorphism stopped being theory.
I finally saw how a single parent type can manage different behaviors.