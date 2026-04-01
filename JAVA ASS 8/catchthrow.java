class catchthrow {
    public static void main(String[] args) {
        System.out.println("--- Single Catch Example ---");
        
        try {
            int a = 10;
            int b = 0;
            int result = a / b;
            System.out.println("Result: " + result);
        } 
        catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero!");
        }
    }
}
