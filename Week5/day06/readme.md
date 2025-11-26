# 🟦 Week 5 — Day 06  
## 🔷 Encapsulation in Java (Getters & Setters)

The focus today was **protecting object data** by using `private` fields and controlling access through **getter and setter methods**.  
This is the core of **Encapsulation** — hiding internal state and exposing controlled interfaces.

---

## 📘 Concepts Covered

### 🔹 What is Encapsulation?
Encapsulation = Binding data + methods together  
and **restricting direct access to internal variables**.

Why?
- prevents unwanted modification
- keeps object state valid
- adds validation/security
- creates predictable behavior

---

## 🔐 Public vs Private Fields

If class fields are `public`, anyone can change them:
```java
car.model = "Corvette";  // allowed if public

This is dangerous — it bypasses rules and breaks data integrity.

Solution: make fields private and access them indirectly.

🟩 Getter & Setter Methods
✔ Getter

Makes a field readable.

String getModel() { return model; }

✔ Setter

Makes a field modifiable.

void setPrice(int price) { this.price = price; }


You can add validation logic inside setters if needed.

💻 Files Practiced
File	Description
getterandsetter.java	Demo without encapsulation — modifying fields directly
Car.java	Private fields introduced — no getters/setters yet
getterandsetter2.java	Demo using getters and setters
Car2.java	Fully encapsulated class with getter/setter implementations


🚫 Bad Practice Example (No Encapsulation)

Car attributes are public → values can be changed from anywhere.

Car car = new Car("Charger", "Yellow", 10000);
System.out.println(car.model);  // Allowed
car.model = "Corvette";         // Also allowed ☢


This breaks intended behavior — initial data is not protected.

🟢 Good Practice: Private + Getter & Setter
private String model;
private String colour;
private int price;


Fields are hidden.
Access only through methods.

✔ Final Keyword for Read-Only Fields

If you want a value that never changes, mark it as final.

Example in Car2:

private final String model;


This makes:

model → readable via getter

but not writable

Perfect for fields that should stay constant after object creation.

🧪 Output Example

For encapsulated class (Car2):

Yellow Charger 10000
Blue Charger 5000


Model stays constant

Colour and price update through setters

🔥 Key Takeaways

Never expose class attributes as public.

Use private fields to protect state.

Getter → read the value

Setter → modify the value

final makes attributes read-only permanently.

Encapsulation allows you to insert validation & business rules later.

🏁 Reflection

Encapsulation isn’t about hiding code —
it’s about controlling access and ensuring objects stay valid.

Today clarified why well-designed classes don’t let random code mutate internal data:

You define the rules.

The object enforces them.

This is foundational for professional Java codebases.