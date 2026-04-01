# 📘 Java Exception Handling

---

# 1. What is Exception Handling?

Exception Handling is a mechanism to handle runtime errors so that:

* Program **does not crash**
* Normal execution flow is maintained 

### 🔴 Common Runtime Errors:

* Division by zero
* Array index out of bounds
* Invalid input
* Custom conditions (e.g., age < 18)

---

# 2. Types of Exceptions

| Type                | Meaning                 | Example             |
| ------------------- | ----------------------- | ------------------- |
| Checked Exception   | Checked at compile time | IOException         |
| Unchecked Exception | Occurs at runtime       | ArithmeticException |



---

# 3. try Block

### 📌 Purpose:

Contains code that may cause an exception.

```java
try {
    int result = a / b;
}
```

👉 If an error occurs → control moves to `catch`

---

# 4. catch Block

### 📌 Purpose:

Handles the exception and prevents crash.

```java
catch (ArithmeticException e) {
    System.out.println("Error: Cannot divide by zero!");
}
```

✔ Example from your files: 

---

# 5. Multiple catch Blocks

Used when multiple exceptions may occur.

```java
try {
    int arr[] = {1,2,3};
    System.out.println(arr[5]);
}
catch (ArithmeticException e) { }
catch (ArrayIndexOutOfBoundsException e) { }
catch (Exception e) { }
```

✔ Example:  and 

---

# 6. finally Block

### 📌 Purpose:

Always executes (exception occurs or not)

```java
finally {
    System.out.println("This will always execute.");
}
```

✔ Used for cleanup (closing files, DB connections) 

---

# 7️. throw Keyword

### 📌 Purpose:

Manually create an exception.

```java
if (age < 18) {
    throw new ArithmeticException("Not eligible to vote!");
}
```

✔ Example: 

👉 Key Insight:

* `throw` → used **inside method**
* Creates **actual exception**

---

# 8. throws Keyword

### 📌 Purpose:

Declares that a method may throw an exception.

```java
static void readFile() throws IOException {
    FileReader file = new FileReader("test.txt");
}
```

✔ Example: 

👉 Key Insight:

* `throws` → used in **method signature**
* Does NOT handle exception, only declares it

---

# 9. Custom (User-Defined) Exception

### 📌 Purpose:

Create your own exception class.

```java
class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}
```

✔ Example: 

### Usage:

```java
if (age < 18) {
    throw new InvalidAgeException("Age must be 18 or above.");
}
```

---

# 🔟 Types of Exception Handling Programs 

---

## ✅ 1. Single Catch

* Handles one exception

```java
int result = a / 0;
```

✔ Output: Cannot divide by zero

---

## ✅ 2. Multiple Catch

* Handles multiple exceptions separately

✔ Handles:

* ArithmeticException
* ArrayIndexOutOfBoundsException

---

## ✅ 3. Finally Example

* Executes regardless of exception

---

## ✅ 4. Throw Example

* Manually throws exception if condition fails

---

## ✅ 5. Throws Example

* Method declares exception
* Handled in calling function

---

## ✅ 6. Custom Exception Example

* User-defined exception for business logic

---

# ⚠️ Important Differences (Exam-Focused)

| Feature  | throw                 | throws                    |
| -------- | --------------------- | ------------------------- |
| Purpose  | Create exception      | Declare exception         |
| Usage    | Inside method         | Method signature          |
| Handles? | No                    | No                        |
| Example  | throw new Exception() | method() throws Exception |

---

# 🧠 Key Insights (Critical Understanding)

* Exception handling is **control flow management**, not just error fixing
* Overusing `try-catch` blindly → **bad design**
* Better approach:

  * Validate inputs early
  * Use exceptions only for **unexpected conditions**

---

# 🚀 Final Summary (Ultra-Compact)

* `try` → risky code
* `catch` → handles error
* `finally` → always runs
* `throw` → manually create exception
* `throws` → declare exception
* Custom Exception → define your own logic
