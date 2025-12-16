/*
Problem Statement: Given an integer N return the reverse of the given number.

Note: If a number has trailing zeros, then its reverse will not include them.
For e.g , reverse of 10400 will be 401 instead of 00401.

Example =>
    Input: N = 12345
    Output: 54321
    Explanation: The reverse of 12345 is 54321.
*/

import java.util.Scanner;

public class ReverseDigits {

    public static Scanner sc = new Scanner(System.in);

    int solution(int n) {

        int reverse = 0;

        while (n != 0) {
            int lastDigit = n%10;
            n = n/10;
            reverse = reverse*10 + lastDigit;
        }

        return reverse;
    }

    public static void main(String args[]) {

        ReverseDigits obj = new ReverseDigits();
        int n = sc.nextInt();
        sc.close();

        int output = obj.solution(n);
        System.out.print(output);
    }
}