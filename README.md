# 🚆 Train Consist Management App

A **console-based Java application** that simulates how a railway system manages a train’s consist (collection of bogies attached to an engine).

This project is built using **progressive Use Cases (UC1–UC20)** to demonstrate core concepts of **Java, OOP, algorithms, and exception handling**.

---

## 📌 Overview

The application models:

- 🚍 Passenger bogies with seating capacity  
- 📦 Goods bogies with cargo types and safety rules  
- 🔍 Searching and sorting of bogies  
- ⚠️ Exception handling for safe operations  

Each use case builds on the previous one, evolving the system from **basic design → advanced, real-world behavior**.

---

## 🎯 Objectives

- Simulate real-world railway operations  
- Apply Object-Oriented Programming principles  
- Implement sorting and searching algorithms  
- Enforce safety and validation rules  
- Practice defensive programming  

---

## 🧩 Use Cases Breakdown

### 🔹 UC1 – Basic Class Design
- Define core classes for bogies and train structure  

### 🔹 UC2 – Object Creation
- Instantiate objects and initialize basic data  

### 🔹 UC3 – Constructor Usage
- Use constructors for setting initial values  

### 🔹 UC4 – Encapsulation
- Apply getters/setters for data protection  

---

### 🔹 UC5 – Inheritance
- Create hierarchy between general and specific bogies  

### 🔹 UC6 – Polymorphism
- Implement method overriding for dynamic behavior  

---

### 🔹 UC7 – Passenger Bogie Types
- Sleeper  
- AC Chair  
- First Class  

### 🔹 UC8 – Goods Bogie Types
- Rectangular  
- Cylindrical  

---

### 🔹 UC9 – Capacity Tracking
- Manage seating and cargo capacity  

### 🔹 UC10 – Cargo Assignment
- Assign cargo types to goods bogies  

### 🔹 UC11 – Safety Constraints
- Enforce safe cargo rules  

---

### 🔹 UC12 – Checked Exception Handling
- Validate inputs during object creation  

### 🔹 UC13 – Validation Logic
- Strengthen rules for capacity and cargo  

### 🔹 UC14 – Strict Object Validation
- Prevent invalid object creation using exceptions  

---

### 🔹 UC15 – Runtime Safety (try-catch-finally)
- Custom Runtime Exception (`CargoSafetyException`)  
- Graceful handling of unsafe cargo assignment  

---

### 🔹 UC16 – Bubble Sort (Manual Sorting)
- Sort passenger capacities using nested loops  
- Demonstrates O(n²) complexity  

### 🔹 UC17 – Arrays.sort() (Optimized Sorting)
- Sort bogie names using built-in method  
- Demonstrates O(n log n) performance  

---

### 🔹 UC18 – Linear Search
- Search bogie ID in unsorted array  
- Sequential traversal (O(n))  

### 🔹 UC19 – Binary Search
- Efficient search on sorted data  
- Divide-and-conquer approach (O(log n))  

---

### 🔹 UC20 – Fail-Fast Exception Handling
- Prevent search on empty data  
- Uses `IllegalStateException`  
- Implements defensive programming  

---

## ⚙️ Features

- ✅ Passenger and goods bogie modeling  
- ✅ Cargo assignment with safety validation  
- ✅ Sorting (manual + optimized)  
- ✅ Searching (linear + binary)  
- ✅ Exception handling (checked & runtime)  
- ✅ Fail-fast validation  
- ✅ Clean and modular design  

---

## 🧠 Concepts Covered

- Object-Oriented Programming (OOP)  
- Encapsulation, Inheritance, Polymorphism  
- Exception Handling (Checked & Runtime)  
- Custom Exceptions  
- Sorting Algorithms (Bubble Sort, Arrays.sort)  
- Searching Algorithms (Linear, Binary)  
- Defensive Programming  
- Time Complexity Analysis  

---

## 📈 Learning Outcomes

- Understand real-world system constraints
- Learn step-by-step system evolution
- Gain strong OOP fundamentals
- Master exception handling strategies
- Understand algorithm efficiency
