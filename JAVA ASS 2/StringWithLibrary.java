public class StringWithLibrary {

    public static void main(String[] args) {

        String str = "madam";

        // Length
        System.out.println("Length: " + str.length());

        // Uppercase
        System.out.println("Uppercase: " + str.toUpperCase());

        // Reverse using StringBuilder
        String rev = new StringBuilder(str).reverse().toString();
        System.out.println("Reverse: " + rev);

        // Palindrome check
        if(str.equals(rev)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
    }
}

/*
================OUTPUT==================

Microsoft Windows [Version 10.0.26200.7840]
(c) Microsoft Corporation. All rights reserved.

C:\Users\Study\SY SEM 4\Code>cd "c:\Users\Study\SY SEM 4\Code\Java\" && javac StringWithLibrary.java && java StringWithLibrary
Length: 5
Uppercase: MADAM
Reverse: madam
Palindrome

c:\Users\Study\SY SEM 4\Code\Java>


*/