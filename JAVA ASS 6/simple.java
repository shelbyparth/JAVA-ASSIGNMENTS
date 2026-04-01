package com.studyopedia;

// Parent Class
class MyAnimal {

    void eat() {
        System.out.println("Animal eats");
    }
}

// Child Class
class MyDog extends MyAnimal {

    void bark() {
        System.out.println("MyDog barks");
    }
}

public class simple {

    public static void main(String[] args) {

        // Upcasting
        MyAnimal a = new MyDog();
        a.eat();

        // Downcasting
        MyDog d = (MyDog) a;
        d.bark();
    }
}