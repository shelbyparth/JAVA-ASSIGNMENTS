class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}

class CustomExceptionExample {

    static void checkAge(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("Age must be 18 or above.");
        } else {
            System.out.println("Valid Age!");
        }
    }

    public static void main(String[] args) {
        System.out.println("--- Custom Exception Example ---");

        try {
            checkAge(16);
        } 
        catch (InvalidAgeException e) {
            System.out.println("Custom Exception: " + e.getMessage());
        }
    }
}