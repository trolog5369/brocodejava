# Week 08 — Day 01: HashMap in Java

## 📌 Overview

Today I learned and practiced **HashMap** in Java by writing two programs that demonstrate how key–value data structures work.

HashMap is part of the Java Collections Framework and is used to store data in **key–value pairs**, where:
- **Keys are unique**
- **Values can be duplicated**
- The order of elements is **not guaranteed**
- It is **efficient for fast lookup, insertion, and deletion**

---

## 📚 Concepts Learned

### 1️⃣ HashMap Basics

- HashMap stores data as `key → value` pairs
- Uses **generics**: `HashMap<K, V>`
- Keys must be unique — inserting a duplicate key **overrides the old value**

Example:
```java
HashMap<String, Double> map = new HashMap<>();
map.put("apple", 0.50);
map.put("orange", 0.75);

2️⃣ Duplicate Keys Behavior

If a key already exists, adding it again replaces the old value:

map.put("orange", 100000000.00);


This overrides the previous "orange" value.

3️⃣ Common HashMap Methods

put(key, value) → add or update an entry

get(key) → retrieve value using key

remove(key) → delete an entry

containsKey(key) → check if key exists

containsValue(value) → check if value exists

size() → number of key–value pairs

keySet() → returns all keys in the map

4️⃣ Iterating Through a HashMap

Using an enhanced for-loop with keySet() for clean output:

for (String key : map.keySet()) {
    System.out.println(key + " : $" + map.get(key));
}


This avoids messy default formatting and improves readability.

🧩 Code Written Today
hashmaps.java

Created a basic HashMap

Added key–value pairs

Demonstrated duplicate key override behavior

hashmaps2.java

Added and removed elements

Retrieved values safely using containsKey()

Checked for values using containsValue()

Printed map size

Iterated over HashMap using keySet()

✅ Day Summary

Understood how HashMap stores and manages data

Learned why keys must be unique

Practiced all essential HashMap methods

Used enhanced for-loops for clean iteration

Strengthened understanding of Java Collections and generics

📍 Status: Day 01 of Week 08 completed successfully
📚 Focus: Core Java Collections — HashMap