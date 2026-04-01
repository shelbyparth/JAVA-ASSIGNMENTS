# 📘 Java File Handling

---

# 1. What is File Handling?

File Handling in Java allows you to:

* Store data permanently
* Read/write external files
* Manage logs, configs, reports

👉 Uses classes from:

* `java.io`
* `java.nio.file` 

---

# 2. Core File Operations

| Operation | Purpose         |
| --------- | --------------- |
| Create    | Create new file |
| Write     | Store data      |
| Read      | Fetch data      |
| Delete    | Remove file     |

---

# 3. Important Classes

| Class          | Purpose           |
| -------------- | ----------------- |
| File           | Represents file   |
| FileWriter     | Write to file     |
| FileReader     | Read file         |
| BufferedReader | Efficient reading |
| BufferedWriter | Efficient writing |
| Scanner        | Simple reading    |



---

# 4. Creating a File

```java
import java.io.File;
import java.io.IOException;

public class CreateFile {
    public static void main(String[] args) {
        try {
            File myFile = new File("example.txt");

            if (myFile.createNewFile()) {
                System.out.println("File created: " + myFile.getName());
            } else {
                System.out.println("File already exists.");
            }

        } catch (IOException e) {
            System.out.println("Error occurred.");
        }
    }
}
```

### 🔍 Key Points:

* `createNewFile()` → returns true if created
* Must use `try-catch` (checked exception)

---

# 5. Writing to a File

```java
import java.io.FileWriter;
import java.io.IOException;

public class WriteToFile {
    public static void main(String[] args) {
        try {
            FileWriter writer = new FileWriter("example.txt");

            writer.write("Hello, this is a sample file.\nWelcome to Java!");
            writer.close();

            System.out.println("Successfully wrote to the file.");

        } catch (IOException e) {
            System.out.println("Error while writing.");
        }
    }
}
```

### 🔍 Key Points:

* `FileWriter` writes text
* Always call `close()`
* Overwrites file by default

---

# 6. Reading from a File

```java
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFile {
    public static void main(String[] args) {
        try {
            File file = new File("example.txt");
            Scanner reader = new Scanner(file);

            while (reader.hasNextLine()) {
                System.out.println(reader.nextLine());
            }

            reader.close();

        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
        }
    }
}
```

### 🔍 Key Points:

* `hasNextLine()` → checks next line
* `nextLine()` → reads line
* Uses Scanner for simplicity

---

# 7. Deleting a File

```java
import java.io.File;

public class DeleteFile {
    public static void main(String[] args) {
        File file = new File("example.txt");

        if (file.delete()) {
            System.out.println("Deleted: " + file.getName());
        } else {
            System.out.println("Failed to delete.");
        }
    }
}
```

### 🔍 Key Points:

* `delete()` returns boolean

---

# 8. Exception Handling in File Handling

| Exception             | Cause              |
| --------------------- | ------------------ |
| IOException           | General I/O error  |
| FileNotFoundException | File doesn't exist |
| SecurityException     | No permission      |



---

# 9. Best Practices (Important for Viva)

* Always close file resources
* Use `try-catch` for safety
* Check file existence:

  ```java
  file.exists()
  ```
* Use `BufferedReader` for large files
* Avoid hardcoding file paths

---

# 🔟 Advanced Insight (Critical Thinking)

Most students treat file handling as:

> “just read/write files”

That’s shallow.

### Real Engineering View:

* File handling = **I/O bottleneck**
* Disk operations are **slow compared to RAM**
* Poor file handling → performance issues

### Better Approach:

* Buffering (`BufferedReader`)
* Streaming large data
* Async I/O (advanced systems)

---

# ⚠️ Common Mistakes (From Beginner Code)

* Forgetting `close()` → memory leak
* Not handling exceptions properly
* Overwriting files unintentionally
* Using Scanner for large files (slow)

---

# 🚀 Final Summary (Exam Ready)

* File handling = persistent data storage
* `File` → represents file
* `FileWriter` → write
* `Scanner/FileReader` → read
* `delete()` → remove file
* Always use **try-catch + close()**
