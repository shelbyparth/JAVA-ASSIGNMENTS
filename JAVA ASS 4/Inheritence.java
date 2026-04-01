// ================================
// SINGLE INHERITANCE
// ================================
class Animal {

    void eat() {
        System.out.println("Animal eats food");
    }
}

class Dog extends Animal {

    void bark() {
        System.out.println("Dog barks");
    }
}

// ================================
// MULTILEVEL INHERITANCE
// ================================
class Puppy extends Dog {

    void weep() {
        System.out.println("Puppy weeps");
    }
}

// ================================
// HIERARCHICAL INHERITANCE
// ================================
class Cat extends Animal {

    void meow() {
        System.out.println("Cat meows");
    }
}

// ================================
// MULTIPLE INHERITANCE (INTERFACES)
// ================================
interface Father {
    void showFather();
}

interface Mother {
    void showMother();
}

class Child implements Father, Mother {

    public void showFather() {
        System.out.println("This is father side");
    }

    public void showMother() {
        System.out.println("This is mother side");
    }
}

// ================================
// HYBRID INHERITANCE
// ================================
interface Pet {
    void play();
}

interface Wild {
    void hunt();
}

class HybridDog extends Animal implements Pet, Wild {

    public void play() {
        System.out.println("Dog plays fetch");
    }

    public void hunt() {
        System.out.println("Dog hunts");
    }
}

// ================================
// MAIN CLASS (DRIVER)
// ================================
public class Inheritance {

    public static void main(String[] args) {
        System.out.println("=== Single Inheritance ===");
        Dog d = new Dog();
        d.eat();
        d.bark();

        System.out.println("\n=== Multilevel Inheritance ===");
        Puppy p = new Puppy();
        p.eat();
        p.bark();
        p.weep();

        System.out.println("\n=== Hierarchical Inheritance ===");
        Cat c = new Cat();
        c.eat();
        c.meow();

        System.out.println("\n=== Multiple Inheritance ===");
        Child ch = new Child();
        ch.showFather();
        ch.showMother();

        System.out.println("\n=== Hybrid Inheritance ===");
        HybridDog hd = new HybridDog();
        hd.eat();
        hd.play();
        hd.hunt();
    }
}
