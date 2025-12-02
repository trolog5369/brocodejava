# 🚀 Week 6 — Day 05 (Java — Writing Files)

## 📌 What I Learned Today

Today I learned how to **write data to files in Java**, specifically using the `FileWriter` class.  
File writing is **dangerous**, because paths may not exist or permissions can fail — so it must be handled using exceptions.

---

## 🗂️ Ways to Write Files in Java (Overview)
There are 4 common ways to write data in Java:

### 1️⃣ `FileWriter`
- Ideal for **small–medium text files**
- Simple
- Easy to use

### 2️⃣ `BufferedWriter`
- Better performance for **large text**
- Uses internal memory buffer

### 3️⃣ `PrintWriter`
- Best when writing **formatted or structured output**
- e.g. logs, reports

### 4️⃣ `FileOutputStream`
- Used for **binary files**
- e.g. images, audio, PDFs

**Today we worked with FileWriter only.**

---

## ✍️ Writing a File — Basic Example

```java
try (FileWriter writer = new FileWriter("test.txt")) {
    writer.write("I like pizza!");
    System.out.println("The file has been written");
}
Key Points

No absolute path → file will be created in current project directory.

try(...) = try-with-resources → automatically closes the writer.

Always wrap file write code in a try-catch.

📍 Writing with an Absolute Path
try (FileWriter writer = new FileWriter("C:\\brocodejava\\Week6\\day05\\testabsoultepath.txt")) {
    writer.write("I like pizza!\n its really good!");
    System.out.println("The file has been written");
}
catch (FileNotFoundException e) {
    System.out.println("Could not locate the file location");
}
catch (IOException e) {
    System.out.println("Could not write file");
}
Why use an absolute path?

Saves the file in a specific location.

Useful for logs, reports, or organized storage.

🔥 Try–Catch for File Writing

You always handle at least these two exceptions:

✔️ FileNotFoundException

Occurs when:

Path is invalid

Folder doesn’t exist

No access permissions

✔️ IOException

General writing/IO issue:

Failed disk access

Permission denied

Device write error

🧠 Code Optimization (Better Organization)

Instead of writing path + content inline → store in variables:

String filepath = "C:\\brocodejava\\Week6\\day05\\testabsoultepath.txt";
String textContent = "I like pizza!\n its really good!";

try (FileWriter writer = new FileWriter(filepath)) {
    writer.write(textContent);
    System.out.println("The file has been written");
}
catch (FileNotFoundException e) {
    System.out.println("Could not locate the file location");
}
catch (IOException e) {
    System.out.println("Could not write file");
}

Benefits

✔️ cleaner
✔️ reusable
✔️ scales better when files get large

🔥 Important Escape Notes

When working with file paths:

/ — single forward slash = escape/invalid in Windows.

\\ — double backslash = valid Windows path in Java literal.

🧾 Test Output

testabsoulutepath.txt

I like pizza!
 its really good!


test.txt

I like pizza!

💡 Reflection

File writing is not just typing strings into a file.
It demands safe code, proper paths, and clean exception handling.
Today made me understand why real programs handle I/O carefully — the smallest missing folder can crash everything.


---

