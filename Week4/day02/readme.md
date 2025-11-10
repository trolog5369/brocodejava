### 🧠 Day 02 – Overloaded Constructors in Java

#### 📘 What I Learned:
- Overloaded constructors allow a class to have multiple constructors with the same name but different parameter lists.
- This lets us create objects in various ways depending on how much data we have during initialization.
- Each constructor can assign default values for missing attributes to keep the object consistent.

#### 💡 Key Concepts:
1. **Constructor Overloading**
   - Same constructor name but different parameter count or type.
   - Java automatically calls the correct constructor based on the arguments passed.

2. **Use Case**
   - Useful when some fields are optional or when you want flexibility while creating objects.

#### 🧩 Example from Code:
```java
User user1 = new User("Spongebob");                  // only username
User user2 = new User("Patrick", "PStar@aol.com");   // username + email
User user3 = new User("Sandy", "SCheeks@gmail.com", 27); // username + email + age
User user4 = new User();                             // guest (no data)

### **Result** :
Spongebob
not provided
0
Patrick
PStar@aol.com
0
Sandy
SCheeks@gmail.com
27
Guest
not provided
0
