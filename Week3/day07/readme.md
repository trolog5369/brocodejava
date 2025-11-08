# 🚗 Day 07 – Java Classes and Objects (Car Example)

### 🧠 Topics Covered:
- Defining Classes and Creating Objects  
- Using Constructors  
- Understanding `this` keyword  
- Accessing class attributes and methods  
- Basic OOP structure  

---

## 📘 car1.java
```java
public class car1 {
    String brand;
    String color;
    int year;

    // Constructor
    public car1(String brand, String color, int year) {
        this.brand = brand;
        this.color = color;
        this.year = year;
    }

    // Method to display details
    void displayInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Color: " + color);
        System.out.println("Year: " + year);
        System.out.println("-------------------------");
    }
}

public class car2 {
    public static void main(String[] args) {
        // Creating objects of car1 class
        car1 carA = new car1("Toyota", "Red", 2020);
        car1 carB = new car1("BMW", "Black", 2022);
        car1 carC = new car1("Honda", "White", 2019);

        // Displaying details
        carA.displayInfo();
        carB.displayInfo();
        carC.displayInfo();
    }
}

Output
Brand: Toyota
Color: Red
Year: 2020
-------------------------
Brand: BMW
Color: Black
Year: 2022
-------------------------
Brand: Honda
Color: White
Year: 2019
-------------------------
