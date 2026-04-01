package com.studyopedia;
class Animal {
    void sound() {
        System.out.println("Animal sound");
    }
}

class Cat extends Animal {
    void sound() {
    super.sound();
        System.out.println("Cat meows");
    }
}

public class Dyn {
    public static void main(String[] args) {

        Animal a;
        a = new Cat();
        a.sound();   // Calls Cat's method
    }
}