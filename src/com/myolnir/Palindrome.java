package com.myolnir;

import java.util.Scanner;

public class Palindrome {

    public static void main(String[] args) {
        String original;
        Scanner in=new Scanner(System.in);
        System.out.print("Enter a String: ");
        original=in.nextLine();
        if (isPalindrome(original)) {
            System.out.println("The string is a palindrome");
        } else {
            System.out.println("The string is not a palindrome");
        }

        if (isPalindromeDefaultJava(original)) {
            System.out.println("The string is a palindrome");
        } else {
            System.out.println("The string is not a palindrome");
        }

    }


    /**
     * Checks if the given string is a palindrome.
     *
     * @param originalString the original string
     * @return whether the given string a palindrome or not
     */
    static boolean isPalindrome(final String originalString) {
        String formattedInput = originalString.toLowerCase().replaceAll("\\s+", "");
        int stringLength = formattedInput.length();
        int halfStringLength = stringLength/2;
        int j = stringLength - 1;
        for(int i=0; i<halfStringLength; i++) {
            if(formattedInput.charAt(i) != formattedInput.charAt(j)) {
                return false;
            }
            j--;
        }
        return true;
    }


    /**
     * Same algorithm but with default reverse method from StringBuilder java class.
     * @param originalString the original string
     * @return wheter the given string a palindrome or not
     */
    static boolean isPalindromeDefaultJava(final String originalString) {
        return originalString.equals(new StringBuilder(originalString).reverse().toString());
    }
}
