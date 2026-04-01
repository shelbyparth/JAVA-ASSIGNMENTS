package com.studyopedia;
//Parent Class
class Animal {
 void sound() {
     System.out.println("Animal makes a sound");
 }
}

//Child Class
class Dog extends Animal {
 void sound() {
	 super.sound();
     System.out.println("Dog barks");
 }
}

public class Mo {
 public static void main(String[] args) {

     Animal obj;        // Reference of parent class
     obj = new Dog();   // Object of child class

     obj.sound();       // Calls child class method
 }
}