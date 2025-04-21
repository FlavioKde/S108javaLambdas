# 📂 JAVA LAMBDAS & STREAMS - EXERCISES PROJECT

## 📄 PROJECT DESCRIPTION

This project is centered around **functional programming in Java**, with a strong focus on **Lambdas, Streams, and Functional Interfaces** introduced in Java 8.  
Across three progressive levels, you'll implement powerful functional features to solve common programming problems in a modern and elegant way.

---

## 🔹 KEY FEATURES

- ✔ Use of Lambdas for clean inline function definitions  
- ✔ Mastering the Java Stream API for list processing  
- ✔ Creating and using Functional Interfaces  
- ✔ Sorting, filtering, and mapping data with Streams  
- ✔ Applying lambda expressions in real-world scenarios  

---

## 💻 TECHNOLOGIES USED

- ✔ Java 17+  
- ✔ Eclipse / IntelliJ IDEA  
- ✔ Git & GitHub for version control  
- ✔ Maven  

---

## 📋 REQUIREMENTS

- ✔ Use **Eclipse** or **IntelliJ IDEA**  
- ✔ Use **Java 8 or higher** for Lambdas & Streams support  
- ✔ Follow clean code practices and naming conventions  

---

## 🛠️ INSTALLATION & SETUP

1️⃣ Clone the repository:

```bash
git clone https://github.com/FlavioKde/S108javaLambdas.git
2️⃣ Navigate to the project directory:

bash
Copiar
Editar
cd Java-Lambdas-Streams
3️⃣ Open the project in Eclipse or IntelliJ
4️⃣ Compile and run the desired class from the src folder

▶️ EXECUTION INSTRUCTIONS
🔸 LEVEL 1: BASIC LAMBDAS & STREAMS
✔ Exercise 1: Filter Strings with 'o'
From a list of strings, return all items that contain the letter 'o'. Print the resulting list using Streams.

✔ Exercise 2: Filter with Length Constraint
Return all strings that:

Contain the letter 'o'

Have more than 5 characters

✔ Exercise 3: Print All Months
Create a list of all months of the year. Print each item using a lambda expression.

✔ Exercise 4: Method Reference
Print the list from Exercise 3 again, but this time using a method reference.

✔ Exercise 5: Pi Functional Interface
Create a FunctionalInterface with a method getPiValue() that returns a double.
Instantiate it via a lambda with the value 3.1415. Print the result.

✔ Exercise 6: Sort Mixed List (Ascending)
Create a list of numbers and strings. Sort strings from shortest to longest.

✔ Exercise 7: Sort Mixed List (Descending)
Sort the same list from longest to shortest.

✔ Exercise 8: Reverse String with Lambda
Create a FunctionalInterface with reverse(String) -> String.
Inject a lambda that reverses any input string. Call it and print the result.

🔸 LEVEL 2: INTERMEDIATE STREAM OPERATIONS
✔ Exercise 1: Filter Names Starting with 'A'
From a list of names, return those that:

Start with the letter 'A'

Are exactly 3 letters long

✔ Exercise 2: Format Integers as String
Given a list of Integers, format them as:

"e" prefix for even numbers

"o" prefix for odd numbers

Example: [3, 55, 44] ➝ o3, o55, e44

✔ Exercise 3: Lambda Math Operations
Create a FunctionalInterface with operacio() → float
Implement via lambdas:

Addition

Subtraction

Multiplication

Division

✔ Exercise 4: List Transformation Challenges
Sort a list of strings/numbers by:

First character alphabetically (charAt(0))

Strings that contain 'e' come first

Replace all 'a' characters with '4'

Print only numeric strings

🔸 LEVEL 3: OBJECT FILTERING & LAMBDAS
✔ Exercise 1: Student Management with Lambdas
Create a class Alumne with:

name, age, course, grade

Populate a list with 10 students. Using lambdas:

Print name and age of each student

Filter names starting with 'a' into a new list and print it

Filter and print students with grade ≥ 5

Filter and print students with grade ≥ 5 and not studying PHP

Show students who study JAVA and are adults

🌐 DEPLOYMENT
✔ Ensure all packages and directories are properly structured

✔ Use clean naming and avoid hardcoded values

✔ Use @FunctionalInterface where appropriate

✔ Test every functional component individually

✔ Push changes to GitHub following best practices

🤝 CONTRIBUTIONS
Contributions are welcome! Follow these steps:

1️⃣ Fork the repository
2️⃣ Create a new branch:

bash
Copiar
Editar
git checkout -b feature/YourFeature
3️⃣ Commit your changes:

bash
Copiar
Editar
git commit -m "Add feature: Lambda-based filtering"
4️⃣ Push your branch:

bash
Copiar
Editar
git push origin feature/YourFeature
5️⃣ Open a Pull Request 🎉

📌 NOTES
✔ Explore the flexibility of functional programming in Java

✔ Aim to improve performance with efficient Stream operations

✔ Keep lambdas readable and avoid over-nesting

✔ Always test your filters and transformations thoroughly

🚀 HAPPY CODING & GOOD LUCK ON YOUR FUNCTIONAL JOURNEY! ✨

