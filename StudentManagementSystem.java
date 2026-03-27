import java.util.Scanner;

public class StudentManagementSystem {
    public static void main(String[] args) {
        int[] marks = new int[5];  // Array to store marks of 5 students
        Scanner scanner = new Scanner(System.in); // Create Scanner object
        int total = 0;   // Variable to store total marks

        System.out.println("Student Marks Entry System");


        // Loop to take input for 5 students
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter marks for Student " + (i + 1) + " (0-100): ");
            marks[i] = scanner.nextInt();
        }

        System.out.println("\n Processing Results");

        int count = 1;  // Counter to display student number

        // Enhanced for loop to process each student's marks
        for (int mark : marks) {
            total += mark;

            String grade;   // Variable to store grade

            if (mark >= 90) {
                grade = "A+ (Excellent)";
            } else if (mark >= 75) {
                grade = "A (Very Good)";
            } else if (mark >= 50) {
                grade = "B (Pass)";
            } else {
                grade = "F (Fail)";
            }

            System.out.println("Student " + count + ": Mark = " + mark + " | Grade = " + grade);
            count++;
        }
             // Calculate average marks

        double average = (double) total / marks.length;
        System.out.println("---------------------------");
        System.out.println("Average Score: " + average);

        if (average >= 50) {
            System.out.println("Final Result: CLASS PROMOTED");
        } else {
            System.out.println("Final Result: CLASS REPEATED");
        }

        scanner.close();
    }
}

