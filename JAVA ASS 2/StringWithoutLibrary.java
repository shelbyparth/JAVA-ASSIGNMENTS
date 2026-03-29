public class StringWithoutLibrary {

    public static void main(String[] args) {

        String str = "madam";

        // Length manually
        int length = 0;
        for(char _ : str.toCharArray()) {
            length++;
        }
        System.out.println("Length: " + length);

        // Uppercase manually
        char[] arr = str.toCharArray();
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] >= 'a' && arr[i] <= 'z') {
                arr[i] = (char)(arr[i] - 32);
            }
        }
        System.out.println("Uppercase: " + new String(arr));

        // Reverse manually
        String rev = "";
        for(int i = str.length()-1; i >= 0; i--) {
            rev += str.charAt(i);
        }
        System.out.println("Reverse: " + rev);

        // Palindrome manually
        boolean flag = true;
        for(int i = 0; i < str.length()/2; i++) {
            if(str.charAt(i) != str.charAt(str.length()-1-i)) {
                flag = false;
                break;
            }
        }

        if(flag) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
    }
}

/*
========================OUTPUT:-======================

c:\Users\Study\SY SEM 4\Code\Java>cd "c:\Users\Study\SY SEM 4\Code\Java\" && javac StringWithoutLibrary.java && java StringWithoutLibrary
Length: 5
Uppercase: MADAM
Reverse: madam
Palindrome


*/

