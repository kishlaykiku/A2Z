/*
Problem Statement: Given an integer N, return all divisors of N.
A divisor of an integer N is a positive integer that divides N without leaving a remainder.
In other words, if N is divisible by another integer without any remainder, then that integer is considered a divisor of N.

Example 1 =>
    Input: N = 36
    Output: [1, 2, 3, 4, 6, 9, 12, 18, 36]
    Explanation: The divisors of 36 are 1, 2, 3, 4, 6, 9, 12, 18, 36

Example 2 =>
    Input: N = 12
    Output: [1, 2, 3, 4, 6, 12]
    Explanation: The divisors of 12 are 1, 2, 3, 4, 6, 12
*/

import java.util.Scanner;
import java.util.Collections;
import java.util.List;
import java.util.ArrayList;

public class GetDivisors {

    private static Scanner sc = new Scanner(System.in);

    List<Integer> solution(int n) {

        List<Integer> divisors = new ArrayList<>();

        // Optimized
        for(int i = 1; i <= Math.sqrt(n); i++) {
            if(n%i == 0) {
                divisors.add(i);
                if(i != n/i)
                    divisors.add(n/i);
            }
        }
        Collections.sort(divisors);

        // Brute force
        // for(int i = 1; i <= n; i++) {
        //     if(n%i == 0) divisors.add(i);
        // }

        return divisors;
    }

    public static void main(String args[]) {

        GetDivisors obj = new GetDivisors();
        int n = sc.nextInt();
        sc.close();

        List<Integer> output = obj.solution(n);

        System.out.print("[");
        for(int i = 0; i < output.size(); i++) {
            System.out.print(output.get(i));
            if(i < output.size()-1) System.out.print(", ");
        }
        System.out.print("]");
    }
}