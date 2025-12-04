# 🚀 Week 6 — Day 07 (Java Audio / Music Player)

## 🎯 Topics Covered
- Playing audio files in Java (`.wav`, `.au`, `.aiff`)
- `AudioSystem`, `Clip`, `AudioInputStream`
- Handling unsupported formats and resource exceptions
- Using `try-with-resources` for safe cleanup

---

## 🧠 Core Concepts

### ✔️ Playing Audio
- Supported formats: `.wav`, `.au`, `.aiff`  
- Unsupported formats (e.g., `.mp3`) will throw `UnsupportedAudioFileException`

### ✔️ Key Classes
- **File** → represents the audio file
- **AudioInputStream** → reads audio data from the file
- **Clip** → plays, stops, or resets audio

### ✔️ User Controls
- `P` → Play  
- `S` → Stop  
- `R` → Reset to start  
- `Q` → Quit

### ✔️ Exception Handling
- **FileNotFoundException** → if file path is wrong
- **UnsupportedAudioFileException** → if format is unsupported
- **LineUnavailableException** → if system cannot access audio resource
- **IOException** → general input/output errors
- **finally** → always prints "Bye!" and ensures cleanup

### ✔️ try-with-resources
- Automatically closes `Scanner` and `AudioInputStream`  
- Ensures safer, cleaner code without manually closing resources  
- Any object implementing `AutoCloseable` works with it

---

## 💡 Takeaways
- Java can handle audio playback with standard classes
- Exception handling is critical for unsupported files or unavailable resources
- try-with-resources simplifies resource management
- Interactive programs can use `Scanner` to read user input and control playback

---

