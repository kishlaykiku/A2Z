/*
Problem Statement: You are given an array. The task is to reverse the array and print it.

Example =>
    Input: 5 4 3 2 1 q
    Output: [1, 2, 3, 4, 5]
    Explanation: Since the order of elements gets reversed the first element will occupy the fifth position,
    the second element occupies the fourth position and so on.
*/

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class PrintReverseArray {

    private static Scanner sc = new Scanner(System.in);

    void solution(List<Integer> arr) {

        int start = 0;
        int end = arr.size()-1;
        List<Integer> output =  recursiveReverseArray(arr, start, end);

        System.out.print("[");
        for(int i = 0; i < output.size(); i++) {
            System.out.print(output.get(i));
            if(i < output.size()-1)
                System.out.print(", ");
        }
        System.out.print("]");
    }

    List<Integer> recursiveReverseArray(List<Integer> arr, int start, int end) {

        if(start >= end) return arr;

        int temp = arr.get(start);
        arr.set(start, arr.get(end));
        arr.set(end, temp);

        return recursiveReverseArray(arr, start+1, end-1);
    }

    public static void main(String args[]) {

        PrintReverseArray obj = new PrintReverseArray();
        List<Integer> arr = new ArrayList<>();
        int element = 0;

        while(sc.hasNext()) {
            if(sc.hasNextInt()) {
                element = sc.nextInt();
                arr.add(element);
            } else {
                String input = sc.next();
                if(input.equalsIgnoreCase("q")) // When input is "q", loop will stop
                    break;
            }
        }
        sc.close();

        obj.solution(arr);
    }
}