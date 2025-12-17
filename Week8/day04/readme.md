# Day 04 — Multithreading in Java

## 📌 Overview
Today’s focus was on understanding **multithreading in Java** and how multiple threads can run concurrently to perform tasks without blocking the main program flow.  
The session covered creating threads, running them in parallel, and coordinating their execution properly.

---

## 🧩 Concepts Covered

### Thread vs Multithreading
- **Thread**: A single flow of execution inside a program
- **Multithreading**: Running multiple threads concurrently to improve responsiveness and performance

### Creating Threads
Two approaches were explored:
1. **Extending the `Thread` class**
2. **Implementing the `Runnable` interface** *(preferred)*

Reasons for preferring `Runnable`:
- Avoids single inheritance limitation
- Better separation of task and thread
- More flexible and scalable

---

## ⚙️ Key Implementations

### Running Multiple Threads
- Created multiple `Thread` objects using the same `Runnable`
- Observed how threads execute independently and interleave unpredictably
- Used `Thread.currentThread().getName()` to identify thread execution

### Thread Coordination with `join()`
- Learned that the **main thread does not wait** for child threads by default
- Used `join()` to make the main thread wait until other threads finish execution

### Concurrent Task Example
- Simulated two parallel tasks (`PING` and `PONG`)
- Demonstrated how threads run concurrently while the main thread coordinates execution order

---

## 🧠 Key Takeaways

- Threads run independently and their execution order is **not guaranteed**
- `Runnable` is preferred over extending `Thread`
- `start()` creates a new thread, `run()` contains the task logic
- `join()` is essential when the main thread must wait for worker threads
- Multithreading improves responsiveness but must be managed carefully

---

## ✅ Day Summary

- Learned the fundamentals of multithreading
- Ran multiple threads concurrently using `Runnable`
- Understood thread naming and execution order
- Implemented thread coordination using `join()`
- Built a stronger mental model of how Java handles concurrent execution
