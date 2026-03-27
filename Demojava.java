

import java.util.Scanner;

public class Demojava {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        // Taking name input
        System.out.print("Enter your name: ");
        String name = sc.nextLine();
        
        System.out.println("Name: " + name);
        
        // Taking number input
        System.out.print("Enter the number: ");
        int no = sc.nextInt();
        
        System.out.println("Number: " + no);
        
        // String operations
        System.out.println("Uppercase: " + name.toUpperCase());
        System.out.println("Lowercase: " + name.toLowerCase());
        System.out.println("Length: " + name.length());
       
        
        sc.close();
    }
}



