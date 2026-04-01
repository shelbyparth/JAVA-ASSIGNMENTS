class ThrowExample {
    public static void main(String[] args) {
        System.out.println("--- Throw Example ---");

        int age = 15;

        try {
            if (age < 18) {
                throw new ArithmeticException("Not eligible to vote!");
            }
            System.out.println("You can vote!");
        } 
        catch (ArithmeticException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}