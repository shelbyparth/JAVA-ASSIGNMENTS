import java.io.*;
import java.util.Scanner;

public class FileHandlingDemo {

    public static void main(String[] args) {
        String fileName = "demo.txt";

        // CREATE FILE
        try {
            File file = new File(fileName);

            if (file.createNewFile()) {
                System.out.println("File created: " + file.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("Error while creating file.");
        }

        // WRITE TO FILE (overwrite)
        try {
            FileWriter writer = new FileWriter(fileName);

            writer.write("Hello Swapnil!\n");
            writer.write("This is File Handling in Java.\n");

            writer.close();
            System.out.println("Data written successfully.");
        } catch (IOException e) {
            System.out.println("Error while writing.");
        }

        // APPEND TO FILE
        try {
            FileWriter writer = new FileWriter(fileName, true); // true = append mode

            writer.write("Appending new line...\n");

            writer.close();
            System.out.println("Data appended successfully.");
        } catch (IOException e) {
            System.out.println("Error while appending.");
        }

        // READ FILE
        try {
            File file = new File(fileName);
            Scanner reader = new Scanner(file);

            System.out.println("\n--- File Content ---");

            while (reader.hasNextLine()) {
                System.out.println(reader.nextLine());
            }

            reader.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
        }

        // DELETE FILE (optional - uncomment if needed)
        /*
        File file = new File(fileName);

        if (file.delete()) {
            System.out.println("File deleted successfully.");
        } else {
            System.out.println("Failed to delete file.");
        }
        */
    }
}
