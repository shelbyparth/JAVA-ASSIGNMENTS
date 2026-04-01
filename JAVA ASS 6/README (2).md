# 📘 POLYMORPHISM IN JAVA

---

## 🔷 1. What is Polymorphism?

* **Poly = Many**, **Morph = Forms**
* One method/object behaves differently in different situations
* Core OOP concept → improves flexibility & reusability 

---

## 🔷 2. Types of Polymorphism

### 1. Compile-Time Polymorphism (Static Binding)

* Achieved using **Method Overloading**
* Decision made at **compile time**

### 2. Runtime Polymorphism (Dynamic Binding)

* Achieved using **Method Overriding**
* Decision made at **runtime**

👉 Diagram on **Page 2** clearly shows:

* Overloading → Compile-time
* Overriding → Runtime 

---

# 🔷 3. Compile-Time Polymorphism (Method Overloading)

### ✔ Definition

Same method name, different parameters

### ✔ Rules

* Method name must be same
* Parameters must differ (number/type)
* Return type alone is NOT enough

### ✔ Example (from your code)

```java
// Practical06.java
int add(int a, int b)
int add(int a, int b, int c)
double add(double a, double b)
```

➡ Output changes based on arguments 

---

# 🔷 4. Runtime Polymorphism (Method Overriding)

### ✔ Definition

Child class provides its own implementation of parent method

### ✔ Rules

* Same method name
* Same parameters
* Requires inheritance
* Cannot override static/final methods 

---

## ✔ Example 1 (Dog)

```java
Animal obj = new Dog();
obj.sound();
```

* Parent reference → Child object
* Calls **Dog’s method at runtime** 

---

## ✔ Example 2 (Cat)

```java
Animal a = new Cat();
a.sound();
```

* Runtime decides method → Cat executes 

---

# 🔷 5. Dynamic Method Dispatch

### ✔ Core Idea

* Method call resolved **at runtime**
* Based on **object type**, not reference

👉 Example:

```java
Animal obj = new Dog();
obj.sound();
```

➡ Even though reference = Animal, execution = Dog 

---

# 🔷 6. Upcasting & Downcasting

## ✅ Upcasting

* Child → Parent reference
* Automatic & safe

```java
MyAnimal a = new MyDog();
```

## ❌ Downcasting

* Parent → Child reference
* Explicit & risky

```java
MyDog d = (MyDog) a;
```

### ✔ Use Case

Access child-specific methods

➡ Example:

* `a.eat()` → Parent method
* `d.bark()` → Child method 

---

## ⚠️ Safety: `instanceof`

* Prevents **ClassCastException**
* Check before downcasting 

---

# 🔷 7. Upcasting in Overriding

```java
Person p = new Student();
p.show();
```

➡ Calls Student method (runtime polymorphism) 

---

# 🔷 8. Polymorphism using Interfaces

### ✔ Concept

Interface reference → different implementations

```java
Shape s;

s = new Circle();
s.draw();

s = new Rectangle();
s.draw();
```

➡ Same method → different behavior 

---

# 🔷 9. Polymorphism with Abstract Classes

* Abstract method → implemented in child class
* Supports runtime polymorphism

👉 Syntax shown on **Page 8 diagram** 

---

# 🔷 10. Overloading vs Overriding

| Feature     | Overloading  | Overriding     |
| ----------- | ------------ | -------------- |
| Class       | Same class   | Parent + Child |
| Parameters  | Different    | Same           |
| Binding     | Compile time | Runtime        |
| Inheritance | Not required | Required       |

---

# 🔷 11. Static vs Dynamic Binding

| Feature | Static       | Dynamic         |
| ------- | ------------ | --------------- |
| Time    | Compile time | Runtime         |
| Type    | Overloading  | Overriding      |
| Speed   | Faster       | Slightly slower |

---

# 🔷 12. Advantages

* Code reuse
* Flexibility
* Extensibility
* Better readability
* Dynamic behavior 

---

# 🔷 13. Disadvantages

* Slight performance overhead
* Harder debugging
* Can increase complexity

---

# 🔷 14. Real-Life Analogy

Remote control:

* Same button → Different device behavior
  ➡ Same method → Different implementation

---

# 🔷 15. Key Insight (Important for Exams)

* Overloading = **compile-time decision**
* Overriding = **runtime decision**
* Runtime polymorphism = **dynamic method dispatch**
* Upcasting enables polymorphism
