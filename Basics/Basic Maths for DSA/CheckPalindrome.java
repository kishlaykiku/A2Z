/*
Problem Statement: Given an integer N, return true if it is a palindrome else return false.

A palindrome is a number that reads the same backward as forward.
For example, 121, 1331, and 4554 are palindromes because they remain the same when their digits are reversed.

Example 1 =>
    Input: N = 4554
    Output: Palindrome Number
    Explanation: The reverse of 4554 is 4554 and therefore it is palindrome number

Example 2 =>
    Input: N = 7789
    Output: Not Palindrome
    Explanation: The reverse of number 7789 is 9877 and therefore it is not palindrome
*/

import java.util.Scanner;

public class CheckPalindrome {

    private static Scanner sc = new Scanner(System.in);

    boolean solution(int n) {

        boolean pal = false;
        int num = n;
        int lastDigit = 0;
        int reverse = 0;

        while(num != 0) {
            lastDigit = num%10;
            num = num/10;
            reverse = reverse*10 + lastDigit;
        }

        if(reverse == n) pal = true;

        return pal;
    }

    public static void main(String args[]) {

        CheckPalindrome obj = new CheckPalindrome();
        int n = sc.nextInt();

        boolean output = obj.solution(n);
        if(!output)
            System.out.print("Not Palindrome");
        else
            System.out.print("Palindrome");
    }
}