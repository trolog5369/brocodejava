# 🟦 Week 06 — Day 03
## 🔷 Java ArrayList — Dynamic Collections

---

## 📘 Overview
Today I learned **ArrayList**, a resizable collection in Java.
Unlike normal arrays (fixed size), ArrayList can grow or shrink at runtime.
It stores **objects**, not primitives → autoboxing happens (`int → Integer`).

---

## 🧩 Why ArrayList
- No fixed length
- Works with object types
- Has built-in methods for modification
- Supports sorting via Collections Framework

---

## 🔧 Core Methods

### ➤ `add(value)`
Insert element at the end.

### ➤ `remove(index)`
Delete element at a specific index.

### ➤ `set(index, value)`
Replace element.

### ➤ `get(index)`
Fetch element by index.

### ➤ `size()`
Returns total number of elements.

### ➤ `Collections.sort(list)`
Sorts elements (alphabetically or numerically)

---

## 🧪 Example — Basic ArrayList

```java
ArrayList<Integer> list = new ArrayList<>();
list.add(3);
list.add(1);
list.add(2);
System.out.println(list);

ArrayList<Double> list2 = new ArrayList<>();
list2.add(3.14);
list2.add(1.99);
list2.add(2.01);
System.out.println(list2);

ArrayList<String> fruits = new ArrayList<>();
fruits.add("Apple");
fruits.add("Orange");
fruits.add("Banana");
fruits.add("Coconut");
System.out.println(fruits);

System.out.println(fruits.get(0));
System.out.println(fruits.size());

Collections.sort(fruits);
System.out.println(fruits);

🧪 Example — User Input → Create List
Scanner scanner = new Scanner(System.in);
ArrayList<String> foods = new ArrayList<>();

System.out.print("Enter the number of foods you want: ");
int count = scanner.nextInt();
scanner.nextLine();

for (int i = 1; i <= count; i++) {
    System.out.print("Enter food " + i + ": ");
    foods.add(scanner.nextLine());
}

System.out.println("Your food list: " + foods);
scanner.close();

🧠 Takeaways

Arrays = fixed size. ArrayList = dynamic growth.

Stores objects, not primitives.

Built-in methods remove hassle of manual resizing.

Works well with sorting and utility methods.