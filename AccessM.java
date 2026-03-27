// Demonstration of Java Basics + Access Modifiers

class Student {

    // Private variable (Encapsulation)
    private String name;

    // Default variable
    int rollNo;

    // Constructor
    Student(String name, int rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }

    // Public method
    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + rollNo);
    }

    // Protected method
    protected void checkResult(int marks) {
        if (marks >= 40) {
            System.out.println("Result: Pass");
        } else {
            System.out.println("Result: Fail");
        }
    }

    // Default method
    void showMessage() {
        System.out.println("Welcome to Java Programming");
    }
}

public class AccessM {
    public static void main(String[] args) {

        // Creating object
        Student s1 = new Student("Nilesh", 101);

        // Calling public method
        s1.displayDetails();

        // Calling protected method
        s1.checkResult(75);

        // Calling default method
        s1.showMessage();

        // Loop Example
        System.out.println("Numbers from 1 to 5:");
        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
        }
    }
}