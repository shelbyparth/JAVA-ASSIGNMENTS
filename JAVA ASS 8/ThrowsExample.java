import java.io.*;

class ThrowsExample {

    static void readFile() throws IOException {
        FileReader file = new FileReader("test.txt");
    }

    public static void main(String[] args) {
        System.out.println("--- Throws Example ---");

        try {
            readFile();
        } 
        catch (IOException e) {
            System.out.println("File not found!");
        }
    }
}