/*
In Insertion Sort, we take an element and place it in the correct order by shifting.
Time Complexity =>
    Best: O(n)
    Average: O(n^2)
    Worst: O(n^2)
*/

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class InsertionSort {

    private static Scanner sc = new Scanner(System.in);

    void solution(List<Integer> arr) {

        for(int i = 0; i < arr.size()-1; i++) {
            int key = arr.get(i+1);
            int j = i;
            while(j >= 0 && key < arr.get(j)) {
                arr.set(j+1, arr.get(j));
                j--;
            }
            arr.set(j+1, key);
        }
    }

    public static void main(String args[]) {

        InsertionSort obj = new InsertionSort();
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