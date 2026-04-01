# 📘 Interface & Abstract Class (Java)

---

# 🔷 1. Interface in Java

## 📌 Definition

An **interface** is a blueprint of a class that contains only abstract methods and constants.
It is used to achieve **100% abstraction** and supports **multiple inheritance**. 

---

## ⚙️ Key Features

* Declared using `interface` keyword
* Methods are **public and abstract by default**
* Variables are **public, static, final**
* **No constructors allowed**
* A class uses `implements` keyword
* Supports **multiple inheritance** 

---

## 🧠 Example (SmartDevice)

### 🔹 Interface

```java
interface SmartDevice {
    void turnOn();
    void turnOff();
}
```

### 🔹 Implementation Classes

```java
class Fan implements SmartDevice {
    public void turnOn() { System.out.println("Fan is ON"); }
    public void turnOff() { System.out.println("Fan is OFF"); }
}

class Light implements SmartDevice {
    public void turnOn() { System.out.println("Light is ON"); }
    public void turnOff() { System.out.println("Light is OFF"); }
}
```

### 🔹 Main Class

```java
public class sd {
    public static void main(String[] args) {
        Fan f = new Fan();
        Light l = new Light();

        f.turnOn();
        l.turnOn();
        f.turnOff();
        l.turnOff();
    }
}
```

### 📤 Output

```
Fan is ON
Light is ON
Fan is OFF
Light is OFF
```



---

## ✅ Advantages of Interface

* Achieves **full abstraction**
* Supports **multiple inheritance**
* Promotes **loose coupling**
* Improves **flexibility and scalability** 

---

# 🔶 2. Abstract Class in Java

## 📌 Definition

An **abstract class** is a class that cannot be instantiated.
It can contain both **abstract methods** and **normal methods**, providing **partial abstraction**. 

---

## ⚙️ Key Features

* Declared using `abstract` keyword
* Can have **constructors**
* Can have **instance variables**
* Can include:

  * Abstract methods (no body)
  * Normal methods (with body)
* Uses `extends` for inheritance 

---

## 🧠 Example (BankAccount)

### 🔹 Abstract Class

```java
abstract class BankAccount {
    double balance;

    BankAccount(double balance) {
        this.balance = balance;
    }

    abstract void calculateInterest();

    void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
    }
}
```

### 🔹 Subclass

```java
class SavingsAccount extends BankAccount {

    SavingsAccount(double balance) {
        super(balance);
    }

    void calculateInterest() {
        double interest = balance * 0.04;
        System.out.println("Savings Interest: " + interest);
    }
}
```

### 🔹 Main Class

```java
public class Abstract {
    public static void main(String[] args) {
        SavingsAccount acc = new SavingsAccount(1000);
        acc.deposit(500);
        acc.calculateInterest();
    }
}
```

### 📤 Output

```
Deposited: 500.0
Savings Interest: 60.0
```



---

## ✅ Advantages of Abstract Class

* Allows **partial abstraction**
* Enables **code reuse**
* Provides a **common base class**
* Can include **implemented logic** 

---

# ⚖️ 3. Interface vs Abstract Class

| Feature     | Interface           | Abstract Class             |
| ----------- | ------------------- | -------------------------- |
| Abstraction | 100%                | Partial                    |
| Methods     | Only abstract       | Abstract + Normal          |
| Variables   | Public static final | Instance variables allowed |
| Constructor | Not allowed         | Allowed                    |
| Inheritance | Multiple            | Single                     |
| Keyword     | implements          | extends                    |

---

# 🎯 4. Core Insight (Important for Viva)

Most students memorize this as a rule. That’s weak thinking.

### First-principles view:

* **Interface = behavior contract**
  → “What must be done”
* **Abstract class = shared structure + partial logic**
  → “What is common + what can vary”

---

# 🧾 5. Conclusion

* Interface is used when only **method declarations** are needed
* Abstract class is used when **common functionality** must be shared
* Both are essential for implementing **abstraction in Java**
