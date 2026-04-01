package com.studyopedia;
class Person {
    void show() {
        System.out.println("Person method");
    }
}

class Student extends Person {
    void show() {
        System.out.println("Student method");
    }
}

public class Up {
    public static void main(String[] args) {

        Person p = new Student();   // Upcasting
        p.show();
    }
}