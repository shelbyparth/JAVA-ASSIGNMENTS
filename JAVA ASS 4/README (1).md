# 📘 Java Inheritance

---

# 1. What is Inheritance?

Inheritance is a core concept of OOP where:

> One class acquires properties and methods of another class 

---

# 2. Key Terminology

| Term         | Meaning               |
| ------------ | --------------------- |
| Parent Class | Class being inherited |
| Child Class  | Class that inherits   |
| Superclass   | Same as parent        |
| Subclass     | Same as child         |

👉 Represents **IS-A relationship**
Example:

```text
Dog IS-A Animal
```

---

# 3. Syntax of Inheritance

```java
class Parent {
    // properties
}

class Child extends Parent {
    // inherited + new features
}
```

---

# 4. Advantages of Inheritance

* Code reusability
* Reduces redundancy
* Improves maintainability
* Supports polymorphism
* Better program structure 

---

# 5. Types of Inheritance

Java supports 5 types:

---

## 🔹 1. Single Inheritance

👉 One parent → One child

### Example:

```java
class Animal {
    void eat() {
        System.out.println("Animal eats");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Dog barks");
    }
}
```

### ✔ Features:

* Simple structure
* Easy to implement
* Direct code reuse

---

## 🔹 2. Multilevel Inheritance

👉 Chain inheritance

```text
Grandparent → Parent → Child
```

### Example:

```java
class Animal {
    void eat() { }
}

class Dog extends Animal {
    void bark() { }
}

class Puppy extends Dog {
    void weep() { }
}
```

### ✔ Features:

* Multi-level reuse
* Extend functionality step-by-step

---

## 🔹 3. Hierarchical Inheritance

👉 One parent → Many children

### Example:

```java
class Animal {
    void eat() { }
}

class Dog extends Animal {
    void bark() { }
}

class Cat extends Animal {
    void meow() { }
}
```

### ✔ Features:

* Shared base class
* Different behaviors in child classes

---

## 🔹 4. Multiple Inheritance (Using Interface)

👉 One class → Multiple parents (via interfaces)

⚠️ Java does NOT support multiple inheritance with classes
(because of **ambiguity / diamond problem**)

### Example:

```java
interface Father {
    void showFather();
}

interface Mother {
    void showMother();
}

class Child implements Father, Mother {
    public void showFather() { }
    public void showMother() { }
}
```

### ✔ Features:

* Achieved via interfaces
* Avoids ambiguity

---

## 🔹 5. Hybrid Inheritance

👉 Combination of multiple types

### Example:

* Class + Interfaces together

```java
class Animal {
    void eat() { }
}

interface Pet {
    void play();
}

interface Wild {
    void hunt();
}

class Dog extends Animal implements Pet, Wild {
    public void play() { }
    public void hunt() { }
}
```

### ✔ Features:

* Flexible design
* Combines multiple inheritance styles

---

# 6. Real-Life Examples

| Concept      | Example                      |
| ------------ | ---------------------------- |
| Single       | Vehicle → Car                |
| Multilevel   | Animal → Dog → Puppy         |
| Hierarchical | Animal → Dog, Cat            |
| Multiple     | Student → Sports + Academics |
| Hybrid       | Animal + Interfaces          |

---

# 7. Key Concepts Behind Inheritance

---

## 🔸 Code Reusability

Reuse existing code instead of rewriting.

---

## 🔸 Method Inheritance

Child class can use parent methods directly.

---

## 🔸 Method Overriding (Implied)

Child can redefine parent method.

---

# 🧠 Critical Insight (Important)

Most students think:

> Inheritance = reuse code

That’s incomplete.

### Real Purpose:

Inheritance = **model relationships + abstraction**

Bad usage:

```text
Using inheritance just to reuse code
```

Better:

```text
Use inheritance only when IS-A relationship exists
```

---

# 🚀 Final Summary (Exam Ready)

* Inheritance → acquire properties from another class
* Uses `extends` keyword
* Represents IS-A relationship
* Types:

  * Single
  * Multilevel
  * Hierarchical
  * Multiple (via interfaces)
  * Hybrid
