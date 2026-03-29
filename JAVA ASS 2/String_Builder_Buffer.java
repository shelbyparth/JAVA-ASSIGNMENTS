public class String_Builder_Buffer {

    // String Operations
    static void stringOperations() {
        String str = "Java Programming";

        System.out.println("Length: " + str.length());
        System.out.println("Uppercase: " + str.toUpperCase());
        System.out.println("Lowercase: " + str.toLowerCase());
        System.out.println("Character at 2: " + str.charAt(2));
        System.out.println("Substring (0-4): " + str.substring(0, 4));
        System.out.println("Replace: " + str.replace("Java", "Core Java"));
    }

    // StringBuffer Operations
    static void stringBufferOperations() {
        StringBuffer sb = new StringBuffer("Hello");

        sb.append(" World");
        sb.insert(5, " Java");
        sb.delete(5, 10);
        sb.reverse();

        System.out.println("StringBuffer Result: " + sb);
    }

    // StringBuilder Operations
    static void stringBuilderOperations() {
        StringBuilder sb = new StringBuilder("Welcome");

        sb.append(" to Java");
        sb.insert(7, " Core");
        sb.delete(7, 12);
        sb.reverse();

        System.out.println("StringBuilder Result: " + sb);
    }

    public static void main(String[] args) {

        System.out.println("----- STRING OPERATIONS -----");
        stringOperations();

        System.out.println("\n----- STRINGBUFFER OPERATIONS -----");
        stringBufferOperations();

        System.out.println("\n----- STRINGBUILDER OPERATIONS -----");
        stringBuilderOperations();
    }
}


/*

==========================   OUTPUT :-  =====================

c:\Users\Study\SY SEM 4\Code\Java>cd "c:\Users\Study\SY SEM 4\Code\Java\" && javac String_Builder_Buffer.java && java String_Builder_Buffer
----- STRING OPERATIONS -----
Length: 16
Uppercase: JAVA PROGRAMMING
Lowercase: java programming
Character at 2: v
Substring (0-4): Java
Replace: Core Java Programming

----- STRINGBUFFER OPERATIONS -----
StringBuffer Result: dlroW olleH

----- STRINGBUILDER OPERATIONS -----
StringBuilder Result: avaJ ot emocleW

c:\Users\Study\SY SEM 4\Code\Java>

*/