/*
Problem Statement: Count the frequency of characters

Example =>
    Input: str = "abcdabefc" || inpSize = 4 || charCheck = a, c, f, z
    Output: 2 2 1 0
    Explanation: The frequency of a, c, f, z in arr is 2, 2, 1, 0.
*/

import java.util.Scanner;

public class CharMapTraditional {

    private static Scanner sc = new Scanner(System.in);

    void solution(char charCheck, String str) {

        char start = 'a';
        int[] freq = new int[26];

        for(int i = 0; i < str.length(); i++) {
            freq[str.charAt(i)-start]++;
        }

        System.out.print(freq[charCheck - start]);
    }

    public static void main(String args[]) {

        CharMapTraditional obj = new CharMapTraditional();
        String str = sc.nextLine();
        int inpSize = sc.nextInt();

        for(int i = 0; i < inpSize; i++) {
            char charCheck = sc.next().charAt(0);
            obj.solution(charCheck, str);
            if(i < inpSize-1)
                System.out.print(" ");
        }
        sc.close();
    }
}