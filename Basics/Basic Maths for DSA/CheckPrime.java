/*
Problem Statement: Given an integer N, return true if it is a prime else return false.
*/

import java.util.Scanner;

public class CheckPrime {

    private static Scanner sc = new Scanner(System.in);

    boolean solution(int n) {

        boolean isPrime = false;
        int divisorCount = 0;

        if(n < 2) return isPrime = false;

        for(int i = 2; i < Math.sqrt(n); i++) {
            if(n%i == 0) divisorCount++;
            if(divisorCount > 0) break;
        }

        if(divisorCount == 0) isPrime = true;

        return isPrime;
    }

    public static void main(String args[]) {

        CheckPrime obj = new CheckPrime();
        int n = sc.nextInt();
        sc.close();

        boolean output = obj.solution(n);
        System.out.print(output);
    }
}