/*
Problem Statement: Given an array of N integers, write a program to implement the Recursive Bubble Sort algorithm.

Example 1 =>
    Input: arr_size = 6, arr[] = {13, 46, 24, 52, 20, 9}
    Output: 9, 13, 20, 24, 46, 52
    Explanation: After sorting we get 9, 13, 20, 24, 46, 52

Example 2 =>
    Input: arr_size = 5, arr[] = {5, 4, 3, 2, 1}
    Output: 1, 2, 3, 4, 5
    Explanation: After sorting we get 1, 2, 3, 4, 5
*/

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
public class BubbleSortRec {

    private static Scanner sc = new Scanner(System.in);

    void solution(List<Integer> arr) {

    }

    public static void main(String args[]) {

        BubbleSortRec obj = new BubbleSortRec();
        List<Integer> arr = new ArrayList<>();

        while(sc.hasNext()) {
            if(sc.hasNextInt()) {
                int number = sc.nextInt();
                arr.add(number);
            } else {
                String input = sc.next();
                if(input.equalsIgnoreCase("q")) // When input is "q", loop will stop
                    break;
            }
        }
        sc.close();

        obj.solution(arr);

        // Output
        for(int i = 0; i < arr.size(); i++) {
            System.out.print(arr.get(i));
            if(i < arr.size()-1)
                System.out.print(" ");
        }
    }
}