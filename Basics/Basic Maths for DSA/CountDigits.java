/*
Problem Statement: Given an integer N, return the number of digits in N.

Example =>
    Input: N = 12345
    Output: 5
    Explanation:  The number 12345 has 5 digits.
*/

import java.util.Scanner;

public class CountDigits {

    private static Scanner sc = new Scanner(System.in);

    int solution(int n) {

        int count = 0;

        while(n > 0) {
            n = n/10;
            count++;
        }

        return count;
    }

    public static void main(String args[]) {

        CountDigits obj = new CountDigits();
        int n = sc.nextInt();
        sc.close();

        n = Math.abs(n);
        int output = obj.solution(n);
        System.out.print(output);
    }
}