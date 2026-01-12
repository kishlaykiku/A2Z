/* In selection sort, we select the minimum element and start placing them from the beginning of the unsorted array. 
Time Complexity:
    Best: [O(n^2)]
    Average: [O(n^2)]
    Worst: [O(n^2)]
*/

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class SelectionSort {

    private static Scanner sc = new Scanner(System.in);

    void solution(List<Integer> arr) {

        for(int i = 0; i < arr.size()-1; i++) {
            int minIndex = i;
            for(int j = i+1; j < arr.size(); j++) {
                if(arr.get(j) < arr.get(minIndex)) {
                    minIndex = j;
                }
            }
            int temp = arr.get(i);
            arr.set(i, arr.get(minIndex));
            arr.set(minIndex, temp);
        }
    }

    public static void main(String args[]) {

        SelectionSort obj = new SelectionSort();
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