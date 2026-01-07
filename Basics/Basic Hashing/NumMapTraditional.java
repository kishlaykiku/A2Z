/*
Problem Statement: Count the frequency of numbers [N cannot exceed 12]

Example =>
    Input: S = 5 || arr[S] = {1, 3, 2, 1, 3} || INP = 5 || N = 1, 4, 2, 3, 12
    Output: 2 0 1 2 0
    Explanation: The frequency of 1, 4, 2, 3, 12 in arr is 2, 0, 1, 2, 0.
*/

import java.util.Scanner;

public class NumMapTraditional {

    private static Scanner sc = new Scanner(System.in);

    int solution(int nFreq, int[] arr) {

        int[] freq = new int[13];

        for(int i = 0; i < arr.length; i++) {
            freq[arr[i]]++;
        }

        return freq[nFreq];
    }

    public static void main(String args[]) {

        NumMapTraditional obj = new NumMapTraditional();
        int arrSize = sc.nextInt();
        int[] arr = new int[arrSize];

        for(int i = 0; i < arrSize; i++)
            arr[i] = sc.nextInt();

        int inpSize = sc.nextInt();

        for(int i = 0; i < inpSize; i++) {
            int nFreq = sc.nextInt();
            System.out.print(obj.solution(nFreq, arr));
            if(i < inpSize-1)
                System.out.print(" ");
        }
        sc.close();
    }
}