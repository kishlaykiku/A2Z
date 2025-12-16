/*
Problem Statement:Given an integer N, return true it is an Armstrong number otherwise return false.
An Amrstrong number is a number that is equal to the sum of its own digits each raised to the power of the number of digits.

Example 1 =>
    Input:N = 153
    Output:True
    Explanation: 1^3+5^3+3^3 = 1 + 125 + 27 = 153

Example 2 =>
    Input:N = 371
    Output: True
    Explanation: 3^3+7^3+1^3 = 27 + 343 + 1 = 371
*/

import java.util.Scanner;

public class CheckArmstrong {

    private static Scanner sc = new Scanner(System.in);

    boolean solution(int n) {

        n = Math.abs(n);
        boolean isArm = false;
        int num = n;
        int digits = 0;
        int lastDigit = 0;
        int sum = 0;

        if(num == 0) return isArm = true;

        // Get digits count
        while(num != 0) {
            num = num/10;
            digits++;
        }

        // Get sum of all digits, each raised to the power of digits count
        num = n;
        while(num != 0) {
            lastDigit = num%10;
            num = num/10;
            sum += Math.pow(lastDigit, digits);
        }

        // Check armstrong equality
        if(sum == n) isArm = true;

        return isArm;
    }

    public static void main(String args[]) {

        CheckArmstrong obj = new CheckArmstrong();
        int n = sc.nextInt();
        sc.close();

        boolean output = obj.solution(n);
        System.out.print(output);
    }
}