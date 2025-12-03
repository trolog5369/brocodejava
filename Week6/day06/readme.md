# 🚀 Week 6 — Day 06 (Java File Reading)

## 📌 What I learned today
Today was about **reading files in Java**.  
Unlike writing files, reading introduces new classes and patterns made for performance and safety.

---

## 🔥 3 Popular ways to read files in Java

### 1️⃣ **BufferedReader + FileReader** (⭐ Most common)
- Best for reading **text files line-by-line**
- `BufferedReader` = middleman, efficient
- `FileReader` = actually reads the file

Perfect for small–medium files like:
✔️ text
✔️ config files
✔️ logs

---

### 2️⃣ **FileInputStream**
- Best for **binary files**
  - images
  - audio
  - PDFs
  - videos

---

### 3️⃣ **RandomAccessFile**
- Best when you need to:
  - read/write at **specific portions**
  - edit large files
  - modify data without loading whole file into memory

---

## 🧠 Core Concept: BufferedReader + FileReader
🔹 You wrap a **FileReader** inside a **BufferedReader**  
🔹 Then repeatedly read lines until `null` (end of file)

This combination = extremely efficient for text.

---

## 🧱 Code Example — Reading a File

```java
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class readfiles {
    public static void main(String[] args) {

        String filepath = "C:\\brocodejava\\Week6\\day06\\test.txt";

        try (BufferedReader reader = new BufferedReader(new FileReader(filepath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        }
        catch (FileNotFoundException e) {
            System.out.println("Could not locate file!");
        }
        catch (IOException e) {
            System.out.println("Something went wrong!");
        }
    }
}
🔍 How the reading loop works
❓ What does reader.readLine() do?

Reads one full line at a time

Moves pointer to the next line

Returns:

The string for that line

null when end of file

👇 That’s why we loop:
while ((line = reader.readLine()) != null) { ... }


As long as the file has lines → program prints them.
Stop when it hits null.

⚠️ Exception Handling
FileNotFoundException

Triggers when:

Path is wrong

File doesn’t exist

IOException

Catches:

I/O failures

Reading issues

Hardware / OS problems

Unexpected file errors

📌 Why try-with-resources is used?

Because:

try (BufferedReader reader = new BufferedReader(...))


Automatically closes the reader when finished.

You don’t need finally { reader.close(); }
Cleaner, safer, professional.

🏁 Reflection

Reading files is a fundamental skill.
Today’s lesson clarified:

how BufferedReader wraps FileReader

how to iterate line by line

why exceptions matter

how to safely manage file resources

This builds the foundation for:

reading config files

logs

external data sources

game scripts

report generation

🧾 Output Example (test.txt)
Roses are read
Violets are blue
BOOTY BOOTY BOOTY 
ROCKIN' EVERYWHERE
