# 📘 Day 03 — Arrays of Objects in Java

## 🧠 Concepts Learned
Today’s focus was on **Arrays of Objects** — how to store and manipulate multiple instances of a class efficiently using arrays.

### 🔹 Key Learnings:
1. **Creating an Array of Objects**
   - Instead of creating multiple individual object variables, objects can be stored inside an array for easier access and iteration.
   - Example:
     ```java
     Car car1 = new Car("Mustang", "Red");
     Car car2 = new Car("Corvette", "Blue");
     Car car3 = new Car("Charger", "Yellow");

     Car[] cars = {car1, car2, car3};
     ```

2. **Iterating Through Object Arrays**
   - Two common ways to loop through object arrays:
     - **Traditional for loop**
       ```java
       for (int i = 0; i < cars.length; i++) {
           cars[i].drive();
       }
       ```
     - **Enhanced for loop (for-each)**
       ```java
       for (Car car : cars) {
           car.drive();
       }
       ```

3. **Anonymous Objects**
   - Objects can be created directly inside the array without separate variable names.
     ```java
     Car[] cars = {
         new Car("Mustang", "Red"),
         new Car("Corvette", "Blue"),
         new Car("Charger", "Yellow")
     };
     ```

4. **Modifying Object Attributes in Arrays**
   - You can loop through the array and modify object properties:
     ```java
     for (Car car : cars) {
         car.colour = "Black";
     }
     ```

5. **Calling Methods on Array Elements**
   - Each element in the array is an object, so its methods can be called directly (e.g., `car.drive()`).

---

## 🧩 Example Output
You drive the Red Mustang
You drive the Blue Corvette
You drive the Yellow Charger
You drive the Black Mustang
You drive the Black Corvette
You drive the Black Charger


---

## 🧾 Summary
- Arrays of objects are used to handle multiple instances efficiently.  
- Enhanced for loops make code cleaner when iterating through arrays.  
- Anonymous objects are useful when you don’t need separate variable names.  
- You can modify and access attributes of objects inside an array directly.

---

## 📂 Files Covered
- `Car.java` — defines the Car class with model, colour, and drive() method.  
- `arrayofobjects.java` — demonstrates storing predefined objects in an array.  
- `arrayofobjects2.java` — demonstrates anonymous objects and attribute modification.
