/*

Time Complexity =>
    Best: 
    Average: 
    Worst: 
*/

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class MergeSort {

    private static Scanner sc = new Scanner(System.in);

    void solution(List<Integer> arr) {

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