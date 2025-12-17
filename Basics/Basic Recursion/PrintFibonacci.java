/*
Problem Statement: Given an integer N. Print the Fibonacci series up to the Nth term.
The Fibonacci sequence is a series of numbers where each number is the sum of the two preceding ones.

Example 1 =>
    Input: N = 5
    Output: 0 1 1 2 3 5
    Explanation: 0 1 1 2 3 5 is the fibonacci series up to 5th term (0 based indexing).

Example 2 =>
    Input: 6
    Output: 0 1 1 2 3 5 8
    Explanation: 0 1 1 2 3 5 8 is the fibonacci series upto 6th term (o based indexing).
*/

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class PrintFibonacci {

    private static Scanner sc = new Scanner(System.in);

    void solution(int n) {

        List<Integer> arr = new ArrayList<>();
        int it = 2;

        if(n == 0) {
            arr.add(0);
        }
        else {
            arr.add(0);
            arr.add(1);
        }

        List<Integer> output = recursiveFibonacciDisplay(arr, it, n);

        for(int i = 0; i < output.size(); i++) {
            System.out.print(output.get(i));
            if(i < output.size()-1)
                System.out.print(" ");
        }
    }

    List<Integer> recursiveFibonacciDisplay(List<Integer> arr, int it, int n) {

        if(it > n) return arr;
        arr.add(it, arr.get(it-1) + arr.get(it-2));
        return recursiveFibonacciDisplay(arr, it+1, n);
    }

    public static void main(String args[]) {

        PrintFibonacci obj = new PrintFibonacci();
        int n = sc.nextInt();
        sc.close();

        obj.solution(n);
    }
}