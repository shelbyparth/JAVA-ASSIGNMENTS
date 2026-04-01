# Java Practical: Classes, Objects, Methods, Constructors, and Lambda Expressions

## Overview
This repository focuses on the core pillars of Object-Oriented Programming (OOP) in Java, along with modern functional programming features introduced in Java 8. It provides a foundational understanding of how to structure Java applications using blueprints (classes) and their instances (objects), alongside concise functional implementations using Lambda expressions.

---

## Core Topics Covered

### 1. Class
A class is a blueprint or template used for creating objects. It encapsulates data members (fields/variables) and member functions (methods) that operate on that data.
* **Components of a Class:** Fields, Methods, Constructors, Initialization blocks, and Nested classes.
* **Syntax:**
  ```java
  class ClassName {
      int data; // Field
      void methodName() { } // Method
  }
  ```

### 2. Object
An object is a specific instance of a class. 
* **Memory Allocation:** Objects are stored in heap memory, and memory is allocated when an object is created using the `new` keyword.
* **State:** Each object maintains its own independent copy of the class's instance variables.
* **Syntax:** `ClassName objectName = new ClassName();`

### 3. Methods
Methods define the behavior of objects. They can accept parameters, return values, and be overloaded (having the same name but different parameters).
* **Instance Methods:** Belong to a specific object.
* **Static Methods:** Belong to the class itself rather than any specific object.
* **Main Method:** The special `main` method serves as the entry point for a Java program execution.

### 4. Constructors
A constructor is a special method invoked automatically when an object is created. 
* **Characteristics:** It has the exact same name as the class and strictly has **no return type** (not even `void`).
* **Purpose:** Used to initialize the object's initial state or fields.
* **Types:**
  * **Default Constructor:** Takes no arguments. (If no constructor is defined, Java provides a default one automatically).
  * **Parameterized Constructor:** Accepts arguments to initialize the object with specific values.

### 5. Lambda Expressions
Introduced in Java 8, Lambda expressions provide a highly concise way to represent anonymous functions (functions without a formal name).
* **Usage:** Primarily used to implement **functional interfaces** (interfaces that contain exactly one abstract method, e.g., `Runnable`, `Comparator`).
* **Benefits:** Enables a functional programming style, making the code much more readable, expressive, and compact.
* **Syntax:** `(parameters) -> expression` or `(parameters) -> { statements; }`

---

## Included Code Example

### `Main.java`
This file serves as a practical demonstration of all the concepts mentioned above:
1. **Class & Object Creation:** Defines a `Student` class encapsulating `rollNo`, `name`, and `marks`. It demonstrates instantiating multiple `Student` objects.
2. **Constructors:** Utilizes both a default constructor (setting default values like `0` and `"Unknown"`) and a parameterized constructor to assign custom values upon creation.
3. **Methods:** Features instance methods like `display()` to print details and `updateMarks()` which takes parameters to alter the object's state.
4. **Lambda Expressions & Streams:** Showcases Java 8 capabilities by adding the objects to a `List` and using the Stream API alongside Lambda expressions (`student -> student.getMarks() > 80`) to filter and print students who scored above 80.
