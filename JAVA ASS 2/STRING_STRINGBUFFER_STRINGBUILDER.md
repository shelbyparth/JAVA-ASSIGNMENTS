# Tittle :- STRING, STRING BUFFER, STRING BUILDER:-

# String :-

## 🔹 What is String?

• String is a class in Java.\
• It is used to store sequence of characters.\
• Strings in Java are immutable (cannot be changed after creation).\
• Stored in String Constant Pool.\
• Strings are used for storing text.

A **String** variable contains a collection of characters surrounded by
double quotes ("").

Ex :-

``` java
String greeting = "Hello";
```


| Method        | Description                     |
|---------------|---------------------------------|
| length()      | Returns length                  |
| toUpperCase() | Converts to uppercase           |
| toLowerCase() | Converts to lowercase           |
| charAt()      | Returns character at index      |
| equals()      | Compares strings                |
| substring()   | Extracts part of string         |
| replace()     | Replaces characters             |


##
🔹 Small Syntax:-

``` java
String str = "Hello";

System.out.println(str.length());
System.out.println(str.toUpperCase());
System.out.println(str.charAt(1));
```

------------------------------------------------------------------------

# Using Library Methods

``` java
public class StringWithLibrary {

    public static void main(String[] args) {

        String str = "madam";

        System.out.println("Length: " + str.length());
        System.out.println("Uppercase: " + str.toUpperCase());

        String rev = new StringBuilder(str).reverse().toString();
        System.out.println("Reverse: " + rev);

        if(str.equals(rev)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
    }
}
/*
================OUTPUT==================

Microsoft Windows [Version 10.0.26200.7840]
(c) Microsoft Corporation. All rights reserved.

C:\Users\Study\SY SEM 4\Code>cd "c:\Users\Study\SY SEM 4\Code\Java\" && javac StringWithLibrary.java && java StringWithLibrary
Length: 5
Uppercase: MADAM
Reverse: madam
Palindrome

c:\Users\Study\SY SEM 4\Code\Java>


*/
```

------------------------------------------------------------------------

# Without Using Library Methods

``` java
public class StringWithoutLibrary {

    public static void main(String[] args) {

        String str = "madam";

        int length = 0;
        for(char _ : str.toCharArray()) {
            length++;
        }
        System.out.println("Length: " + length);

        char[] arr = str.toCharArray();
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] >= 'a' && arr[i] <= 'z') {
                arr[i] = (char)(arr[i] - 32);
            }
        }
        System.out.println("Uppercase: " + new String(arr));

        String rev = "";
        for(int i = str.length()-1; i >= 0; i--) {
            rev += str.charAt(i);
        }
        System.out.println("Reverse: " + rev);

        boolean flag = true;
        for(int i = 0; i < str.length()/2; i++) {
            if(str.charAt(i) != str.charAt(str.length()-1-i)) {
                flag = false;
                break;
            }
        }

        if(flag) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
    }
}

/*
========================OUTPUT:-======================

c:\Users\Study\SY SEM 4\Code\Java>cd "c:\Users\Study\SY SEM 4\Code\Java\" && javac StringWithoutLibrary.java && java StringWithoutLibrary
Length: 5
Uppercase: MADAM
Reverse: madam
Palindrome


*/
```





------------------------------------------------------------------------

# Java Threads, Threading, and Multithreading

## 1. What is a Thread?
A **thread** is the smallest unit of execution in a program.  
It represents a single flow of control inside a process.

In Java, threads allow a program to perform **multiple tasks at the same time**.

### Example
- Playing music while downloading a file
- Typing while auto-save runs in the background


## 2. What is Threading?

**Threading** is the process of creating and managing threads in a program.

It allows a program to execute multiple parts of code **independently**.

### Benefits
- Efficient CPU usage
- Faster program execution
- Better performance



## 3. What is Multithreading?

**Multithreading** is the ability of a program to run **multiple threads simultaneously**.

### Example
A web server handling multiple users at the same time.

------------------------------------------------------------------------
# STRING BUFFER

## 🔹What is StringBuffer?

• Used to create mutable strings\
• Can modify without creating new object\
• Thread-safe -> (Synchronous)\
• Slower than StringBuilder

Ex :-

``` java
StringBuffer sb = new StringBuffer("Hello");
```
| Method     | Description        |
|------------|--------------------|
| append()   | Adds text          |
| insert()   | Inserts text       |
| delete()   | Deletes text       |
| reverse()  | Reverses string    |
| capacity() | Returns capacity   |

##
🔹 Small Syntax:-
```java
StringBuffer sb = new StringBuffer("Hello");
sb.append(" World");
System.out.println(sb);


```







------------------------------------------------------------------------

# STRING BUILDER

## 🔹What is StringBuilder?

• Also mutable\
• Not thread-safe -> (Asynchronous / Non-synchronized) \
• Faster than StringBuffer

Ex :-

``` java
StringBuilder sb = new StringBuilder("Hello");

```

| Method     | Description       |
|------------|-------------------|
| append()   | Adds text         |
| insert()   | Inserts text      |
| delete()   | Deletes text      |
| reverse()  | Reverses string   |
| capacity() | Returns capacity  |


##
🔹 Small Syntax:-
```java
StringBuilder sb = new StringBuilder("Hello");
sb.append(" World");
System.out.println(sb);


```
``` java
public class String_Builder_Buffer {

    // String Operations
    static void stringOperations() {
        String str = "Java Programming";

        System.out.println("Length: " + str.length());
        System.out.println("Uppercase: " + str.toUpperCase());
        System.out.println("Lowercase: " + str.toLowerCase());
        System.out.println("Character at 2: " + str.charAt(2));
        System.out.println("Substring (0-4): " + str.substring(0, 4));
        System.out.println("Replace: " + str.replace("Java", "Core Java"));
    }

    // StringBuffer Operations
    static void stringBufferOperations() {
        StringBuffer sb = new StringBuffer("Hello");

        sb.append(" World");
        sb.insert(5, " Java");
        sb.delete(5, 10);
        sb.reverse();

        System.out.println("StringBuffer Result: " + sb);
    }

    // StringBuilder Operations
    static void stringBuilderOperations() {
        StringBuilder sb = new StringBuilder("Welcome");

        sb.append(" to Java");
        sb.insert(7, " Core");
        sb.delete(7, 12);
        sb.reverse();

        System.out.println("StringBuilder Result: " + sb);
    }

    public static void main(String[] args) {

        System.out.println("----- STRING OPERATIONS -----");
        stringOperations();

        System.out.println("\n----- STRINGBUFFER OPERATIONS -----");
        stringBufferOperations();

        System.out.println("\n----- STRINGBUILDER OPERATIONS -----");
        stringBuilderOperations();
    }
}


/*

==========================   OUTPUT :-  =====================

c:\Users\Study\SY SEM 4\Code\Java>cd "c:\Users\Study\SY SEM 4\Code\Java\" && javac String_Builder_Buffer.java && java String_Builder_Buffer
----- STRING OPERATIONS -----
Length: 16
Uppercase: JAVA PROGRAMMING
Lowercase: java programming
Character at 2: v
Substring (0-4): Java
Replace: Core Java Programming

----- STRINGBUFFER OPERATIONS -----
StringBuffer Result: dlroW olleH

----- STRINGBUILDER OPERATIONS -----
StringBuilder Result: avaJ ot emocleW

c:\Users\Study\SY SEM 4\Code\Java>

*/
```
------------------------------------------------------------------------

# Feature Comparison


| Feature      | String | StringBuffer | StringBuilder |
|--------------|--------|--------------|---------------|
| Mutable      | ❌ No  | ✅ Yes       | ✅ Yes        |
| Thread Safe  | ❌ No  | ✅ Yes       | ❌ No         |
| Speed        | Slow   | Medium       | Fast          |
| Memory       | More   | Less         | Less          |