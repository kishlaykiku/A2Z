/*
In Merge Sort, we divide the array into halves recursivley and then merge the sorted halves.
Time Complexity =>
    Best: O(n log n)
    Average: O(n log n)
    Worst: O(n log n)
*/

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class MergeSort {

    private static Scanner sc = new Scanner(System.in);

    void solution(List<Integer> arr) {

        int low = 0;
        int high = arr.size()-1;
        mergeSort(arr, low, high);
    }

    void mergeSort(List<Integer> arr, int low, int high) {

        if(low >= high) return;
        int mid = (low + (high - low))/2;

        mergeSort(arr, low, mid);
        mergeSort(arr, mid+1, high);
        merge(arr, low, mid, high);
    }

    void merge(List<Integer> arr, int low, int mid, int high) {

        List<Integer> temp = new ArrayList<>();
        int left = low;
        int right = mid+1;

        while(left <= mid && right <= high) {
            if(arr.get(left) <= arr.get(right)) {
                temp.add(arr.get(left));
                left++;
            } else {
                temp.add(arr.get(right));
                right++;
            }
        }

        while(left <= mid) {
            temp.add(arr.get(left));
            left++;
        }

        while(right <= high) {
            temp.add(arr.get(right));
            right++;
        }

        for(int i = low; i <= high; i++) {
            arr.set(i, temp.get(i - low));
        }
    }

    public static void main(String args[]) {

        MergeSort obj = new MergeSort();
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