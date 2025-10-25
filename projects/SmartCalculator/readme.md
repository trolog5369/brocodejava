# Smart Calculator 🧠

A simple **Java console application** that combines a basic calculator with a temperature converter into a single “Smart Calculator” tool.

---

## Features

- **Simple Calculator Mode**:  
  - Perform basic arithmetic operations: `+`, `-`, `*`, `/`, and `^` (power).  
  - Handles divide-by-zero errors gracefully.  

- **Temperature Conversion Mode**:  
  - Convert temperatures between Celsius and Fahrenheit.  
  - Uses **ternary operator** for conversion decision (`C` or `F`).  

- **Menu Selection**:  
  - Enhanced switch-style menu to pick between calculator and temperature converter.  
  - Option to quit the program.  

---

## How to Use

1. Run the program in a Java IDE or terminal.  
2. Choose an option from the menu:  
   - `1` → Temperature Converter  
   - `2` → Simple Calculator  
   - `3` → Quit  
3. Follow the prompts for numbers, operators, or temperature units.  
4. View the result in the console.  

---

## Sample Usage
Heyy!! welcome to the smart calculator:
Choose an option(1/2/3):
1 for temp, 2 for cal, 3 for quit: 1
Enter the temperature: 100
Convert to Celsius or Fahrenheit (C or F): C
Converted Temperature: 37.8°C

Choose an option(1/2/3): 2
Enter the first number: 5
Enter the operator(+,-,*,/,^): *
Enter the second number: 4
Result: 20.0


---

## Key Concepts Used

- **Enhanced switch** for cleaner branching logic  
- **Ternary operator** for conditional temperature conversion  
- Input validation for divide-by-zero and invalid menu/operator choices  

---

## Next Steps

- Add **looping menu** for repeated calculations without restarting.  
- Extend functionality with **scientific operations** (sin, cos, log, etc.)  
- Improve **user interface** for better readability in the console.


