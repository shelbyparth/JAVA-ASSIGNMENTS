// Group no. 9
//Assignment no. 7
/*
Interface:
An interface is a blueprint of a class.It contains only abstract methods (by default) and constants.
Used for 100% abstraction and multiple inheritance.

Key Points-
Declared using interface keyword
Methods are public abstract by default
Variables are public static final
Supports multiple inheritance
 */

interface SmartDevice {

    void turnOn();
    void turnOff();
}

// Class implementing interface
class Fan implements SmartDevice {

    public void turnOn() {
        System.out.println("Fan is ON");
    }

    public void turnOff() {
        System.out.println("Fan is OFF");
    }
}

// Another class
class Light implements SmartDevice {

    public void turnOn() {
        System.out.println("Light is ON");
    }

    public void turnOff() {
        System.out.println("Light is OFF");
    }
}

// Main class
public class sd {
    public static void main(String[] args) {
        Fan f = new Fan();
        Light l = new Light();

        f.turnOn();
        l.turnOn();
        f.turnOff();
        l.turnOff();
    }
}

/*
Output-
Fan is ON
Light is ON
Fan is OFF
Light is OFF
*/