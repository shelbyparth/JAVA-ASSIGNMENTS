import java.util.ArrayList;
import java.util.List;

// Class representing a Student
class Student {

    // Member variables (fields)
    private int rollNo;
    private String name;
    private double marks;

    // Default constructor
    public Student() {
        this.rollNo = 0;
        this.name = "Unknown";
        this.marks = 0.0;
        System.out.println("Default constructor called.");
    }

    // Parameterized constructor
    public Student(int rollNo, String name, double marks) {
        this.rollNo = rollNo;
        this.name = name;
        this.marks = marks;
        System.out.println("Parameterized constructor called for " + name);
    }

    // Method to display student details
    public void display() {
        System.out.println("Roll No: " + rollNo);
        System.out.println("Name: " + name);
        System.out.println("Marks: " + marks);
    }

    // Method to update marks
    public void updateMarks(double newMarks) {
        this.marks = newMarks;
        System.out.println("Marks updated for " + name);
    }

    // Getter for marks (used in lambda)
    public double getMarks() {
        return marks;
    }
}

// Main class to test the above
public class Main {
    public static void main(String[] args) {
        // a) Creating objects and using methods
        Student s1 = new Student(); // default constructor
        Student s2 = new Student(101, "Alice", 85.5); // parameterized constructor

        System.out.println("\n--- Student Details ---");
        s1.display();
        s2.display();

        // b) Passing information to a method
        s2.updateMarks(90.0);
        s2.display();

        // c) Lambda expression example
        List<Student> students = new ArrayList<>();
        students.add(s1);
        students.add(s2);
        students.add(new Student(102, "Bob", 76.0));
        students.add(new Student(103, "Charlie", 95.0));

        // Using lambda with Stream API to filter students with marks > 80
        System.out.println("\n--- Students with marks > 80 (Lambda) ---");
        students.stream()
                .filter(student -> student.getMarks() > 80)
                .forEach(student -> System.out.println(student.getMarks()));
    }
}