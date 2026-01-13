/*
In Bubble Sort, we push the maximum element to the end of the array by adjacent swapping.
Time Complexity =>
    Best: [O(n)]
    Average: [O(n^2)]
    Worst: [O(n^2)]
*/

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class BubbleSort {

    private static Scanner sc = new Scanner(System.in);

    void solution(List<Integer> arr) {

        for(int i = 0; i < arr.size()-1; i++) {
            boolean swapped = false;
            for(int j = 0; j < arr.size()-i-1; j++) {
                if(arr.get(j) > arr.get(j+1)) {
                    int temp = arr.get(j);
                    arr.set(j, arr.get(j+1));
                    arr.set(j+1, temp);
                    swapped = true;
                }
            }
            if(!swapped) break;
        }
    }

    public static void main(String args[]) {

        BubbleSort obj = new BubbleSort();
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