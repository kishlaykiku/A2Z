/*
Problem Statement: Given two integers N1 and N2, find their greatest common divisor.

Example 1 =>
    Input: N1 = 9, N2 = 12
    Output: 3
    Explanation:
        Factors of 9: 1, 3, 9
        Factors of 12: 1, 2, 3, 4, 6, 12
        Common Factors: 1, 3
        Greatest common factor: 3 (GCD)

Example 2 =>
    Input: N1 = 20, N2 = 15
    Output: 5
    Explanation:
        Factors of 20: 1, 2, 4, 5, 10, 20
        Factors of 15: 1, 3, 5, 15
        Common Factors: 1, 5
        Greatest common factor: 5 (GCD)
*/

import java.util.Scanner;

public class TwoNosGcd {

    private static Scanner sc = new Scanner(System.in);

    int solution(int a, int b) {

        int gcd = 1;

        // Optimized [Euclidean Algorithm]
        while(a != 0 && b != 0) {

            if(a>b) a = a%b;
            else b = b%a;
        }

        if(a == 0) gcd = b;
        else gcd = a;

        // Brute Force
        // for(int i = 1; i <= Math.min(a, b); i++) {

        //     if(a%i == 0 && b%i == 0) gcd = Math.max(gcd, i);
        // }

        return gcd;
    }

    public static void main(String args[]) {

        TwoNosGcd obj = new TwoNosGcd();
        int a = sc.nextInt();
        int b = sc.nextInt();

        int output = obj.solution(a, b);
        System.out.print(output);
    }
}