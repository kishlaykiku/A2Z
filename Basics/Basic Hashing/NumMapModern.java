/*
Problem Statement: Count the frequency of numbers using HashMap

Example =>
    Input: ARR_SIZE = 5 || arr[S] = {1, 3, 2, 1, 3} || INP_SIZE = 5 || N = 1, 4, 2, 3, 12
    Output: 2 0 1 2 0
    Explanation: The frequency of 1, 4, 2, 3, 12 in arr is 2, 0, 1, 2, 0.
*/

import java.util.Scanner;
import java.util.HashMap;

public class NumMapModern {

    private static Scanner sc = new Scanner(System.in);

    HashMap<Integer, Integer> preCompute(int arr[], int arrSize) {

        HashMap<Integer, Integer> freq = new HashMap<>();

        for(int i = 0; i < arrSize; i++) {
            freq.put(arr[i], freq.getOrDefault(arr[i], 0) + 1);
        }

        return freq;
    }

    public static void main(String args[]) {

        NumMapModern obj = new NumMapModern();
        int arrSize = sc.nextInt();
        int arr[] = new int[arrSize];

        for(int i = 0; i < arrSize; i++) {
            arr[i] = sc.nextInt();
        }

        HashMap<Integer, Integer> result = obj.preCompute(arr, arrSize);

        int inpSize = sc.nextInt();

        for(int i = 0; i < inpSize; i++) {
            int nFreq = sc.nextInt();
            System.out.print(result.getOrDefault(nFreq, 0));
            if(i < inpSize-1)
                System.out.print(" ");
        }
    }
}