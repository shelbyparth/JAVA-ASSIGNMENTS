public class MultipleCatch {
     public static void main(String[] args) {
        System.out.println("--- Multiple Catch Example ---");

        try {
            int arr[] = {1, 2, 3};
            System.out.println(arr[0]/0);
        } 
        catch (ArithmeticException e) {
            System.out.println("Arithmetic Error occurred!");
        } 
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array Index Error occurred!");
        } 
        catch (Exception e) {
            System.out.println("Some other error occurred!");
        }
    }
}
