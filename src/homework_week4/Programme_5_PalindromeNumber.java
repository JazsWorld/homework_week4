package homework_week4;

/**
 * Write a method called isPalindrome with one int parameter called number.
 * The method needs to return a boolean.
 * It should return true if the number is a palindrome number otherwise it should return false.
 * Check the tips below for more info about palindromes.
 * Example Input/Output
 * isPalindrome(-1221); → should return true
 * isPalindrome(707); → should return true
 * isPalindrome(11212); → should return false because the reverse is 21211 and that is not equal to
 * 11212.
 */

import java.util.Scanner;

public class Programme_5_PalindromeNumber {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Create a Scanner

        // Prompt the user to enter an integer
        System.out.print("Enter an integer: ");
        int number = input.nextInt();

        // Report whether the integer is a palindrome.
        System.out.println(number + (isPalindrome(number) ? " is " : " is not ") +
                "a palindrome.");
    }

    // Method isPalindrome returns true if number is a palindrome

    public static boolean isPalindrome(int number) {
        return number == reverse(number) ? true : false;
    }

    // Method reverse returns the reversal of an integer
    public static int reverse(int number) {
        String reverse = "";    // Holds reversed number
        String n = number + ""; // Convert number to string
        // Reverse string
        for (int i = n.length() - 1; i >= 0; i--) {
            reverse += n.charAt(i);
        }
        return Integer.parseInt(reverse); // Return reversed integer
    }
}
