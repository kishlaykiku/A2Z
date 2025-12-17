/*
Problem Statement: Given a string, check if the string is palindrome or not.
A string is said to be palindrome if the reverse of the string is the same as the string.

Example 1 =>
    Input: Str = "ABCDCBA"
    Output: Palindrome
    Explanation: String when reversed is the same as string.

Example 2 =>
    Input: Str = "TAKE U FORWARD"
    Output: Not Palindrome
    Explanation: String when reversed is not the same as string.
*/

import java.util.Scanner;

public class PrintStringPalindrome {

    private static Scanner sc = new Scanner(System.in);

    void solution(String str) {

        int start = 0;
        int end = str.length()-1;

        boolean output = recursiveCheckPalindrome(str, start, end);

        if(output == true) System.out.print("Palindrome");
        else System.out.print("Not Palindrome");
    }

    boolean recursiveCheckPalindrome(String str, int start, int end) {

        if(start >= end) return true;

        if(str.charAt(start) == str.charAt(end)) return recursiveCheckPalindrome(str, start+1, end-1);
        else return false;
    }

    public static void main(String args[]) {

        PrintStringPalindrome obj = new PrintStringPalindrome();
        String str = sc.nextLine().toUpperCase();
        sc.close();

        obj.solution(str);
    }
}