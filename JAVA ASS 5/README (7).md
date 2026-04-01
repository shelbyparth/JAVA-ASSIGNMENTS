# PRACTICAL NO.05

## **STATIC, FINAL, SUPER and THIS Keyword in Java**


# 📘 Notes

## 1️⃣ `static` Keyword in Java

The `static` keyword is used for **memory management**. It belongs to the **class**, not to objects.

### 🔹 Where can `static` be used?

* Static variable
* Static method
* Static block
* Static nested class

### 🔹 Static Variable

* Shared among all objects.
* Only one copy exists in memory.
* Accessed using the class name.

```java
class Example {
    static int count = 0;
}
```

### 🔹 Static Method

* Can access only static members.
* Cannot use `this` or `super`.

```java
static void display() {
    System.out.println("Static method called");
}
```

### 🔹 Key Points

* Loaded when class is loaded.
* Saves memory.
* Commonly used for constants and utility methods.

---

## 2️⃣ `final` Keyword in Java

The `final` keyword is used to **restrict modification**.

### 🔹 Final Variable

* Value cannot be changed once assigned.
* Acts as constant.

```java
final int MAX = 100;
```

### 🔹 Final Method

* Cannot be overridden.

```java
final void show() {
    System.out.println("Final method");
}
```

### 🔹 Final Class

* Cannot be inherited.

```java
final class Test {
}
```

### 🔹 Key Points

* Prevents modification.
* Improves security.
* Used to create constants.

---

## 3️⃣ `this` Keyword in Java

The `this` keyword refers to the **current object**.

### 🔹 Uses of `this`

1. Refer current class instance variable.
2. Call current class method.
3. Call current class constructor.
4. Pass current object as parameter.

### 🔹 Example

```java
this.name = name;  // refers to instance variable
```

### 🔹 Key Points

* Eliminates confusion between instance and local variables.
* Can be used inside constructors and methods.

---

## 4️⃣ `super` Keyword in Java

The `super` keyword refers to the **parent class object**.

### 🔹 Uses of `super`

1. Access parent class variable.
2. Call parent class method.
3. Call parent class constructor.

### 🔹 Example

```java
super.display();   // calls parent class method
```

### 🔹 Key Points

* Used in inheritance.
* Helps avoid ambiguity between parent and child class members.

---

# 💻 Sample Java Program

### Program to Implement `static`, `final`, `this`, and `super`

```java
// Parent Class
class Person {

    // static variable (shared among all objects)
    static String country = "India";

    // final variable (constant)
    final String organization = "ABC Company";

    String name;
    int age;

    // Parent class constructor
    Person(String name, int age) {
        this.name = name;   // 'this' refers to current class variable
        this.age = age;
    }

    // Parent class method
    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Country: " + country);
        System.out.println("Organization: " + organization);
    }
}

// Child Class
class Employee extends Person {

    int empId;

    // Constructor using super keyword
    Employee(String name, int age, int empId) {
        super(name, age);  // Calls parent class constructor
        this.empId = empId;  // Refers to current class variable
    }

    // Overriding method
    void display() {
        super.display();  // Calls parent class method
        System.out.println("Employee ID: " + empId);
    }

    // Static method
    static void changeCountry(String newCountry) {
        country = newCountry; // Accessing static variable
    }
}

// Main Class
public class Practical05 {

    public static void main(String[] args) {

        // Calling static method
        Employee.changeCountry("USA");

        // Creating object
        Employee emp1 = new Employee("Rahul", 25, 101);

        // Display details
        emp1.display();

        /*
         OUTPUT:
         Name: Rahul
         Age: 25
         Country: USA
         Organization: ABC Company
         Employee ID: 101
        */
    }
}
```

---

# ✅ Summary Table

| Keyword  | Purpose                  | Used For                               |
| -------- | ------------------------ | -------------------------------------- |
| `static` | Belongs to class         | Shared variables & methods             |
| `final`  | Restricts modification   | Constant variables, prevent overriding |
| `this`   | Refers to current object | Access instance variables              |
| `super`  | Refers to parent class   | Access parent constructor/method       |

---

# 🎯 Conclusion

In this practical:

* `static` was used for shared class variable and method.
* `final` was used to create a constant.
* `this` was used to refer to current object variables.
* `super` was used to access parent class constructor and method.

---
