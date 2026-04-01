import java.io.*;

// ================================
// 1️⃣ Single Catch Example
// ================================
class SingleCatchExample {
    static void SingleCatch() {
        System.out.println("\n--- Single Catch Example ---");
        try {
            int a = 10;     
            int b = 0;
            int result = a / b;
            System.out.println("Result: " + result);
        } 
        catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero!");
        }
    }
}

// ================================
// 2️⃣ Multiple Catch Example
// ================================
class MultipleCatchExample {
    static void MultipleCatch() {
        System.out.println("\n--- Multiple Catch Example ---");
        try {
            int arr[] = {1, 2, 3};
            System.out.println(arr[5]);
        } 
        catch (ArithmeticException e) {
            System.out.println("Arithmetic Error occurred!");
        } 
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array Index Error occurred!");
        } 
        catch (Exception e) {
            System.out.println("Some other error occurred!");
        }
    }
}

// ================================
// 3️⃣ Finally Block Example
// ================================
class FinallyExample {
    static void FinallyEx() {
        System.out.println("\n--- Finally Block Example ---");
        try {
            int num = 10 / 0;
        } 
        catch (ArithmeticException e) {
            System.out.println("Exception caught!");
        } 
        finally {
            System.out.println("This will always execute.");
        }
    }
}

// ================================
// 4️⃣ Throw Example
// ================================
class ThrowExample {
    static void ThrowKey() {
        System.out.println("\n--- Throw Example ---");
        int age = 15;

        try {
            if (age < 18) {
                throw new IllegalArgumentException("Not eligible to vote!");
            }
            System.out.println("You can vote!");
        } 
        catch (ArithmeticException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}

// ================================
// 5️⃣ Throws Example
// ================================
class ThrowsExample {

    static void readFile() throws IOException {
        FileReader file = new FileReader("test.txt");
    }

    static void ThrowsKey() {
        System.out.println("\n--- Throws Example ---");
        try {
            readFile();
        } 
        catch (IOException e) {
            System.out.println("File not found!");
        }
    }
}

// ================================
// 6️⃣ Custom Exception
// ================================
class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}

class CustomExceptionExample {

    static void checkAge(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("Age must be 18 or above.");
        } else {
            System.out.println("Valid Age!");
        }
    }

    static void run() {
        System.out.println("\n--- Custom Exception Example ---");
        try {
            checkAge(16);
        } 
        catch (InvalidAgeException e) {
            System.out.println("Custom Exception: " + e.getMessage());
        }
    }
}

// ================================
// Main Class (Driver Class)
// ================================
public class AllExceptionPrograms {
    public static void main(String[] args) {

        SingleCatchExample.SingleCatch();
        MultipleCatchExample.MultipleCatch();
        FinallyExample.FinallyEx();
        ThrowExample.ThrowKey();
        ThrowsExample.ThrowsKey();
        CustomExceptionExample.run();
    }
}