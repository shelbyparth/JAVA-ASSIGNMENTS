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
public class ExampleCode {

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