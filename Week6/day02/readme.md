![Status](https://img.shields.io/badge/Status-Completed-brightgreen)
![Java](https://img.shields.io/badge/Language-Java-orange?style=for-the-badge&logo=java&logoColor=white)

# 🟦 Week 06 — Day 02  
## 🔷 Java Wrapper Classes, Autoboxing & Unboxing

---

## 📘 Overview
Today I studied **Wrapper Classes** in Java — special classes that allow primitive values to be treated as objects.

Wrapper classes are especially important when working with:
- **Collections (ArrayList, HashMap, etc.)**
- **Utility methods**
- **Type conversions**
- **Object-based APIs**

---

## 🧩 Why Wrapper Classes Exist
Primitive types (`int`, `double`, `char`, `boolean`) cannot be used directly in many object-based contexts.

Wrapper classes provide an object form:
- `Integer`
- `Double`
- `Character`
- `Boolean`

### Core benefits:
✔ Use primitives with the Java Collections Framework  
✔ Access built-in helper / utility methods  
✔ Convert between types (String → primitive, primitive → String)

---

# 🟠 Autoboxing (Automatic wrapping)
Java converts primitives → wrapper objects automatically.

```java
Integer a = 123;
Double b = 3.14;
Character c = '$';
Boolean d = true;

No need to write:

Integer a = new Integer(123);

🔵 Unboxing (Automatic unwrapping)

Java converts wrapper objects → primitive values.

int x = a;
double y = b;
char i = c;
boolean j = d;


Datatype must match its wrapper type.

📦 Utility Methods in Wrapper Classes
🔹 Primitive to String

Using .toString() static methods:
String a = Integer.toString(123);
String b = Double.toString(3.14);
String c = Character.toString('@');
String d = Boolean.toString(false);

String x = a + b + c + d;
System.out.println(x);
🔹 String to Primitive (Parsing)

Opposite of above:

int e = Integer.parseInt("123");
double f = Double.parseDouble("3.14");
boolean h = Boolean.parseBoolean("true");


There is no parseChar() → use string methods:

char g = "Pizza".charAt(0);

🧠 Character Utility Methods

These help when validating input.

char letter = 'b';
System.out.println(Character.isLetter(letter));     // true
System.out.println(Character.isUpperCase(letter)); // false

🧠 Key Takeaways

🔥 Only use wrapper types when necessary

Working with collections

Using utility methods

Frameworks requiring objects

🔷 Autoboxing → wraps primitive into object
🔷 Unboxing → extracts primitive back from wrapper

Wrapper classes add flexibility and provide powerful static utilities,
but primitives remain better for raw performance.

🏁 Reflection

Learning wrapper classes made it clear why Java treats primitives differently from objects.
Instead of hacks or conversions everywhere, autoboxing/unboxing handles it cleanly,
and wrapper utilities help a lot when manipulating data, parsing inputs, or validating user values.