# 🎵 Audio Player (Java)

## 📌 Overview
This project is a **console-based audio player** built in Java that can play, stop, reset, and quit audio playback.  
It uses the `javax.sound.sampled` package to handle **.wav**, **.aiff**, and **.au** formats.

---

## 🧩 Features
- ▶️ **Play** audio  
- ⏹ **Stop** audio  
- 🔁 **Reset** audio to the beginning  
- ❌ **Quit** the program  
- ⚠️ Proper exception handling for invalid paths, unsupported formats, and unavailable audio lines  
- 🔒 Uses **try-with-resources** to automatically close `Scanner` and `AudioInputStream`

---

## 🛠️ Concepts Used
- **File handling** (`File`, file paths)  
- **AudioInputStream**, **Clip**, and **AudioSystem**  
- **Exception handling**  
  - `UnsupportedAudioFileException`  
  - `FileNotFoundException`  
  - `LineUnavailableException`  
  - `IOException`  
- **try-with-resources** for automatic resource cleanup  
- **Enhanced switch expressions**  
- **Loops & user input handling**

---

## ▶️ How to Use
1. Place a `.wav` audio file in your project directory.  
2. Update the `filePath` variable with the correct path.  
3. Run the program.  
4. Choose an option:  
   - `P` → Play  
   - `S` → Stop  
   - `R` → Reset  
   - `Q` → Quit  

### Example interaction:
P=Play
S=Stop
R=Reset
Q=Quit
Enter your choice: P

---

## 📂 File Format Support
✔ `.wav`  
✔ `.aiff`  
✔ `.au`  
✖ `.mp3` *(Not supported by Java's basic audio system)*

---

## 📝 Notes
- `Clip` does **not** implement `AutoCloseable`, so it cannot be placed inside the try-with-resources block.  
- The `finally` block always executes and prints `"Bye!"`.

---

## 🚀 Future Improvements
- Add pause/resume functionality  
- Build a GUI using JavaFX or Swing  
- Add playlist support  

---
