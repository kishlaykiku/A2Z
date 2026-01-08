/*
Problem Statement: Given an array of size N. Find the highest and lowest frequency element.

Example 1 =>
    Input: ARR_SIZE = 6, ARR[] = {10, 5, 10, 15, 10, 5};
    Output: 10 15
    Explanation: The frequency of 10 is 3, i.e. the highest and the frequency of 15 is 1, i.e. the lowest.


Example 2 =>
    Input: ARR_SIZE = 6, ARR[] = {2, 2, 3, 4, 4, 2};
    Output: 2 3
    Explanation: The frequency of 2 is 3, i.e. the highest and the frequency of 3 is 1, i.e. the lowest
*/

import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;

public class HiLoFreq {

    private static Scanner sc = new Scanner(System.in);

    Map<Integer, Integer> preCompute(int[] arr, int arrSize) {

        Map<Integer, Integer> freq = new HashMap<>();

        for(int i = 0; i < arrSize; i++) {
            freq.put(arr[i], freq.getOrDefault(arr[i], 0) + 1);
        }

        return freq;
    }

    void freqCheck(Map<Integer, Integer> result) {

        int maxFreq = Integer.MIN_VALUE, minFreq = Integer.MAX_VALUE;
        int maxEle = 0, minEle = 0;

        for(Map.Entry<Integer, Integer> entry : result.entrySet()) {
            int element = entry.getKey();
            int count = entry.getValue();

            if(count > maxFreq) {
                maxEle = element;
                maxFreq = count;
            }

            if(count < minFreq) {
                minEle = element;
                minFreq = count;
            }
        }

        System.out.print(maxEle + " " + minEle);
    }

    public static void main(String args[]) {

        HiLoFreq obj = new HiLoFreq();
        int arrSize = sc.nextInt();
        int[] arr = new int[arrSize];

        for(int i = 0; i < arrSize; i++) {
            arr[i] = sc.nextInt();
        }

        Map<Integer, Integer> result = obj.preCompute(arr, arrSize);

        obj.freqCheck(result);
    }
}