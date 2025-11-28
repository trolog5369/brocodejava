![Status](https://img.shields.io/badge/Status-Completed-brightgreen)
![Java](https://img.shields.io/badge/Language-Java-orange?style=for-the-badge&logo=java&logoColor=white)

# 🟦 Week 06 — Day 01  
## 🔷 Composition in Java (PART-OF Relationship)

---

## 📘 Overview
Today’s topic covered **Composition**, a strong form of association in Object-Oriented Programming.  
It represents a **PART-OF** relationship between two classes where the child object **cannot exist independently** of the parent.

Example:  
➡️ A **Car** has an **Engine**.  
If the Car object is deleted, the Engine object is also gone — because it is a part of the Car, not separate from it.

---

# 🧩 What is Composition?

✔ The lifecycle of the contained object depends on the parent.  
✔ Parent object *owns* the child object.  
✔ When the parent object is destroyed → the child object is destroyed too.  
✔ This is **strong association**.

❌ Not Aggregation  
Aggregation = HAS-A but independent  
Composition = PART-OF and dependent

---

## 📦 Example Implementation

### 1️⃣ The Child Object → `Engine`
Holds engine type and the behavior to start it.

```java
public class Engine {
    String type;

    Engine(String type){
        this.type=type;
    }
    
    void start(){
        System.out.println("You start the "+this.type+" engine");
    }
}
The Engine exists only because the Car creates it — this is the core of Composition.

2️⃣ The Parent Object → Car

Creates the engine internally and owns it.
public class Car {
    String model;
    int year;
    Engine engine;

    Car(String model,int year,String engineType){
        this.model=model;
        this.year=year;
        this.engine=new Engine(engineType); // Composition: Car creates the Engine
    }

    void start(){
        this.engine.start();
        System.out.println("The "+this.model+" is running");
    }
}
Engine is not passed externally.

Car constructs it itself.

So Engine dies with Car.

3️⃣ Driver Code
public class composition {
    public static void main(String[] args) {

        Car car=new Car("Corvette", 2025, "V8");

        System.out.println(car.model);
        System.out.println(car.year);
        System.out.println(car.engine); // shows reference
        System.out.println(car.engine.type);

        car.start();
    }
}
🧪 Output Behavior

Printing car.engine shows memory hash → object reference.

To display meaningful values, access fields/methods:

car.engine.type

car.engine.start()

car.start() triggers:

Engine start

Car running message

Example output flow:
Corvette
2025
Engine@HASH_ID
V8
You start the V8 engine
The Corvette is running
🧠 Key Principles I Learned
🔥 Composition = Strong Ownership

The parent controls:

creation

usage

destruction

🧬 Lifecycle Dependency

Child dies with parent.
No independent existence.

🧱 Realistic OOP Modeling

Composition reflects real world:

Computer → CPU

Human → Heart

Car → Engine

The part has no purpose beyond the whole.

🏁 Reflection

Composition forced me to think beyond “objects passing objects”.
Instead, I modeled how complex systems are constructed from smaller building blocks.

A composed object is not an accessory — it is a structural part of the whole.

This mindset leads to cleaner architecture and scalable OOP systems.